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
    boolean isEncoded;
    
    public AES(String msg, boolean b){
        message = msg;
        isEncoded = b;
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
    
    public void changeMessage(){
        
    }
    
}
