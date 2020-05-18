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
public class CaesarView extends javax.swing.JFrame {

    /**
     * Creates new form CezarFrame
     */
    public CaesarView() {
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

        messageTextField = new javax.swing.JTextField();
        titleLabel = new javax.swing.JLabel();
        runButton = new javax.swing.JButton();
        answerScrollPane = new javax.swing.JScrollPane();
        answerTextArea = new javax.swing.JTextArea();
        offsetSpinner = new javax.swing.JSpinner();
        chooseOffsetLabel = new javax.swing.JLabel();
        decodeCheckBox = new javax.swing.JCheckBox();
        caesarMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        copyResultMenuItem = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        decodeCheckBoxMenuItem = new javax.swing.JCheckBoxMenuItem();
        gotoMenu = new javax.swing.JMenu();
        polybiusMenuItem = new javax.swing.JMenuItem();
        enigmaMenuItem = new javax.swing.JMenuItem();
        blowfishMenuItem = new javax.swing.JMenuItem();
        runMenu = new javax.swing.JMenu();
        runMenuItem = new javax.swing.JMenuItem();
        runSBSCheckBoxMenuItem = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cesar cipher");

        messageTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        messageTextField.setText("Enter your message here");
        messageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTextFieldActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Caesar cipher");

        runButton.setText("Run");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        answerTextArea.setEditable(false);
        answerTextArea.setColumns(20);
        answerTextArea.setRows(4);
        answerTextArea.setText("Click Run to see your answer");
        answerScrollPane.setViewportView(answerTextArea);

        chooseOffsetLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chooseOffsetLabel.setText("Choose message offset");

        decodeCheckBox.setText("Decode message");
        decodeCheckBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        decodeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodeCheckBoxActionPerformed(evt);
            }
        });

        fileMenu.setText("File");

        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        caesarMenuBar.add(fileMenu);

        editMenu.setText("Edit");

        copyResultMenuItem.setText("Copy result");
        editMenu.add(copyResultMenuItem);

        caesarMenuBar.add(editMenu);

        viewMenu.setText("View");

        decodeCheckBoxMenuItem.setText("Decode message");
        decodeCheckBoxMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodeCheckBoxMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(decodeCheckBoxMenuItem);

        gotoMenu.setText("Go to");

        polybiusMenuItem.setText("Polybius");
        polybiusMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                polybiusMenuItemActionPerformed(evt);
            }
        });
        gotoMenu.add(polybiusMenuItem);

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

        caesarMenuBar.add(viewMenu);

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

        caesarMenuBar.add(runMenu);

        setJMenuBar(caesarMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(messageTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(answerScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(chooseOffsetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(offsetSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(104, 104, 104))
                                .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(decodeCheckBox, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(offsetSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseOffsetLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(answerScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(decodeCheckBox)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
    }//GEN-LAST:event_runButtonActionPerformed

    private void messageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTextFieldActionPerformed

    private void decodeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodeCheckBoxActionPerformed
        if (decodeCheckBoxMenuItem.isSelected()) {
            decodeCheckBoxMenuItem.setSelected(false);
        } else {
            decodeCheckBoxMenuItem.setSelected(true);
        }
    }//GEN-LAST:event_decodeCheckBoxActionPerformed

    private void runMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runMenuItemActionPerformed
    }//GEN-LAST:event_runMenuItemActionPerformed

    private void decodeCheckBoxMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodeCheckBoxMenuItemActionPerformed
        if (decodeCheckBox.isSelected()) {
            decodeCheckBox.setSelected(false);
        } else {
            decodeCheckBox.setSelected(true);
    }
        
    }//GEN-LAST:event_decodeCheckBoxMenuItemActionPerformed

    private void polybiusMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_polybiusMenuItemActionPerformed
        PolybiusModel model = new PolybiusModel();
        PolybiusView view = new PolybiusView();
        PolybiusController controller = new PolybiusController(model, view);
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_polybiusMenuItemActionPerformed

    private void enigmaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enigmaMenuItemActionPerformed
        EnigmaModel model = new EnigmaModel();
        EnigmaView view = new EnigmaView();
        EnigmaController controller = new EnigmaController(model, view);
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_enigmaMenuItemActionPerformed

    private void blowfishMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blowfishMenuItemActionPerformed
        BlowfishModel model = new BlowfishModel();
        BlowfishView view = new BlowfishView();
        BlowfishController controller = new BlowfishController(model, view);
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_blowfishMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(CaesarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaesarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaesarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaesarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaesarView().setVisible(true);
            }
        });
    }
    
    public void addRunActionListener(ActionListener a){
        runButton.addActionListener(a);
    }
    public void addRunMenuActionListener(ActionListener a){
        runMenuItem.addActionListener(a);
    }
    public int getKey(){
        return (int) offsetSpinner.getValue();
    }
    public boolean getIsEncrypted(){
        return decodeCheckBox.isSelected();
    }
    public String getMessage(){
        return messageTextField.getText().trim().toLowerCase();
    }
    public void setMessage(String mes){
        answerTextArea.setText(mes);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane answerScrollPane;
    private javax.swing.JTextArea answerTextArea;
    private javax.swing.JMenuItem blowfishMenuItem;
    private javax.swing.JMenuBar caesarMenuBar;
    private javax.swing.JLabel chooseOffsetLabel;
    private javax.swing.JMenuItem copyResultMenuItem;
    private javax.swing.JCheckBox decodeCheckBox;
    private javax.swing.JCheckBoxMenuItem decodeCheckBoxMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem enigmaMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu gotoMenu;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JSpinner offsetSpinner;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem polybiusMenuItem;
    private javax.swing.JButton runButton;
    private javax.swing.JMenu runMenu;
    private javax.swing.JMenuItem runMenuItem;
    private javax.swing.JCheckBoxMenuItem runSBSCheckBoxMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JMenu viewMenu;
    // End of variables declaration//GEN-END:variables
}
