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
    private char [] table1 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private int rotation;
    private boolean isUsed;
    private int number;
    
    public Rotor(int num, char [] tab){
        table = new ArrayList<Pair>();
        rotation = 1;
        isUsed = false;
        number = num;
        setTable(tab);
        //fillTable();
    }
    // Pairs : alphabetical order, counterletter (table1 is table of counterletters)
    private void fillTable(char [] tab){
        int temp = 97;
        for (char c : table1) {
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
        //return table1[index];
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
            //table1 = tab;
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
