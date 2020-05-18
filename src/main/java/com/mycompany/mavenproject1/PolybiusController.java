/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class PolybiusController {
    
    private PolybiusModel model;
    private PolybiusView view;
    
    public PolybiusController(PolybiusModel mod, PolybiusView v){
        model = mod;
        view = v;
        view.addRunActionListener(new RunButtonListener());
        view.addRunMenuActionListener(new RunButtonListener());
        view.addShowTableActionListener(new ShowTableListener());
    }
    
    class RunButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            model.setMessage(view.getMessage());
            model.setIsEncrypted(view.getIsEncrypted());
            if (view.getIfCustomKeyUsed()) {
                model.setTable(view.getCustomKey());
            } else {
                model.setTable("");
            }
            model.changeMessage();
            view.setMessage(model.getMessage());
            
        }
    }
    
    class ShowTableListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            PolybiusTableModel tableModel = new PolybiusTableModel();
            tableModel.setTable(model.getTable());
            PolybiusTableView tableView = new PolybiusTableView();
            PolybiusTableController tableController = new PolybiusTableController(tableModel, tableView);
            tableView.setVisible(true);
        }
    }
    
}
