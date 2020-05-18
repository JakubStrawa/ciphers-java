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
public class EnigmaTableModel {
    private boolean flag;
    private ArrayList<Rotor> rotors;
    private ArrayList<Pair<Character>> plugboard;

    public EnigmaTableModel() {
        flag = false;
    }
    
    public void setFlag(boolean f){
        flag = f;
    }
    
    public void setRotors(ArrayList<Rotor> r){
        rotors = r;
    }
    
    public void setPlugboard(ArrayList<Pair<Character>> pb){
        plugboard = pb;
    }
    
    public boolean getFlag(){
        return flag;
    }
    
    public ArrayList<Rotor> getRotors(){
        return rotors;
    }
    
    public ArrayList<Pair<Character>> getPlugBoard(){
        return plugboard;
    }
    
    
}
