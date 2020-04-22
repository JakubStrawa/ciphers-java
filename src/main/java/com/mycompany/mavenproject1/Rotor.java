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
public class Rotor {
    private char [] table = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    private int rotation;
    private boolean isUsed;
    private int number;
    
    public Rotor(int num){
        rotation = 1;
        isUsed = false;
        number = num;
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
        return table[index];
    }
    
    public char getCounterChar(char c){
        char tmp = 'a';
        for (int i = 0; i < table.length; i++) {
            if (table[i] == c) {
                tmp += i;
            }
        }
        return tmp;
    }
    
    public void setTable(char [] tab){
        if (tab.length == 26) {
            table = tab;
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
