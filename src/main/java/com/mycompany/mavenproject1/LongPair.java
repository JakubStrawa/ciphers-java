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
public class LongPair {
    private long first;
    private long second;
    
    public LongPair(long a, long b){
        first = a;
        second = b;
    }
    public long getFirst(){
        return first;
    }
    public long getSecond(){
        return second;
    }
    public void setFirst(long a){
        first = a;
    }
    public void setSecond(long a){
        second = a;
    }
}
