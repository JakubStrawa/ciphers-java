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
        
        Polybius pol = new Polybius("11 12 13 14 15 21 22 23 24", true, "kopia");
        pol.changeMessage();

        Polybius pol2 = new Polybius("abcdefghij", false, "defjam");
        pol2.changeMessage();

       /*
        System.out.println("Hello Maven!");
        Cezar kod = new Cezar(5, "abcdefgh", false);
        kod.changeMessage();
        new MainFrame().setVisible(true);
*/
    }
}
