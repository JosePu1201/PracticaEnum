/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.practicaenum;

import javax.swing.*;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ventana extends JFrame{
    private JPanel panel;
    public Ventana(JPanel panel) {
        this.panel = panel;
        this.setSize(500, 450);
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
    
    
}
