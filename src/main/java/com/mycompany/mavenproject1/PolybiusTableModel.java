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
public class PolybiusTableModel {
    private Character[] table;
    
    public PolybiusTableModel() {
    }
    
    public Character[] getTable(){
        return table;
    }
    
    public void setTable(Character [] tab){
        table = tab;
    }
}
