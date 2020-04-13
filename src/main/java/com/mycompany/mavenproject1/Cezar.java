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
public class Cezar {
    private String msg;
    private int key;
    private Boolean isEncrypted; // Flag showing if we have encrypted or decoded message
    public Cezar(int k, String m, Boolean f){
        while (k < 0){
            k = 26+k;
        }
        key = k;
        msg = m.toLowerCase();
        if (f) { // if f is true we have message to decode
            isEncrypted = true;
        } else { // if f is false we have message to encrypt
            isEncrypted = false;
        }
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
    public void changeMessage(){
        String tmp_string ="";
        char tmp_char;
        if (isEncrypted){ //message decoder
            for(int i = 0; i < msg.length(); i++){
                tmp_char = msg.charAt(i);
                if (tmp_char > 96 && tmp_char < 123) {
                    tmp_char = (char) (122 + (tmp_char-key-122) % 26);
                }
                tmp_string += tmp_char;
            }
        } else { //message encrypther
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
