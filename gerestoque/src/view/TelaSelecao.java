package view;

import model.*;
import model.Filial;
import model.Alimento;
import model.Casa;
import model.Bebida;
import control.ControleDados;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class TelaSelecao{
    
    private JFrame janelaSelecao = new JFrame("Mercadoria");
    private JLabel lblDadosMercadoria = new JLabel("Selecione o tipo de mercadoria: ");

    private static JButton btnAlimento = new JButton("Alimento");
    private static JButton btnBebida = new JButton("Bebida");
    private static JButton btnCasa = new JButton("Casa");
    
    DefaultTableModel modelF = new DefaultTableModel();
    JTable jTFiliais = new JTable(modelF);
    JScrollPane scrollpaineltabela = new JScrollPane(jTFiliais);
    
    public ArrayList<Filial> filiais = new ArrayList<Filial>();
    

    public TelaSelecao(){
        
        lblDadosMercadoria.setFont(new Font("Arial", Font.BOLD, 15));
        lblDadosMercadoria.setBounds(70, 270, 250, 25);

        btnAlimento.setBounds(50, 300, 90, 30);
        btnBebida.setBounds(140, 300, 90, 30);
        btnCasa.setBounds(230, 300, 90, 30);
        
        janelaSelecao.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaSelecao.setVisible(true);
        janelaSelecao.setSize(385, 500); 
        janelaSelecao.setLocationRelativeTo(null);  
        
        janelaSelecao.setLayout(null);
        
        janelaSelecao.add(lblDadosMercadoria);
        janelaSelecao.add(btnAlimento);
        janelaSelecao.add(btnBebida);
        janelaSelecao.add(btnCasa);

    	DefaultTableModel modelF = (DefaultTableModel) jTFiliais.getModel();
      	modelF = new DefaultTableModel();
    	jTFiliais = new JTable(modelF);
    	scrollpaineltabela = new JScrollPane(jTFiliais);
    	
        scrollpaineltabela.setBounds(10, 50, 350, 150);
        janelaSelecao.getContentPane().add(scrollpaineltabela);
        scrollpaineltabela.setViewportView(jTFiliais);	
        
        modelF.addColumn("Nome");
        modelF.addColumn("Id");
        
        for (Mercadoria m : Dados.mercadorias) {
            modelF.addRow(new Object[]{m.getNome(), m.getCodigo()});
        }
        

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


