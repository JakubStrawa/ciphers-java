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
        
        long l = 3211314;
        l = l >> 16;
        System.out.println(l);
                
        BlowfishTesting test = new BlowfishTesting("1234", "ELDO20kanawolno");
        test.getMessage();
        
        /*
        System.out.println("Hello Maven!");
        new MainFrame().setVisible(true);
        */
    }
}
