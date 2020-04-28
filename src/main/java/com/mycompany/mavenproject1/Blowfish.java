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
    
    private void fFunction(String s){
        System.out.println(s);
    }
    
    public void changeMessage(){
        byte [] lBlock, rBlock;
        lBlock = new byte[4];
        rBlock = new byte[4];
        int leftSum = 0;
        int rightSum = 0;
        //for (int i = 0; i < 16; i++) {
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
            leftSum = leftSum ^ mixedSubkeys.get(0);
            fFunction(Integer.toBinaryString(leftSum));
            
            
        //}
    }
    
}
