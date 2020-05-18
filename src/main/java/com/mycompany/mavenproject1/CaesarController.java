/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class CaesarController {
    
    private CaesarModel model;
    private CaesarView view;
    
    public CaesarController(CaesarModel mod, CaesarView v){
        model = mod;
        view = v;
        view.addRunActionListener(new RunButtonListener());
        view.addRunMenuActionListener(new RunButtonListener());
    }
    
    class RunButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            model.setKey(view.getKey());
            model.setIsEncrypted(view.getIsEncrypted());
            model.setMessage(view.getMessage());
            model.changeMessage();
            view.setMessage(model.getMessage());
            
        }
    }
    

}
