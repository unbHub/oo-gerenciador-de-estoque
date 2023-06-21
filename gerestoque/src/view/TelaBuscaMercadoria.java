package view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class TelaBuscaMercadoria extends JFrame {
	private JFrame janelaBuscaMercadoria = new JFrame("Buscar Filial");
    private JLabel lblIdMercadoria = new JLabel("Identificador da Mercadoria:");
    private JTextField txtIdMercadoria = new JTextField();
    private JButton btnBuscar = new JButton("Buscar");

    //método construtor
    public TelaBuscaMercadoria(){

        //aqui setamos as medidas de nossos atributos
        lblIdMercadoria.setFont(new Font("Arial", Font.BOLD, 20));
        lblIdMercadoria.setBounds(50, 20, 280, 30);

        btnBuscar.setBounds(130, 100, 100, 30);
        
        txtIdMercadoria.setPreferredSize(new Dimension(300, 25));
        txtIdMercadoria.setBounds(80, 60, 200, 25);
        
        janelaBuscaMercadoria.setLayout(null);

        janelaBuscaMercadoria.add(lblIdMercadoria);
        janelaBuscaMercadoria.add(btnBuscar);
        janelaBuscaMercadoria.add(txtIdMercadoria);

        janelaBuscaMercadoria.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janelaBuscaMercadoria.setVisible(true);
        janelaBuscaMercadoria.setLocationRelativeTo(null); 
        janelaBuscaMercadoria.setSize(350, 175);   
    }
    
    public static void main(String[] args) {
        new TelaBuscaMercadoria().setVisible(true);
    }
}
