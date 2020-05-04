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
public class Pair<T> {
    private T first;
    private T second;
    
    public Pair(T a, T b){
        first = a;
        second = b;
    }
    public T getFirst(){
        return first;
    }
    public T getSecond(){
        return second;
    }
    public void setFirst(T a){
        first = a;
    }
    public void setSecond(T a){
        second = a;
    }
}
