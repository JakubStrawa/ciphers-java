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
public class MainController {
    private CaesarModel caesarModel;
    private PolybiusModel polybiusModel;
    private EnigmaModel enigmaModel;
    private BlowfishModel blowfishModel;
    private MainView view;
    
    public MainController(CaesarModel cModel, PolybiusModel pModel, EnigmaModel eModel, BlowfishModel bModel, MainView v) {
        this.caesarModel = cModel;
        this.polybiusModel = pModel;
        this.enigmaModel = eModel;
        this.blowfishModel = bModel;
        this.view = v;
        v.addRunActionListener(new RunButtonListener());
        v.addRunMenuActionListener(new RunButtonListener());
        v.addShowTablePolybiusActionListener(new ShowTableListener());
        v.addShowTableEnigmaActionlistener(new ShowTableListener());
        v.addAboutCipherActionListener(new AboutCipherListener());
    }
    
    
    class RunButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            switch(view.getCipherType()){
                case 0:
                    caesarModel.setKey(view.getCaesarKey());
                    caesarModel.setIsEncrypted(view.getIsEncrypted());
                    caesarModel.setMessage(view.getMessage());
                    caesarModel.changeMessage();
                    view.setMessage(caesarModel.getMessage());
                    break;
                case 1:
                    polybiusModel.setMessage(view.getMessage());
                    polybiusModel.setIsEncrypted(view.getIsEncrypted());
                    if (view.getIfCustomKeyUsedPolybius()) {
                        polybiusModel.setTable(view.getCustomKeyPolybius());
                    } else {
                        polybiusModel.setTable("");
                    }
                    polybiusModel.changeMessage();
                    view.setMessage(polybiusModel.getMessage());
                    break;
                case 2:
                    enigmaModel.clearPlugBoard();
                    enigmaModel.clearRotorList();
                    enigmaModel.setMessage(view.getMessage());
                    if (view.getRotor1Index() != -1) {
                        enigmaModel.addRotor(view.getRotor1Index() + 1);
                        enigmaModel.getRotor(view.getRotor1Index() + 1).setRotation(view.getRotor1Offset() + 1);
                    }
                    if (view.getRotor2Index() != -1) {
                        enigmaModel.addRotor(view.getRotor2Index() + 1);
                        enigmaModel.getRotor(view.getRotor2Index() + 1).setRotation(view.getRotor2Offset() + 1);
                    }
                    if (view.getRotor3Index() != -1) {
                        enigmaModel.addRotor(view.getRotor3Index() + 1);
                        enigmaModel.getRotor(view.getRotor3Index() + 1).setRotation(view.getRotor3Offset() + 1);
                    }
                    if (view.getIfreflectorBUsed()) {
                        enigmaModel.setDeflector(1);
                    } else {
                        enigmaModel.setDeflector(2);
                    }
                    enigmaModel.addToPlugBoard(view.getPlugboard());
                    enigmaModel.changeMessage();
                    view.setMessage(enigmaModel.getMessage());
                    break;
                case 3:
                    blowfishModel.setMessage(view.getMessage());
                    blowfishModel.setKey(view.getKeyBlowfish());
                    blowfishModel.setIsEncrypted(view.getIsEncrypted());
                    if (!blowfishModel.getIsEncrypted()) {
                        blowfishModel.encryptMessage();
                    } else {
                        blowfishModel.decryptMessage();
                    }

                    if (view.getOutputTypeBlowfish()== 0) {
                        view.setMessage(blowfishModel.getEncodedList());
                    } else if(view.getOutputTypeBlowfish()== 1) {
                        view.setMessage(blowfishModel.getCharList());
                    } else if(view.getOutputTypeBlowfish()== 2) {
                        view.setMessage(blowfishModel.getBinaryList());
                    } else {
                        view.setMessage(blowfishModel.getHexList());
                    }
                    break;
            }
        }
    }
    
    class ShowTableListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (view.getCipherType() == 1) {
                PolybiusTableModel tableModel = new PolybiusTableModel();
                tableModel.setTable(polybiusModel.getTable());
                PolybiusTableView tableView = new PolybiusTableView();
                PolybiusTableController tableController = new PolybiusTableController(tableModel, tableView);
                tableView.setVisible(true);
            } else if (view.getCipherType() == 2) {
                EnigmaTableModel tableModel = new EnigmaTableModel();
                tableModel.setFlag(view.getIfreflectorBUsed());
                tableModel.setPlugboard(enigmaModel.getPlugBoard());
                tableModel.setRotors(enigmaModel.getRotorList());
                EnigmaTableView tableView = new EnigmaTableView();
                EnigmaTableController tableController = new EnigmaTableController(tableModel, tableView);
                tableView.setVisible(true);
            }
        }
    }
    
    class AboutCipherListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            switch(view.getCipherType()){
                case 0:
                    AboutCaesarView cView = new AboutCaesarView();
                    cView.setVisible(true);
                    break;
                case 1:
                    AboutPolybiusView pView = new AboutPolybiusView();
                    pView.setVisible(true);
                    break;
                case 2:
                    AboutEnigmaView eView = new AboutEnigmaView();
                    eView.setVisible(true);
                    break;
                case 3:
                    AboutBlowfishView bView = new AboutBlowfishView();
                    bView.setVisible(true);
                    break;
            }
        }
    }
    
}
