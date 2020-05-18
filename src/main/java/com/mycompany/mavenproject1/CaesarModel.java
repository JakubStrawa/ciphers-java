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
public class CaesarModel {
    private String msg;
    private int key;
    private Boolean isEncrypted; // Flag showing if we have encrypted or decoded message
    
    public CaesarModel(){
        key = 0;
        msg = "";
        isEncrypted = false; //default value is message to encode
    }
    
    public int getKey(){
        return key;
    }
    
    public String getMessage(){
        return msg;
    }
    
    public Boolean getIsEncrypted(){
        return isEncrypted;
    }
    
    public void setKey(int k){
        while (k < 0){
            k = 26+k;
        }
        key = k;
    }
    
    public void setMessage(String s){
        msg = s.trim().toLowerCase();
    }
    
    public void setIsEncrypted(boolean f){
        isEncrypted = f;
    }
    
    public void changeMessage(){
        String tmp_string = "";
        char tmp_char;
        if (isEncrypted){ //message decrypter
            for(int i = 0; i < msg.length(); i++){
                tmp_char = msg.charAt(i);
                if (tmp_char > 96 && tmp_char < 123) {
                    tmp_char = (char) (122 + (tmp_char-key-122) % 26);
                }
                tmp_string += tmp_char;
            }
        } else { //message encrypter
            for(int i = 0; i < msg.length(); i++){
                tmp_char = msg.charAt(i);
                if (tmp_char > 96 && tmp_char < 123) {
                    tmp_char = (char) (97 + (tmp_char+key-97) % 26);
                }
                tmp_string += tmp_char;
            }
        }
        msg = tmp_string;
        isEncrypted = !isEncrypted;
        System.out.println("New message is : " + msg);
    }
}