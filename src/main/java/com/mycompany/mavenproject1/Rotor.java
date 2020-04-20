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
    private int offset;
    
    public Rotor(){
        offset = 1;
    }
    public void rotate(){
        if (offset == 26) {
            offset = 1;
        } else {
            offset++;
        }
        
    }
    public int getRotate(){
        return offset;
    }
    public char getChar(int index){
        return table[index];
    }
    public void setTable(char [] tab){
        if (tab.length == 26) {
            table = tab;
        }
    }
}
