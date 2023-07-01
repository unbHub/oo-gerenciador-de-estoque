package view;

import javax.swing.*;

import control.ControleDados;
import model.Dados;
import model.Filial;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaBusca extends JFrame {

    ControleDados cd = new ControleDados();

     //aqui colocamos os atributos que iremos utilizar para montarmos nossa tela
    private JFrame janelaBusca = new JFrame("Buscar por Mercadoria");
    
    private JLabel lblBuscar = new JLabel("Buscar Mercadoria");
    private JLabel lblNomeMercadoria = new JLabel("Nome:");
    private JLabel lblIdMercadoria = new JLabel("Id:");
    private JLabel lblFilial = new JLabel("Filial:");
    
    private JTextField txtNomeMercadoria = new JTextField();
    private JTextField txtIdMercadoria = new JTextField();
    
    private JComboBox<String> boxFiliais = new JComboBox<String>();
    
    private static JButton btnBuscar = new JButton("Buscar");

    //método construtor
    public TelaBusca(){

        //aqui setamos as medidas de nossos atributos
        lblBuscar.setFont(new Font("Arial", Font.BOLD, 20));
        lblBuscar.setBounds(80, 20, 200, 30);
        lblNomeMercadoria.setBounds(30, 60, 200, 25);
        lblIdMercadoria.setBounds(30, 100, 200, 25);
        lblFilial.setBounds(30, 140, 200, 25);
        
        txtNomeMercadoria.setPreferredSize(new Dimension(300, 25));
        txtNomeMercadoria.setBounds(80, 60, 200, 25);
        txtIdMercadoria.setPreferredSize(new Dimension(300, 25));
        txtIdMercadoria.setBounds(80, 100, 200, 25);
        
        boxFiliais.setBounds(80, 140, 100, 25);
        
        // Adiciona o nome das Filiais cadastradas no JComboBox
        for (Filial dado : Dados.getFiliais()) {
            boxFiliais.addItem(dado.getNome());
        }
        
        btnBuscar.setBounds(115, 200, 100, 30);
        
        janelaBusca.setLayout(null);

        janelaBusca.add(lblBuscar);
        janelaBusca.add(lblNomeMercadoria);
        janelaBusca.add(lblIdMercadoria);
        janelaBusca.add(lblFilial);
        janelaBusca.add(txtNomeMercadoria);
        janelaBusca.add(txtIdMercadoria);
        janelaBusca.add(boxFiliais);
        janelaBusca.add(btnBuscar);
       

        janelaBusca.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        janelaBusca.setVisible(true);
        janelaBusca.setLocationRelativeTo(null); 
        janelaBusca.setSize(350, 350);           
        
//        btnMercadoria.addActionListener(new ActionListener() {
//        	
//        	@Override
//        	public void actionPerformed(ActionEvent e) {
//        		new TelaBuscaMercadoria().setVisible(true);
//				
//        	}
//        });
    }
    
    public static void main(String[] args) {
    	new TelaBusca();
    }

}
