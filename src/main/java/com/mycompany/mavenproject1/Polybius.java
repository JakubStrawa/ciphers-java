/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Arrays;

/**
 *
 * @author kuba
 */
public class Polybius {
    private String msg;
    private char[] table = {'a','b','c','d','e','f','g','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private Boolean isEncrypted; // Flag showing if we have encrypted or decoded message
    
    public Polybius(String m, Boolean f){
        msg = m.toLowerCase();
        isEncrypted = f;   
    }
    
    public String getMessage(){
        return msg;
    }
    public Boolean getIsEncrypted(){
        return isEncrypted;
    }
     
    public void changeMessage(){
        String tmp_string ="";
        char tmp_char1, tmp_char2;
        int tmp_int1, tmp_int2;
        if (isEncrypted){ //message decoder
//            if (msg.length() % 2 != 0) {
//                System.out.println("Wrong message");
//            }
            for(int i = 0; i < msg.length(); i = i+2){
                
                tmp_char1 = msg.charAt(i);
                if (tmp_char1 > '0' && tmp_char1 < '6') {
                    tmp_char2 = msg.charAt(i+1);
                   
                    tmp_int1 = (int) tmp_char1 - '0';
                    tmp_int2 = (int) tmp_char2 - '0';
                    tmp_int2 = ((tmp_int1 - 1) * 5) + tmp_int2 - 1;
                    tmp_string += table[tmp_int2];
                } else {
                    i++;
                }
                
                
            }
        } else { //message encrypther
            for(int i = 0; i < msg.length(); i++){
                
                tmp_char1 = msg.charAt(i);
                if (tmp_char1 >= 'a' && tmp_char1 <= 'z') {
                    if (tmp_char1 == 'j') {   // polybius square uses 'i' as 'i' and 'j'
                        tmp_char1--;  
                    }
                    tmp_int1 = (Arrays.binarySearch(table, tmp_char1) / 5) + 1;
                    tmp_int2 = (Arrays.binarySearch(table, tmp_char1) % 5) + 1;
                    tmp_string += tmp_int1;
                    tmp_string += tmp_int2;
                    tmp_string += ' ';
                }
                
            }
        }
        msg = tmp_string;
        isEncrypted = !isEncrypted;
        System.out.println("New message is : " + msg);
    }
}
