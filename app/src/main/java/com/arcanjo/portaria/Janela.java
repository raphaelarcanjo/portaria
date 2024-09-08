/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arcanjo.portaria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author raphael
 */
public class Janela extends JFrame implements ActionListener{
    
    public Janela() {
        JButton botaoOk = new JButton();
        botaoOk.setText("Clique aqui");
        botaoOk.setHorizontalAlignment(JButton.CENTER);
        botaoOk.setVerticalAlignment(JButton.CENTER);
        botaoOk.setFocusable(false);
        botaoOk.setBounds(150, 50, 150, 50);
        botaoOk.addActionListener(this);
        
        this.add(botaoOk);
        
        setTitle("Cadastro de visitante");
        setLayout(null);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JOptionPane.showMessageDialog(null, "Isso é uma mensagem de teste", "Teste", JOptionPane.ERROR_MESSAGE);
//        JFrame janelaSecundaria = new Janela();
//        janelaSecundaria.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}
