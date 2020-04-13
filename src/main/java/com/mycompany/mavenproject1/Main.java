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
        char [] table = {'a','b','c','d','e'};
        int a = 29/5;
        int test = Arrays.binarySearch(table, ' ');
        Polybius pol = new Polybius("11 31 44 53 24 33", true);
        pol.changeMessage();

        System.out.print(test);
       /*
        System.out.println("Hello Maven!");
        Cezar kod = new Cezar(5, "abcdefgh", false);
        kod.changeMessage();
        new MainFrame().setVisible(true);
*/
    }
}
