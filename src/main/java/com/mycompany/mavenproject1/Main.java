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
        
        System.out.println("Hello Maven!");
        
        CaesarModel caesarModel = new CaesarModel();
        PolybiusModel polybiusModel = new PolybiusModel();
        EnigmaModel enigmaModel = new EnigmaModel();
        BlowfishModel blowfishModel = new BlowfishModel();
        MainView view = new MainView();
        MainController controller = new MainController(caesarModel, polybiusModel, enigmaModel, blowfishModel, view);
        view.setVisible(true);
        
    }
}
