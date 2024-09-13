/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arcanjo.portaria.view;

import com.arcanjo.portaria.view.templates.Janela;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author raphael
 */
public class JanelaSobre extends Janela {
    
    private JLabel texto;
    private JButton botao;
    
    public JanelaSobre() {
        this.criarTexto();
        this.criarBotao();
        
        this.add(texto);
        this.add(botao);
        
        setTitle("Sobre");
    }

    private void criarTexto() {
        texto = new JLabel();
        texto.setText("Esse aplicativo foi criado por Raphael Arcanjo");
        texto.setHorizontalAlignment(JLabel.CENTER);
        texto.setVerticalAlignment(JLabel.TOP);
        texto.setBounds(0, 50, 600, 200);
    }
    
    private void criarBotao() {
        botao = new JButton("Fechar");
        botao.setHorizontalAlignment(JButton.CENTER);
        botao.setVerticalAlignment(JButton.CENTER);
        botao.setFocusable(false);
        botao.setBounds(150, 200, 150, 50);
        botao.addActionListener(ae -> this.dispose());
    }
    
}
