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
    private char [] block, key;
        
    
    public AES(String msg, String k, int size, boolean b){
        block = new char[16];
        if (size != 128 || size != 192 || size != 256) {
            size = 128;
        }
        key = new char[size/8];
        message = msg;
        for (int i = 0; i < 16; i++) {
            block[i] = msg.charAt(i);
        }
        for (int j = 0; j < size/8; j++) {
            key[j] = k.charAt(j);
        }
        isEncoded = b;
        //String result = toHex(message.getBytes());
        //System.out.println(result);
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
        
    }
    
}
