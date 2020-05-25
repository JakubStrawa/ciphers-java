/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.awt.event.*;

/**
 *
 * @author kuba
 */
public class PolybiusView extends javax.swing.JFrame {

    /**
     * Creates new form PolybiusFrame
     */
    public PolybiusView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        messageScrollPane = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        runButton = new javax.swing.JButton();
        decodeCheckBox = new javax.swing.JCheckBox();
        customKeyCheckBox = new javax.swing.JCheckBox();
        customKeyTextField = new javax.swing.JTextField();
        answerScrollPane = new javax.swing.JScrollPane();
        answerTextArea = new javax.swing.JTextArea();
        polybiusMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        copyResultMenuItem = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        decodeMessageCheckBoxMenuItem = new javax.swing.JCheckBoxMenuItem();
        customKeyCheckBoxMenuItem = new javax.swing.JCheckBoxMenuItem();
        showTableMenuItem = new javax.swing.JMenuItem();
        gotoMenu = new javax.swing.JMenu();
        caesarMenuItem = new javax.swing.JMenuItem();
        enigmaMenuItem = new javax.swing.JMenuItem();
        blowfishMenuItem = new javax.swing.JMenuItem();
        runMenu = new javax.swing.JMenu();
        runMenuItem = new javax.swing.JMenuItem();
        runSBSCheckBoxMenuItem = new javax.swing.JCheckBoxMenuItem();
        aboutMenu = new javax.swing.JMenu();
        aboutCipherMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Polybius square");

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Polybius Square");

        messageTextArea.setColumns(20);
        messageTextArea.setRows(4);
        messageTextArea.setText("Enter your message here");
        messageScrollPane.setViewportView(messageTextArea);

