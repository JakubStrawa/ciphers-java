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
public class CaesarModel{
    private String msg;
    private int key;
    private Boolean isEncrypted; // Flag showing if we have encrypted or decoded message
    private Boolean flagSBS;
    private Boolean flagNextStep;
    private int currentChar;
    
    public CaesarModel(){
        key = 0;
        msg = "";
        isEncrypted = false; //default value is message to encode
        flagSBS = false;
        flagNextStep = false;
        currentChar = 0;
    }
        
    public Boolean getFlagNextStep(){
        return flagNextStep;
    }
    
    public void setFlagNextStep(Boolean f){
        flagNextStep = f;
    }
    
    public Boolean getSBSFlag(){
        return flagSBS;
    }
    
    public void setSBSFlag(Boolean f){
        flagSBS = f;
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
    
    private char changeChar(char c){
        char tmp_char = c;
        if (isEncrypted) {
            if (tmp_char > 96 && tmp_char < 123) {
                tmp_char = (char) (122 + (tmp_char-key-122) % 26);
            }
        } else {
            if (tmp_char > 96 && tmp_char < 123) {
                tmp_char = (char) (97 + (tmp_char+key-97) % 26);
            }
        }
        return tmp_char;
    }
    
    public void changeMessageStep(){
        try {
            char tmp_char = changeChar(msg.charAt(currentChar));
            char[] msgChars = msg.toCharArray();
            msgChars[currentChar] = tmp_char;
            msg = String.valueOf(msgChars);
            currentChar++;
            //System.out.println("New message is : " + msg);
        } catch (Exception e) {
            currentChar = msg.length();
        }        
    }
    
    public void changeMessage(){
        if (!flagSBS) {
            currentChar = 0;
            String tmp_string = "";
            char tmp_char;
            while (currentChar < msg.length()) { 
                tmp_char = msg.charAt(currentChar);
                tmp_string += changeChar(tmp_char);
                currentChar++;
            }
            currentChar = 0;
            msg = tmp_string;
            isEncrypted = !isEncrypted;
            //System.out.println("New message is : " + msg);
        } else {
            changeMessageStep();
            if (currentChar == msg.length()) {
                currentChar = 0;
                isEncrypted = !isEncrypted;
                flagNextStep = false;
            }
        }
        
    }
}
