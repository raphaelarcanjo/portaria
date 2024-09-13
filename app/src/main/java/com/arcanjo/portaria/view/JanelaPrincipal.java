/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arcanjo.portaria.view;

import com.arcanjo.portaria.view.templates.Janela;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author raphael
 */
public class JanelaPrincipal extends Janela {
    
    private JMenuBar barraMenu;
    private JButton botaoAdicionarVisitante;
    private JButton botaoRemoverVisitante;
    
    public JanelaPrincipal() {
        this.criarBarraMenu();
        this.criarBotaoAdicionarVisitante();
        this.criarBotaoRemoverVisitante();
        
        this.add(botaoAdicionarVisitante);
        this.add(botaoRemoverVisitante);
        
        setJMenuBar(barraMenu);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void criarBarraMenu() {
        barraMenu = new JMenuBar();
        
        JMenu morador = criarMenuMorador();
        JMenu visitante = criarMenuVisitante();
        JMenu ajuda = criarMenuAjuda();
        
        barraMenu.add(morador);
        barraMenu.add(visitante);
        barraMenu.add(ajuda);
    }
    
    private JMenu criarMenuAjuda() {
        JMenu ajuda = new JMenu("Ajuda");
        
        JMenuItem sobre = new JMenuItem("Sobre");
        sobre.addActionListener(ae -> new JanelaSobre());

        ajuda.add(sobre);
        
        return ajuda;
    }
    
    private JMenu criarMenuVisitante() {
        JMenu visitante = new JMenu("Visitante");
        
        JMenuItem novo = new JMenuItem("Novo");
        visitante.add(novo);
        
        JMenuItem listar = new JMenuItem("Listar");
        visitante.add(listar);
        
        return visitante;
    }
    
    private JMenu criarMenuMorador() {
        JMenu morador = new JMenu("Morador");
        
        JMenuItem novo = new JMenuItem("Novo");
        morador.add(novo);
        
        JMenuItem listar = new JMenuItem("Listar");
        morador.add(listar);
        
        return morador;
    }
    
    private void criarBotaoAdicionarVisitante() {
        botaoAdicionarVisitante = new JButton();
        botaoAdicionarVisitante.setText("Adicionar visitante");
        botaoAdicionarVisitante.setHorizontalAlignment(JButton.CENTER);
        botaoAdicionarVisitante.setVerticalAlignment(JButton.CENTER);
        botaoAdicionarVisitante.setFocusable(false);
        botaoAdicionarVisitante.setBounds(50, 300, 200, 50);
        botaoAdicionarVisitante.addActionListener(ae -> {
            String msg = "Insira o nome do visitante";
            String titulo = "Adicionar visitante";
            String nome = JOptionPane.showInputDialog(null, msg, titulo, JOptionPane.INFORMATION_MESSAGE);
            System.out.println(nome);

        });
    }
    
    private void criarBotaoRemoverVisitante() {
        botaoRemoverVisitante = new JButton();
        botaoRemoverVisitante.setText("Remover visitante");
        botaoRemoverVisitante.setHorizontalAlignment(JButton.CENTER);
        botaoRemoverVisitante.setVerticalAlignment(JButton.CENTER);
        botaoRemoverVisitante.setFocusable(false);
        botaoRemoverVisitante.setBounds(350, 300, 200, 50);
        botaoRemoverVisitante.addActionListener(ae -> {
            String msg = "Realmente deseja prosseguir?";
            String titulo = "Remover visitante?";
            int resposta = JOptionPane.showConfirmDialog(null, msg, titulo, JOptionPane.WARNING_MESSAGE);
            System.out.println(resposta);
        });
    }
    
}
