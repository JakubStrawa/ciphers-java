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
public class PolybiusTableController {
    private PolybiusTableModel model;
    private PolybiusTableView view;
    
    public PolybiusTableController(PolybiusTableModel mod, PolybiusTableView v){
        model = mod;
        view = v;
        view.setTable(model.getTable());
    }
}
