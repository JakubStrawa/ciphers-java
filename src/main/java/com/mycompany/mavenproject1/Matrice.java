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
public class Matrice {
    private String [][] table;
    
    public Matrice(String t){
        table = new String[4][4];
        fillTable(t, table);
        //System.out.println(table);
    }
    
    private void fillTable(String t, String [][] tab){
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                try {
                    tab[y][x] = t.substring((2*y + 8*x), (2*y + 8*x + 2));
                } catch (Exception e) {
                    tab[y][x] = "##";
                }
                
            }
        }
    }
    
    public String[][] getMatrice(){
        return table;
    }
    
    public void setString(String t){
        fillTable(t, table);
    }
}
