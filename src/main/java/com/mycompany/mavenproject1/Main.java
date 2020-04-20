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
        char [] tab = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Rotor test = new Rotor();
        test.setTable(tab);
        int a = 0;
        test.rotate();
        test.rotate();
        a = test.getRotate();
        System.out.println(a);
        for (int i = 0; i < 24; i++) {
            test.rotate();
        }
        a = test.getRotate();
        System.out.println(a);
        
        /*
        System.out.println("Hello Maven!");
        Cezar kod = new Cezar(5, "abcdefgh", false);
        kod.changeMessage();
        new MainFrame().setVisible(true);
*/

    }
}
