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
public class Pair {
    private char first;
    private char second;
    
    public Pair(char a, char b){
        first = a;
        second = b;
    }
    public char getFirst(){
        return first;
    }
    public char getSecond(){
        return second;
    }
    public void setFirst(char a){
        first = a;
    }
    public void setSecond(char a){
        second = a;
    }
}
