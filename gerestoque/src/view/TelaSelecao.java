package view;

import model.*;
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
    private JButton btnFiltrarMercadoria = new JButton("Filtrar Mercadorias");
    
    private JTextField txtFiltroMercadoria = new JTextField();
    
    DefaultTableModel modelM = new DefaultTableModel();
    JTable jTMercadorias = new JTable(modelM);
    JScrollPane scrollpaineltabela = new JScrollPane(jTMercadorias);

    public TelaSelecao(){
        
        lblDadosMercadoria.setFont(new Font("Arial", Font.BOLD, 15));
        lblDadosMercadoria.setBounds(70, 270, 250, 25);

        btnAlimento.setBounds(50, 300, 90, 30);
        btnBebida.setBounds(140, 300, 90, 30);
        btnCasa.setBounds(230, 300, 90, 30);
        btnFiltrarMercadoria.setBounds(110, 340, 150, 30);
        
        txtFiltroMercadoria.setBounds(150, 10, 200, 25);
        
        janelaSelecao.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaSelecao.setVisible(true);
        janelaSelecao.setSize(385, 500); 
        janelaSelecao.setLocationRelativeTo(null);  
        
        janelaSelecao.setLayout(null);
        
        janelaSelecao.add(lblDadosMercadoria);
        janelaSelecao.add(btnAlimento);
        janelaSelecao.add(btnBebida);
        janelaSelecao.add(btnCasa);
        janelaSelecao.add(btnFiltrarMercadoria);
        janelaSelecao.add(txtFiltroMercadoria);
    	
        scrollpaineltabela.setBounds(10, 50, 350, 150);
        janelaSelecao.getContentPane().add(scrollpaineltabela);
        scrollpaineltabela.setViewportView(jTMercadorias);	
        
        modelM.addColumn("Nome");
        modelM.addColumn("Id");
        
        for (Mercadoria m : Dados.mercadorias) {
            modelM.addRow(new Object[]{m.getNome(), m.getCodigo()});
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
        
        btnFiltrarMercadoria.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		// Obtém o texto do campo de filtro
        		String filtroTexto = txtFiltroMercadoria.getText().trim();
        		
        		// Limpa o modelo de dados atual
        		modelM.setRowCount(0);
        		
        		// Verifica se o campo de filtro está vazio
	        	if (filtroTexto.isEmpty()) {
	        		for (Mercadoria dado : Dados.getMercadorias()) {
	        			modelM.addRow(new Object[]{dado.getNome(), dado.getCodigo()});
	        		}
	        	} else {
	        		// Filtra os dados com base no texto do filtro
                    for (Mercadoria dado : Dados.getMercadorias()) {
                        if ((dado.getNome().equalsIgnoreCase(filtroTexto) || 
                        		(dado.getCodigo().equals(filtroTexto)))) {
                            modelM.addRow(new Object[]{dado.getNome(), dado.getCodigo()});
                        }
                    }
	        	}
	        	
        	}
	    });
    }
}


