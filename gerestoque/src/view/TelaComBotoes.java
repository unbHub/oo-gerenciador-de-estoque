package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaComBotoes extends JFrame {
    
    //atributos informados do Swing para formarmos a janela:
    private JFrame janelaMenu = new JFrame("GERENCIADOR DE ESTROQUE");
    private JLabel lblTitulo = new JLabel("Menu Principal");
    private JButton btnFilial = new JButton("Filiais");
    private JButton btnMercadoria = new JButton("Mercadoria");

    public TelaComBotoes(){
        
        //configurações dos labels
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBounds(100, 20, 160, 30);
        
        //configurações dos botões:
        btnFilial.setBounds(115, 100, 100, 30);
        //btnBusca.setBounds(115, 150, 100, 30);
        btnMercadoria.setBounds(115, 150, 100, 30);
        

        janelaMenu.setLayout(null);

        //adicionamos os atributos no nosso frame
        janelaMenu.add(lblTitulo);
        janelaMenu.add(btnFilial);
        janelaMenu.add(btnMercadoria);


        //aqui configuramos as funções do JFrame
        janelaMenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janelaMenu.setVisible(true);
        janelaMenu.setSize(350, 350); 
        janelaMenu.setLocationRelativeTo(null);        
        
        btnFilial.addActionListener(new ActionListener() {
        	
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		new TelaFilial();
				
        	}
        });
         btnMercadoria.addActionListener(new ActionListener() {
        	
        	@Override
        	public void actionPerformed(ActionEvent e) {
        	    new TelaSelecao();
        	}
        });
        
    }


    public static void main(String[] args) {
        new TelaComBotoes();
    }
  }