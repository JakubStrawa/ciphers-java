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
public class EnigmaController {
    private EnigmaModel model;
    private EnigmaView view;

    public EnigmaController(EnigmaModel mod, EnigmaView v) {
        model = mod;
        view = v;
        view.addRunActionListener(new RunButtonListener());
        view.addRunMenuItemActionListener(new RunButtonListener());
        view.addShowTableActionlistener(new ShowTableListener());
    }
    
    class RunButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            model.clearPlugBoard();
            model.clearRotorList();
            model.setMessage(view.getMessage());
            if (view.getRotor1Index() != -1) {
                model.addRotor(view.getRotor1Index() + 1);
                model.getRotor(view.getRotor1Index() + 1).setRotation(view.getRotor1Offset() + 1);
            }
            if (view.getRotor2Index() != -1) {
                model.addRotor(view.getRotor2Index() + 1);
                model.getRotor(view.getRotor2Index() + 1).setRotation(view.getRotor2Offset() + 1);
            }
            if (view.getRotor3Index() != -1) {
                model.addRotor(view.getRotor3Index() + 1);
                model.getRotor(view.getRotor3Index() + 1).setRotation(view.getRotor3Offset() + 1);
            }
            if (view.getIfreflectorBUsed()) {
                model.setDeflector(1);
            } else {
                model.setDeflector(2);
            }
            model.addToPlugBoard(view.getPlugboard());
            model.changeMessage();
            view.setMessage(model.getMessage());
                       
        }
    }
    
    class ShowTableListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            EnigmaTableModel tableModel = new EnigmaTableModel();
            tableModel.setFlag(view.getIfreflectorBUsed());
            tableModel.setPlugboard(model.getPlugBoard());
            tableModel.setRotors(model.getRotorList());
            EnigmaTableView tableView = new EnigmaTableView();
            EnigmaTableController tableController = new EnigmaTableController(tableModel, tableView);
            tableView.setVisible(true);
        }
    }
    
    
    
}
