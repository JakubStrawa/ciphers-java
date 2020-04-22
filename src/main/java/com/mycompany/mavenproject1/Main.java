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
        Enigma test = new Enigma("Test message", false);
        
        test.addToPlugBoard('a', 'f');
        test.addToPlugBoard('x', 'z');
        test.addToPlugBoard('g', 'm');
        test.addToPlugBoard('f', 'g');
        test.addToPlugBoard('e', 's');
        
        test.addRotor(2);
        test.addRotor(4);
        test.addRotor(1);
        //test.printEnigma();
        
        test.setDeflector(1);
        //test.changeMessage();
        
        Enigma test2 = new Enigma("hzlnwsqipab", false);
        //test2.testRot();
        
        test2.addToPlugBoard('e', 'x');
        test2.addToPlugBoard('b', 'm');
        test2.addToPlugBoard('f', 'g');
        
        test2.addRotor(5);
        test2.addRotor(4);
        test2.addRotor(1);  
        //test2.printEnigma();
        
        test2.setDeflector(1);
        test2.changeMessage();
        /*
        System.out.println("Hello Maven!");
        Cezar kod = new Cezar(5, "abcdefgh", false);
        kod.changeMessage();
        new MainFrame().setVisible(true);
         */
    }
}
