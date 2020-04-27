/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author kuba
 */
public class AES {
    private String message;
    private boolean isEncoded;
    private int keySize;
    private char [] block, key;
        
    
    public AES(String msg, String k, int size, boolean b){
        block = new char[16];
        keySize = size;
        if (size != 128 && size != 192 && size != 256) {
            keySize = 128;
        }
        key = new char[keySize/8];
        message = msg;
        fillTable(block, 16, msg);
        fillTable(key, keySize/8, k);
        isEncoded = b;
        //String result = toHex(message.getBytes());
        //System.out.println(result);
    }
    
    private void keyExpansion(){
        
    }
    private void addRoundKey(){
        
    }
    private void subBytes(){
        
    }
    private void shiftRows(){
        
    }
    private void mixColumns(){
        
    }
    
    private void fillTable(char [] tab, int size, String key){
        for (int i = 0; i < size; i++) {
            try {
                tab[i] = key.charAt(i);
            } catch (Exception e) {
                tab[i] = ' ';
            }
        }
    }
    
    public String getMessage(){
        return message;
    }
    
    public void setMessage(String s){
        message = s;
    }
    
    public boolean getIsEncoded(){
        return isEncoded;
    }
    
    private String toHex(byte [] bytes){
        String result = "";
        int decimal = 0;
        String hex = "";
        for (byte b : bytes) {
            decimal = (int) b & 0xff;
            hex = Integer.toHexString(decimal);
            result += hex;
        }
        return result;
    }
    
    public void changeMessage(){
        int rounds = 10;
        if (keySize == 256) {
            rounds = 14;
        } else if (keySize == 192) {
            rounds = 12;
        } 
        keyExpansion();
        addRoundKey();
        for (int i = 0; i < rounds - 1; i++) {
            subBytes();
            shiftRows();
            mixColumns();
            addRoundKey();
        }
        subBytes();
        shiftRows();
        addRoundKey();
    }
    
}
