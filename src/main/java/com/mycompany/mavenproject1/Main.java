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
        Enigma test = new Enigma("Test message");
        
        test.addToPlugBoard('a', 'f');
        test.addToPlugBoard('x', 'z');
        test.addToPlugBoard('g', 'm');
        test.addToPlugBoard('f', 'g');
        test.addToPlugBoard('e', 's');
        
        test.addRotor(2);
        test.addRotor(4);
        test.addRotor(1);
        //test.printEnigma();
        
        test.setDeflector(2);
        //test.changeMessage();
        
        Enigma test2 = new Enigma("vcgpcrbwlji");
        //test2.testRot();
        
        test2.addToPlugBoard('e', 'x');
        test2.addToPlugBoard('b', 'm');
        test2.addToPlugBoard('f', 't');
        test2.addToPlugBoard('s', 'a');
        
        test2.addRotor(5);
        test2.addRotor(4);
        test2.addRotor(1);  
        //test2.printEnigma();
        
        test2.setDeflector(2);
        test2.changeMessage();
        
        String text = "  ab cd ef gh ij k      l    ";
        text = text.trim();
        System.out.println(text);
        test2.addToPlugBoard(text);
        test2.printEnigma();
        
        System.out.println("Hello Maven!");
        Cezar kod = new Cezar(5, "abcdefgh", false);
        kod.changeMessage();
        new MainFrame().setVisible(true);
         
    }
}
