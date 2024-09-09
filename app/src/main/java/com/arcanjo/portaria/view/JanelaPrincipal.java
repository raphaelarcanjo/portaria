/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arcanjo.portaria.view;

import com.arcanjo.portaria.view.templates.Janela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author raphael
 */
public class JanelaPrincipal extends Janela implements ActionListener{
    
    public JanelaPrincipal() {
        JButton botaoOk = new JButton();
        botaoOk.setText("Clique aqui");
        botaoOk.setHorizontalAlignment(JButton.CENTER);
        botaoOk.setVerticalAlignment(JButton.CENTER);
        botaoOk.setFocusable(false);
        botaoOk.setBounds(150, 50, 150, 50);
        botaoOk.addActionListener(this);
        
        this.add(botaoOk);
        
        setTitle("Cadastro de visitante");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JOptionPane.showMessageDialog(null, "Isso é uma mensagem de teste", "Teste", JOptionPane.ERROR_MESSAGE);
//        JFrame janelaSecundaria = new Janela();
//        janelaSecundaria.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}
