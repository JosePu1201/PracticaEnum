/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practicaenum;

import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Panel extends javax.swing.JPanel {

    /**
     * Creates new form Panel
     */
    public Panel() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        textoEntrada = new javax.swing.JTextArea();
        ok = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(51, 51, 255));
        setForeground(new java.awt.Color(0, 0, 255));
        setLayout(new java.awt.GridBagLayout());

        textoEntrada.setBackground(new java.awt.Color(0, 0, 0));
        textoEntrada.setColumns(20);
        textoEntrada.setForeground(new java.awt.Color(255, 255, 255));
        textoEntrada.setRows(5);
        jScrollPane1.setViewportView(textoEntrada);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 299;
        gridBagConstraints.ipady = 97;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 77, 0, 88);
        add(jScrollPane1, gridBagConstraints);

        ok.setBackground(new java.awt.Color(0, 0, 0));
        ok.setForeground(new java.awt.Color(255, 255, 255));
        ok.setText("Verificar");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 5, 38, 0);
        add(ok, gridBagConstraints);

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("Texto de entrada: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 77, 0, 0);
        add(jLabel1, gridBagConstraints);

        jLabel2.setBackground(new java.awt.Color(0, 255, 255));
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Resultado: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 77, 0, 0);
        add(jLabel2, gridBagConstraints);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 299;
        gridBagConstraints.ipady = 120;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 77, 0, 88);
        add(jScrollPane2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        String entrda = textoEntrada.getText();
        if(entrda.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay texto de entrda");
        }
        else{
            int espacios = 0;
            for (int i = 0; i < entrda.length(); i++) {
                char a = entrda.charAt(i);
                if(a == ' '){
                    espacios++;
                }
            }
            System.out.println(espacios);
        }
    }//GEN-LAST:event_okActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton ok;
    private javax.swing.JTextArea textoEntrada;
    // End of variables declaration//GEN-END:variables
}
