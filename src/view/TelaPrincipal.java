package view;

import javax.swing.*;

import control.ControleDados;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author Diego Carlito
 * @author Filipe Carvalho
 * @author Marcos Castilhos
 * Classe view TelaPrincipal, dá acesso às telas filial e mercadoria
 */
public class TelaPrincipal extends JFrame {
    
    /**
     * atributos informados do Swing para formarmos a janela:
     */
    private JFrame janelaMenu = new JFrame("Gerenciador de Estoque");
    private JLabel lblTitulo = new JLabel("Menu Principal");
    private JButton btnFilial = new JButton("Filiais");
    private JButton btnMercadoria = new JButton("Mercadoria");
    
    ControleDados cd = new ControleDados();

    public TelaPrincipal(){
        
        /**
         * configurações dos labels
         */
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBounds(100, 20, 160, 30);
        
        /**
         * configurações dos botões:
         */
        btnFilial.setBounds(115, 100, 100, 30);
        btnMercadoria.setBounds(115, 150, 100, 30);
        

        janelaMenu.setLayout(null);

        /**
         * adicionamos os atributos no nosso frame
         */
        janelaMenu.add(lblTitulo);
        janelaMenu.add(btnFilial);
        janelaMenu.add(btnMercadoria);


        /**
         * aqui configuramos as funções do JFrame
         */
        janelaMenu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janelaMenu.setVisible(true);
        janelaMenu.setSize(350, 350); 
        janelaMenu.setLocationRelativeTo(null);        
        
        btnFilial.addActionListener(new ActionListener() {
        	
        	/**
        	 * metodo para exibição de tela de filiais
        	 */
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		new TelaFilial();
				
        	}
        });
         btnMercadoria.addActionListener(new ActionListener() {
        	
        	 /**
        	  * metodo para exibição de tela de mercadorias
        	  */
        	@Override
        	public void actionPerformed(ActionEvent e) {
        	    new TelaSelecao();
        	}
        });
        
    }
    public static void main(String[] args) {
        new TelaPrincipal();
    }
  }