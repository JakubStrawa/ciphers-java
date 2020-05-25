/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.awt.event.ActionListener;

/**
 *
 * @author kuba
 */
public class BlowfishView extends javax.swing.JFrame {

    /**
     * Creates new form AESFrame
     */
    public BlowfishView() {
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
        messageTextField = new javax.swing.JTextField();
        answerScrollPane = new javax.swing.JScrollPane();
        answerTextArea = new javax.swing.JTextArea();
        runButton = new javax.swing.JButton();
        keyTextField = new javax.swing.JTextField();
        decodeCheckBox = new javax.swing.JCheckBox();
        outputTypeComboBox = new javax.swing.JComboBox<>();
        blowfishMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        copyResultMenuItem = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        decodeCheckBoxMenuItem = new javax.swing.JCheckBoxMenuItem();
        gotoMenu = new javax.swing.JMenu();
        caesarMenuItem = new javax.swing.JMenuItem();
        polybiusMenuItem = new javax.swing.JMenuItem();
        enigmaMenuItem = new javax.swing.JMenuItem();
        runMenu = new javax.swing.JMenu();
        runMenuItem = new javax.swing.JMenuItem();
        runSBSMenuItem = new javax.swing.JMenuItem();
        aboutMenu = new javax.swing.JMenu();
        aboutCipherMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Blowfish");

        messageTextField.setText("Enter your message here");

        answerTextArea.setEditable(false);
        answerTextArea.setColumns(20);
        answerTextArea.setLineWrap(true);
        answerTextArea.setRows(5);
        answerTextArea.setText("Press run to see your answer");
        answerTextArea.setToolTipText("");
        answerTextArea.setWrapStyleWord(true);
        answerScrollPane.setViewportView(answerTextArea);

        runButton.setText("Run");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        keyTextField.setText("Enter your key");

        decodeCheckBox.setText("Decode message");
        decodeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodeCheckBoxActionPerformed(evt);
            }
        });

        outputTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Char", "Integer", "Raw", "Hex" }));

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

        blowfishMenuBar.add(fileMenu);

        editMenu.setText("Edit");

        copyResultMenuItem.setText("Copy result");
        editMenu.add(copyResultMenuItem);

        blowfishMenuBar.add(editMenu);

        viewMenu.setText("View");

        decodeCheckBoxMenuItem.setText("Decode message");
        decodeCheckBoxMenuItem.setToolTipText("");
        decodeCheckBoxMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decodeCheckBoxMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(decodeCheckBoxMenuItem);

        gotoMenu.setText("Go to");

        caesarMenuItem.setText("Caesar");
        caesarMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caesarMenuItemActionPerformed(evt);
            }
        });
        gotoMenu.add(caesarMenuItem);

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

        viewMenu.add(gotoMenu);

        blowfishMenuBar.add(viewMenu);

        runMenu.setText("Run");

        runMenuItem.setText("Run");
        runMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runMenuItemActionPerformed(evt);
            }
        });
        runMenu.add(runMenuItem);

        runSBSMenuItem.setText("Run step by step");
        runSBSMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runSBSMenuItemActionPerformed(evt);
            }
        });
        runMenu.add(runSBSMenuItem);

        blowfishMenuBar.add(runMenu);

        aboutMenu.setText("About");

        aboutCipherMenuItem.setText("About cipher");
        aboutCipherMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutCipherMenuItemActionPerformed(evt);
            }
        });
        aboutMenu.add(aboutCipherMenuItem);

        blowfishMenuBar.add(aboutMenu);

        setJMenuBar(blowfishMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(keyTextField)
                            .addComponent(answerScrollPane)
                            .addComponent(messageTextField))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(decodeCheckBox)
                            .addComponent(runButton)
                            .addComponent(outputTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(titleLabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(runButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decodeCheckBox))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answerScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void runSBSMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runSBSMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_runSBSMenuItemActionPerformed

    private void caesarMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caesarMenuItemActionPerformed
        CaesarModel model = new CaesarModel();
        CaesarView view = new CaesarView();
        CaesarController controller = new CaesarController(model, view);
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_caesarMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

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

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
    }//GEN-LAST:event_runButtonActionPerformed

    private void decodeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodeCheckBoxActionPerformed
        if (decodeCheckBoxMenuItem.isSelected()) {
            decodeCheckBoxMenuItem.setSelected(false);
        } else {
            decodeCheckBoxMenuItem.setSelected(true);
        }
    }//GEN-LAST:event_decodeCheckBoxActionPerformed

    private void decodeCheckBoxMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decodeCheckBoxMenuItemActionPerformed
        if (decodeCheckBox.isSelected()) {
            decodeCheckBox.setSelected(false);
        } else {
            decodeCheckBox.setSelected(true);
        }
    }//GEN-LAST:event_decodeCheckBoxMenuItemActionPerformed

    private void runMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runMenuItemActionPerformed
        //runButtonActionPerformed(evt);
    }//GEN-LAST:event_runMenuItemActionPerformed

    private void aboutCipherMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutCipherMenuItemActionPerformed
        AboutBlowfishView aboutBlowfish = new AboutBlowfishView();
        aboutBlowfish.setVisible(true);
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
            java.util.logging.Logger.getLogger(BlowfishView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlowfishView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlowfishView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlowfishView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlowfishView().setVisible(true);
            }
        });
    }
    
    public void addRunActionListener(ActionListener a){
        runButton.addActionListener(a);
    }
    public void addRunMenuItemActionListener(ActionListener a){
        runMenuItem.addActionListener(a);
    }
    public String getMessage(){
        return messageTextField.getText();
    }
    public String getKey(){
        return keyTextField.getText();
    }
    public boolean getIsEncrypted(){
        return decodeCheckBox.isSelected();
    }
    public int getOutputType(){
        return outputTypeComboBox.getSelectedIndex();
    }
    public void setMessage(String s){
        answerTextArea.setText(s);
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutCipherMenuItem;
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JScrollPane answerScrollPane;
    private javax.swing.JTextArea answerTextArea;
    private javax.swing.JMenuBar blowfishMenuBar;
    private javax.swing.JMenuItem caesarMenuItem;
    private javax.swing.JMenuItem copyResultMenuItem;
    private javax.swing.JCheckBox decodeCheckBox;
    private javax.swing.JCheckBoxMenuItem decodeCheckBoxMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem enigmaMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu gotoMenu;
    private javax.swing.JTextField keyTextField;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JComboBox<String> outputTypeComboBox;
    private javax.swing.JMenuItem polybiusMenuItem;
    private javax.swing.JButton runButton;
    private javax.swing.JMenu runMenu;
    private javax.swing.JMenuItem runMenuItem;
    private javax.swing.JMenuItem runSBSMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JMenu viewMenu;
    // End of variables declaration//GEN-END:variables
}
