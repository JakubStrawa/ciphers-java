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
public class Rotor {
    private ArrayList<Pair> table;
    private int rotation;
    private boolean isUsed;
    private int number;
    
    public Rotor(int num, char [] tab){
        table = new ArrayList<Pair>();
        rotation = 1;
        isUsed = false;
        number = num;
        setTable(tab);
    }
    // Pairs : alphabetical order, counterletter
    private void fillTable(char [] tab){
        int temp = 97;
        for (char c : tab) {
            table.add(new Pair((char) temp, c));
            temp++;
        }
    }
    
    public ArrayList<Pair> getTable(){
        return table;
    }
    
    public void rotate(){
        if (rotation == 26) {
            rotation = 1;
        } else {
            rotation++;
        }
    }
    
    public int getRotatation(){
        return rotation;
    }
    
    public void setRotation(int i){
        rotation = i;
    }
    
    public char getChar(int index){
        return table.get(index).getSecond();
    }
    public char getCounterChar(char c){
        char tmp = 'a';
        for (Pair pair : table) {
            if (pair.getSecond() == c) {
                tmp = pair.getFirst();
            }
        }
        return tmp;
    }
    
    public void setTable(char [] tab){
        if (tab.length == 26) {
            fillTable(tab);
        }
    }
    
    public boolean getIsUsed(){
        return isUsed;
    }
    
    public void changeIsUsed(){
        if (isUsed) {
            isUsed = false;
        } else {
            isUsed = true;
        }
    }
    
    public int getNumber(){
        return number;
    }
}
