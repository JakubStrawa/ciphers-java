/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author kuba
 */
public class EnigmaTableController {
    private EnigmaTableModel model;
    private EnigmaTableView view;
    
    public EnigmaTableController(EnigmaTableModel mod, EnigmaTableView v) {
        model = mod;
        view = v;
        setRotors(model.getRotors());
        setPlugboard(model.getPlugboard());
    }
    
    private void setRotors(ArrayList<Rotor> rotors){
        char d = 'B';
        if (!model.getFlag()) {
            d = 'C';
        }
        String text1 = "";
        text1 += d;
        for (Rotor r : rotors) {
            text1 = text1 + " " + r.getNumber();
        }
        String text2 = "";
        for (Rotor r : rotors) {
            text2 = text2 + " " + r.getRotatation();
        }
        view.setRotorOrderLabel(text1.trim());
        view.setRotorOffsetLabel(text2.trim());
    }
    
    private void setPlugboard(ArrayList<Pair<Character>> plugboard){
        String text3 = "";
        int i = 0, j = 0;
        for (Pair pair : plugboard) {
            text3 = text3 + pair.getFirst() + pair.getSecond() + " ";
            i++;
            if (i == 4 && j != 2) {
                j++;
                i = 0;
                text3 += ":";
            }
        }
        String [] stable = {};
        stable = text3.split(":", 3);
        view.setPlugboard1Label(stable[0].trim().toUpperCase());
        if (stable.length > 1) {
            view.setPlugboard2Label(stable[1].trim().toUpperCase());
        } else {
            view.setPlugboard2Label("");
        }
        if (stable.length > 2) {
            view.setPlugboard3Label(stable[2].trim().toUpperCase());
        } else {
            view.setPlugboard3Label("");
        }
    }
    
}
