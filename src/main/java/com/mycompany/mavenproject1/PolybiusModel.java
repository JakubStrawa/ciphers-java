/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author kuba
 */
public class PolybiusModel {
    private String msg;
    private Character [] table = {'a','b','c','d','e','f','g','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private Boolean isEncrypted; // Flag showing if we have encrypted or decoded message
    private int currentChar;
    private Boolean flagSBS;
    private Boolean flagNextStep;
    
    public PolybiusModel(){
        msg = "";
        isEncrypted = false;
        currentChar = 0;
        flagSBS = false;
        flagNextStep = false;
    }

    public void setFlagSBS(Boolean f) {
        flagSBS = f;
    }

    public Boolean getFlagSBS() {
        return flagSBS;
    }

    public void setFlagNextStep(Boolean f) {
        flagNextStep = f;
    }

    public Boolean getFlagNextStep() {
        return flagNextStep;
    }
    
    public void setTable(String str){  //uzyc array list
        char tmp_char;
        ArrayList<Character> tmp_table = new ArrayList<Character>();
        try {
            tmp_table.add(str.charAt(0));
        } catch (Exception e) {
            Character [] tab = {'a','b','c','d','e','f','g','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
            table = tab;
            return;
        }
        
        for (int i = 1; i < str.length(); i++) {
            tmp_char = str.charAt(i);
            if (tmp_char >= 'a' && tmp_char <= 'z') {
               if (tmp_char == 'j') {   // polybius square uses 'i' as 'i' and 'j'
                    tmp_char--;  
                }
                if (! tmp_table.contains(tmp_char)) {   
                    tmp_table.add(tmp_char);
                } 
            }
        }
        if (tmp_table.size() < 25) {
            for (int j = 0; j < table.length; j++) {
                if (! tmp_table.contains(table[j])) {
                    tmp_table.add(table[j]);
                }
            }
        }
        Character[] tab = tmp_table.toArray(new Character[tmp_table.size()]);
        table = tab;
    }
    
    public void setMessage(String s){
        msg = s.trim().toLowerCase();
    }
    
    public void setIsEncrypted(boolean f){
        isEncrypted = f;
    }
    
    public String getMessage(){
        return msg;
    }
    
    public Boolean getIsEncrypted(){
        return isEncrypted;
    }
    
    public Character[] getTable(){
        return table;
    }
        
    private int search(Character[] table, Character key){
        for (int i = 0; i < table.length; i++) {
            if (table[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
    private void changeChar(){
        String tmp_string = "";
        String sub1 = "", sub2 = ""; 
        int tmp_int1, tmp_int2;
        if (isEncrypted) {
            
            char tmp_char1 = msg.charAt(currentChar);
            while (tmp_char1 < '1' || tmp_char1 > '5') {   // For reading number with spaces eg. "12 34 25"
                if (currentChar == msg.length()) {
                    return;
                }
                currentChar++;
                tmp_char1 = msg.charAt(currentChar);
            }
            char tmp_char2 = msg.charAt(currentChar+1);
            tmp_int1 = (int) tmp_char1 - '0';
            tmp_int2 = (int) tmp_char2 - '0';
            tmp_int2 = ((tmp_int1 - 1) * 5) + tmp_int2 - 1;
            tmp_string += table[tmp_int2];
            if (currentChar == 0) {
                sub1 = msg.substring(3);
                msg = tmp_string + sub1;

            } else if (currentChar == msg.length()-2) {
                sub1 = msg.substring(0, currentChar);
                msg = sub1 + tmp_string;
            } else {
                sub1 = msg.substring(0, currentChar);
                sub2 = msg.substring(currentChar+3);
                msg = sub1 + tmp_string + sub2;
            }
            currentChar++;
        } else {
            
            char tmp_char1 =  msg.charAt(currentChar);
            if (tmp_char1 >= 'a' && tmp_char1 <= 'z') {
                if (tmp_char1 == 'j') {   // polybius square uses 'i' as 'i' and 'j'
                    tmp_char1--;  
                }

                tmp_int1 = (search(table, tmp_char1) / 5) + 1;
                tmp_int2 = (search(table, tmp_char1) % 5) + 1;
                tmp_string += tmp_int1;
                tmp_string += tmp_int2;
                tmp_string += ' ';
                if (currentChar == 0) {
                    sub1 = msg.substring(1);
                    msg = tmp_string + sub1;
                    
                } else if (currentChar == msg.length()-1) {
                    sub1 = msg.substring(0, currentChar);
                    msg = sub1 + tmp_string;
                } else {
                    sub1 = msg.substring(0, currentChar);
                    sub2 = msg.substring(currentChar+1);
                    msg = sub1 + tmp_string + sub2;
                }
                currentChar = currentChar + 3;
                
            } else {
                sub1 = msg.substring(0, currentChar);
                sub2 = msg.substring(currentChar+1);
                msg = sub1 + sub2;
                //currentChar--;
            }
        }
        
        //return tmp_string;
    }
     
    public void changeMessage(){
        String tmp_string ="";
        Character tmp_char1, tmp_char2;
        int tmp_int1, tmp_int2;
        if (!flagSBS) {
            currentChar = 0;
            if (isEncrypted){ //message decrypter
                while (currentChar < msg.length()) {                    
                    changeChar();
                    //currentChar++;
                }
            } else { //message encrypter
                while (currentChar < msg.length()) {                    
                    changeChar();
                    //currentChar++;
                }
            }
            currentChar = 0;
            msg = msg.trim();
            //isEncrypted = !isEncrypted;
            System.out.println("New message is : " + msg);
        } else {
            changeChar();
            if (currentChar == msg.length()) {
                msg = msg.trim();
                currentChar = 0;
                isEncrypted = !isEncrypted;
                flagNextStep = false;
            }
        }
        
    }
}
