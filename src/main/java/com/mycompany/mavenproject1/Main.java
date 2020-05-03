/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.math.BigInteger;


/**
 *
 * @author kuba
 */
public class Main {
    public static void main(String[] args){     
        
        Blowfish test = new Blowfish("#$%^1234af()jk", "@abchi", false);
        test.getKey();
        test.getMessageList();
        //test.getMessage();
        test.encryptMessage();
        //test.getMessage();
        //test.getMessageList();
        test.getDecodedList();
        test.decryptMessage();
        //test.getMessage();
        //test.getMessageList();
        test.getDecodedList();
        //test.getKey();
        /*
        System.out.println("Hello Maven!");
        new MainFrame().setVisible(true);
        */
    }
}
