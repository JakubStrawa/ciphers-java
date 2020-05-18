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
        CaesarModel model = new CaesarModel(0, "", false);
        CaesarView view = new CaesarView();
        CaesarController controller = new CaesarController(model, view);
        view.setVisible(true);

//        System.out.println("Hello Maven!");
//        new MainFrame().setVisible(true);
        
    }
}
