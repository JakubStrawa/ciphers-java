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
public class Main {
    public static void main(String[] args){
        Enigma test = new Enigma();
        test.addToPlugBoard('a', 'f');
        test.addToPlugBoard('x', 'z');
        test.addToPlugBoard('g', 'm');
        test.addToPlugBoard('f', 'g');

        
        
        System.out.println("Hello Maven!");
        Cezar kod = new Cezar(5, "abcdefgh", false);
        kod.changeMessage();
        new MainFrame().setVisible(true);


    }
}