        runButton.setText("Run");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        decodeCheckBox.setText("Decode message");
        decodeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodeCheckBoxActionPerformed(evt);
            }
        });

        customKeyCheckBox.setText("Custom key");
        customKeyCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customKeyCheckBoxActionPerformed(evt);
            }
        });

        customKeyTextField.setText("Default key");
        customKeyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customKeyTextFieldActionPerformed(evt);
            }
        });

        answerTextArea.setColumns(20);
        answerTextArea.setRows(4);
        answerTextArea.setText("Click Run to see your answer");
        answerScrollPane.setViewportView(answerTextArea);

        fileMenu.setText("File");

        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        polybiusMenuBar.add(fileMenu);

        editMenu.setText("Edit");

        copyResultMenuItem.setText("Copy results");
        editMenu.add(copyResultMenuItem);

        polybiusMenuBar.add(editMenu);

        viewMenu.setText("View");

        decodeMessageCheckBoxMenuItem.setText("Decode message");
        decodeMessageCheckBoxMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodeMessageCheckBoxMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(decodeMessageCheckBoxMenuItem);

        customKeyCheckBoxMenuItem.setText("Custom key");
        customKeyCheckBoxMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customKeyCheckBoxMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(customKeyCheckBoxMenuItem);

        showTableMenuItem.setText("Show table");
        showTableMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTableMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(showTableMenuItem);

        gotoMenu.setText("Go to");

        caesarMenuItem.setText("Caesar");
        caesarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caesarMenuItemActionPerformed(evt);
            }
        });
        gotoMenu.add(caesarMenuItem);

        enigmaMenuItem.setText("Enigma");
        enigmaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enigmaMenuItemActionPerformed(evt);
            }
        });
        gotoMenu.add(enigmaMenuItem);

        blowfishMenuItem.setText("Blowfish");
        blowfishMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blowfishMenuItemActionPerformed(evt);
            }
        });
        gotoMenu.add(blowfishMenuItem);

        viewMenu.add(gotoMenu);

        polybiusMenuBar.add(viewMenu);

        runMenu.setText("Run");

        runMenuItem.setText("Run");
        runMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runMenuItemActionPerformed(evt);
            }
        });
        runMenu.add(runMenuItem);

        runSBSCheckBoxMenuItem.setText("Run step by step");
        runMenu.add(runSBSCheckBoxMenuItem);

        polybiusMenuBar.add(runMenu);

        aboutMenu.setText("About");

        aboutCipherMenuItem.setText("About cipher");
        aboutCipherMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutCipherMenuItemActionPerformed(evt);
            }
        });
        aboutMenu.add(aboutCipherMenuItem);

        polybiusMenuBar.add(aboutMenu);

        setJMenuBar(polybiusMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(answerScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(messageScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(customKeyTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customKeyCheckBox)
                            .addComponent(decodeCheckBox)
                            .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(runButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(decodeCheckBox))
                    .addComponent(messageScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customKeyCheckBox))
                .addGap(12, 12, 12)
                .addComponent(answerScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
    }//GEN-LAST:event_runButtonActionPerformed

    private void decodeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodeCheckBoxActionPerformed
        if (decodeMessageCheckBoxMenuItem.isSelected()) {
            decodeMessageCheckBoxMenuItem.setSelected(false);
        } else {
            decodeMessageCheckBoxMenuItem.setSelected(true);
        }
    }//GEN-LAST:event_decodeCheckBoxActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void enigmaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enigmaMenuItemActionPerformed
        EnigmaModel model = new EnigmaModel();
        EnigmaView view = new EnigmaView();
        EnigmaController controller = new EnigmaController(model, view);
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_enigmaMenuItemActionPerformed

    private void runMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runMenuItemActionPerformed
    }//GEN-LAST:event_runMenuItemActionPerformed

    private void decodeMessageCheckBoxMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodeMessageCheckBoxMenuItemActionPerformed
        if (decodeCheckBox.isSelected()) {
            decodeCheckBox.setSelected(false);
        } else {
            decodeCheckBox.setSelected(true);
        }
    }//GEN-LAST:event_decodeMessageCheckBoxMenuItemActionPerformed

    private void caesarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caesarMenuItemActionPerformed
        CaesarModel model = new CaesarModel();
        CaesarView view = new CaesarView();
        CaesarController controller = new CaesarController(model, view);
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_caesarMenuItemActionPerformed

    private void blowfishMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blowfishMenuItemActionPerformed
        BlowfishModel model = new BlowfishModel();
        BlowfishView view = new BlowfishView();
        BlowfishController controller = new BlowfishController(model, view);
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_blowfishMenuItemActionPerformed

    private void showTableMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTableMenuItemActionPerformed
    }//GEN-LAST:event_showTableMenuItemActionPerformed

    private void customKeyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customKeyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customKeyTextFieldActionPerformed

    private void customKeyCheckBoxMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customKeyCheckBoxMenuItemActionPerformed
        if (customKeyCheckBox.isSelected()) {
            customKeyCheckBox.setSelected(false);
        } else {
            customKeyCheckBox.setSelected(true);
        }
    }//GEN-LAST:event_customKeyCheckBoxMenuItemActionPerformed

    private void customKeyCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customKeyCheckBoxActionPerformed
        if (customKeyCheckBoxMenuItem.isSelected()) {
            customKeyCheckBoxMenuItem.setSelected(false);
        } else {
            customKeyCheckBoxMenuItem.setSelected(true);
        }
    }//GEN-LAST:event_customKeyCheckBoxActionPerformed

    private void aboutCipherMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutCipherMenuItemActionPerformed
        AboutPolybiusView aboutPol = new AboutPolybiusView();
        aboutPol.setVisible(true);
    }//GEN-LAST:event_aboutCipherMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PolybiusView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PolybiusView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PolybiusView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PolybiusView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PolybiusView().setVisible(true);
            }
        });
    }
    
    public void addRunActionListener(ActionListener a){
        runButton.addActionListener(a);
    }
    public void addRunMenuActionListener(ActionListener a){
        runMenuItem.addActionListener(a);
    }
    public void addShowTableActionListener(ActionListener a){
        showTableMenuItem.addActionListener(a);
    }
    public boolean getIsEncrypted(){
        return decodeCheckBox.isSelected();
    }
    public boolean getIfCustomKeyUsed(){
        return customKeyCheckBox.isSelected();
    }
    public String getCustomKey(){
        return customKeyTextField.getText().trim().toLowerCase();
    }
    public String getMessage(){
        return messageTextArea.getText().trim().toLowerCase();
    }
    public void setMessage(String mes){
        answerTextArea.setText(mes);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutCipherMenuItem;
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JScrollPane answerScrollPane;
    private javax.swing.JTextArea answerTextArea;
    private javax.swing.JMenuItem blowfishMenuItem;
    private javax.swing.JMenuItem caesarMenuItem;
    private javax.swing.JMenuItem copyResultMenuItem;
    private javax.swing.JCheckBox customKeyCheckBox;
    private javax.swing.JCheckBoxMenuItem customKeyCheckBoxMenuItem;
    private javax.swing.JTextField customKeyTextField;
    private javax.swing.JCheckBox decodeCheckBox;
    private javax.swing.JCheckBoxMenuItem decodeMessageCheckBoxMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem enigmaMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu gotoMenu;
    private javax.swing.JScrollPane messageScrollPane;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuBar polybiusMenuBar;
    private javax.swing.JButton runButton;
    private javax.swing.JMenu runMenu;
    private javax.swing.JMenuItem runMenuItem;
    private javax.swing.JCheckBoxMenuItem runSBSCheckBoxMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem showTableMenuItem;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JMenu viewMenu;
    // End of variables declaration//GEN-END:variables
}
