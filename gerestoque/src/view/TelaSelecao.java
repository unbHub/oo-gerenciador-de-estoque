package view;

import model.*;
import control.ControleDados;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSelecao{
    
    private JFrame janelaMercadoria = new JFrame("Mercadoria");
    private JLabel lblDadosMercadoria = new JLabel("Selecione o tipo de mercadoria: ");

    private static JButton btnAlimento = new JButton("Alimento");
    private static JButton btnBebida = new JButton("Bebida");
    private static JButton btnCasa = new JButton("Casa");

    public TelaSelecao(){
        
        lblDadosMercadoria.setFont(new Font("Arial", Font.BOLD, 15));
        lblDadosMercadoria.setBounds(30, 20, 250, 25);

        btnAlimento.setBounds(93, 70, 150, 30);
        btnBebida.setBounds(93, 110, 150, 30);
        btnCasa.setBounds(93, 150, 150, 30);
        
        janelaMercadoria.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaMercadoria.setVisible(true);
        janelaMercadoria.setSize(350, 300); 
        janelaMercadoria.setLocationRelativeTo(null);  
        
        janelaMercadoria.setLayout(null);
        
        janelaMercadoria.add(lblDadosMercadoria);
        janelaMercadoria.add(btnAlimento);
        janelaMercadoria.add(btnBebida);
        janelaMercadoria.add(btnCasa);

        

        btnAlimento.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaMercadoria().alterarCadastro(1);  
            }
        });

        btnBebida.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaMercadoria().alterarCadastro(2);
            }
            
        });

        btnCasa.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaMercadoria().alterarCadastro(3);
            }
            
        });
    }
}


    /*public void actionPerformed(ActionEvent e){
        Object src = e.getSource();

        if(src == btnAlimento)
            new TelaMercadoria().alterarCadastro(1);

        if(src == btnBebida){
            new TelaMercadoria().alterarCadastro(2);
        }

        if(src == btnCasa){
            new TelaMercadoria().alterarCadastro(3);
        }*/

