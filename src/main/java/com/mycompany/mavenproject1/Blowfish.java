/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author kuba
 */
public class Blowfish {
    private String message;
    private byte [] block;
    private byte [] key;
    private boolean isEncrypted;
    private ArrayList<Integer> subkeys, mixedSubkeys;
    
    public Blowfish(String mes, String k, boolean b, int size){
        isEncrypted = b;
        
        fillBlock(mes);
        fillKey(k);
        
        subkeys = new ArrayList<Integer>();
        subkeys.add(0x243f6a88);
        subkeys.add(0x85a308d3);
        subkeys.add(0x13198a2e);
        subkeys.add(0x03707344);
        subkeys.add(0xa4093822);
        subkeys.add(0x299f31d0);
        subkeys.add(0x082efa98);
        subkeys.add(0xec4e6c89);
        subkeys.add(0x452821e6);
        subkeys.add(0x38d01377);
        subkeys.add(0xbe5466cf);
        subkeys.add(0x34e90c6c);
        subkeys.add(0xc0ac29b7);
        subkeys.add(0xc97c50dd);
        subkeys.add(0x3f84d5b5);
        subkeys.add(0xb5470917);
        subkeys.add(0x9216d5d9);
        subkeys.add(0x8979fb1b);
        mixedSubkeys = new ArrayList<Integer>();

        mixSubkeys(key);
        changeMessage();
    }
    
    private void mixSubkeys(byte[] key){
        int temp = 0;
        int sum = 0;
        for (Integer i : subkeys) {
            if (temp >= key.length) {
                temp = 0;
            }
            sum = key[temp] << 24;
            sum += key[temp+1] << 16;
            sum += key[temp+2] << 8;
            sum += key[temp+3];
            mixedSubkeys.add(i ^ sum);
            temp += 4;
        }
    }
    
    private void fillKey(String k){
        String temp = k;
        if (k.length() > 56) {
            temp = k.substring(0, 56);
        }
        if ((temp.length() % 4) != 0) {
            temp = k.substring(0, 4 * (k.length()/4));
        }
        key = new byte[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            key[i] = (byte) temp.charAt(i);
        }
    }
    
    private void fillBlock(String s){
        String temp = s;
        if (s.length() != 8) {
            try {
                temp = s.substring(0, 8);
            } catch (Exception e) {
                temp = temp.concat("        ");
                fillBlock(temp);
            }
        }
        message = temp;
        block = new byte[8];
        for (int i = 0; i < 8; i++) {
            block[i] = (byte) temp.charAt(i);
        }
    }
    
    private int sumTable(byte [] tab){
        int sum = 0;
        sum = tab[0] << 24;
        sum += tab[1] << 16;
        sum += tab[2] << 8;
        sum += tab[3];
        return sum;
    }
    private int sumBitsTable(byte [] tab){
        int sum = 0;
        sum = tab[0] << 7;
        sum += tab[1] << 6;
        sum += tab[2] << 5;
        sum += tab[3] << 4;
        sum += tab[4] << 3;
        sum += tab[5] << 2;
        sum += tab[6] << 1;
        sum += tab[7];
        return sum;
    }
    
    private int fFunction(String s){
        //char [] tab = s.toCharArray();
        String str = s;
        byte [] box1,box2,box3,box4;
        int sum1,sum2,sum3,sum4;
        long modulo = 1L;
        for (int i = 0; i < 32; i++) {
            modulo = modulo << 1;
        }
        int s1,s2,s3;
        if (str.length() == 32) {
            sum1 = sumBitsTable(str.substring(0, 8).getBytes());
            sum2 = sumBitsTable(str.substring(8, 16).getBytes());
            sum3 = sumBitsTable(str.substring(16, 24).getBytes());
            sum4 = sumBitsTable(str.substring(24, 32).getBytes());
        } else if (s.length() < 32) {
            while (str.length() != 32) {                
                str = "0" + str;
            }
            sum1 = sumBitsTable(str.substring(0, 8).getBytes());
            sum2 = sumBitsTable(str.substring(8, 16).getBytes());
            sum3 = sumBitsTable(str.substring(16, 24).getBytes());
            sum4 = sumBitsTable(str.substring(24, 32).getBytes());
        } else {
            System.err.println("Array longer than 32");
            return 0;
        }
        s1 = (int) ((sum2 + sum1) % modulo);
        s2 = sum3 ^ s1;
        s3 = (int) ((s2 + sum4) % modulo);
        System.out.println(s3);

        return s3;
    }
    
    public void changeMessage(){
        byte [] lBlock, rBlock;
        String left,right;
        lBlock = new byte[4];
        rBlock = new byte[4];
        long leftSum = 0L;
        long rightSum = 0L;
        long tempSum = 0L;
        lBlock[0] = block[0];
            lBlock[1] = block[1];
            lBlock[2] = block[2];
            lBlock[3] = block[3];
            rBlock[0] = block[4];
            rBlock[1] = block[5];
            rBlock[2] = block[6];
            rBlock[3] = block[7];
            leftSum = sumTable(lBlock);
            rightSum = sumTable(rBlock);
        for (int i = 0; i < 16; i++) {
            
            leftSum = leftSum ^ mixedSubkeys.get(i);
            tempSum = leftSum;
            leftSum = fFunction(Integer.toBinaryString((int)leftSum));
            leftSum = leftSum ^ rightSum;
            rightSum = tempSum;
//            left = Integer.toBinaryString(leftSum);
//            right = Integer.toBinaryString(rightSum);
            System.out.println(leftSum +"  "+rightSum);
//            while (left.length() != 32) {                
//                left = "0" + left;
//            }
//            while (right.length() != 32) {                
//                right = "0" + right;
//            }
        }
        leftSum ^= mixedSubkeys.get(17);
        rightSum ^= mixedSubkeys.get(16);
        System.out.println(leftSum +"  "+rightSum);
        long finalResult = 0L;
        finalResult += rightSum;
        finalResult = finalResult << 32;
        finalResult += leftSum;
        System.out.println("Fianl code: " + finalResult);
    }
    
}
