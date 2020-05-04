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
public class Polybius {
    private String msg;
    private Character [] table = {'a','b','c','d','e','f','g','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private Boolean isEncrypted; // Flag showing if we have encrypted or decoded message
    
    public Polybius(String m, Boolean f, String k){
        msg = m.trim().toLowerCase();
        isEncrypted = f;   
        if (k != "") {
            setTable(k.trim().toLowerCase());
        }
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
        msg = s;
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
     
    public void changeMessage(){
        String tmp_string ="";
        Character tmp_char1, tmp_char2;
        int tmp_int1, tmp_int2;
        if (isEncrypted){ //message decrypter
            for(int i = 0; i < msg.length(); i = i+2){
                
                tmp_char1 = msg.charAt(i);
                
                if (tmp_char1 < '1' || tmp_char1 > '5') {   // For reading number with spaces eg. "12 34 25"
                    i++;
                    tmp_char1 = msg.charAt(i);
                }
                    tmp_char2 = msg.charAt(i+1);
                    tmp_int1 = (int) tmp_char1 - '0';
                    tmp_int2 = (int) tmp_char2 - '0';
                    tmp_int2 = ((tmp_int1 - 1) * 5) + tmp_int2 - 1;
                    tmp_string += table[tmp_int2];
            }
        } else { //message encrypter
            for(int i = 0; i < msg.length(); i++){
                
                tmp_char1 =  msg.charAt(i);
                if (tmp_char1 >= 'a' && tmp_char1 <= 'z') {
                    if (tmp_char1 == 'j') {   // polybius square uses 'i' as 'i' and 'j'
                        tmp_char1--;  
                    }
                    
                    tmp_int1 = (search(table, tmp_char1) / 5) + 1;
                    tmp_int2 = (search(table, tmp_char1) % 5) + 1;
                    tmp_string += tmp_int1;
                    tmp_string += tmp_int2;
                    tmp_string += ' ';
                }
                
            }
        }
        msg = tmp_string.trim();
        isEncrypted = !isEncrypted;
        System.out.println("New message is : " + msg);
    }
}
