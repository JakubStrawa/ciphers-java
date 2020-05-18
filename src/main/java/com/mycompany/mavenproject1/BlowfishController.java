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
public class BlowfishController {
    private BlowfishModel model;
    private BlowfishView view;

    public BlowfishController(BlowfishModel mod, BlowfishView v) {
        model = mod;
        view = v;
        view.addRunActionListener(new RunButtonListener());
        view.addRunMenuItemActionListener(new RunButtonListener());
    }
    
    class RunButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            model.setMessage(view.getMessage());
            model.setKey(view.getKey());
            model.setIsEncrypted(view.getIsEncrypted());
            if (!model.getIsEncrypted()) {
                model.encryptMessage();
            } else {
                model.decryptMessage();
            }
            
            if (view.getOutputType() == 0) {
                view.setMessage(model.getEncodedList());
            } else if(view.getOutputType() == 1) {
                view.setMessage(model.getCharList());
            } else if(view.getOutputType() == 2) {
                view.setMessage(model.getBinaryList());
            } else {
                view.setMessage(model.getHexList());
            }

            
        }
    }
    
    
}
