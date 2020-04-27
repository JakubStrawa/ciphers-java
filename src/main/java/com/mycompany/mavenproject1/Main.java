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
        int hex1 = 0xFF;
        int hex2 = 0x00;
        int hex3 = hex2+1;
        String s = "abcdefghijklmnop";
        String r = "";
        byte [] result = s.getBytes();
        for (byte b : result) {
            int decimal = (int) b & 0xff;
            String hex = Integer.toHexString(decimal);
            r += hex;
        }
        //System.out.println(result);
        //System.out.println(r);
        
        char [] tab = new char[10];
        for (int i = 0; i < 10; i++) {
            tab[i] = s.charAt(i);
        }
        //tab = s.toCharArray();
        System.out.println(tab);
        
        //AES aes = new AES(s, true);
        
        
        /*
        System.out.println("Hello Maven!");
        new MainFrame().setVisible(true);
        */
    }
}
