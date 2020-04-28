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
public class Main {
    public static void main(String[] args){        
        
        
        int b = 10;
        b = b << 2;
        
        System.out.println(b);
        
        Blowfish bf = new Blowfish("Testmessage","anotherkey12345", true, 96);
                
        //System.out.println(tab[1].length);
        
        Matrice m = new Matrice("ABCDEFGHIJKLMNOP");
        /*
        System.out.println("Hello Maven!");
        new MainFrame().setVisible(true);
        */
    }
}
