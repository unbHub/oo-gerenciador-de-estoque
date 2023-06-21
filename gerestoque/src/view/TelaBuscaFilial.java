package view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class TelaBuscaFilial extends JFrame {
 	private JFrame janelaBuscaFilial = new JFrame("Buscar Filial");
    private JLabel lblIdFilial = new JLabel("Identificador da Filial:");
    private JTextField txtIdFilial = new JTextField();
    private JButton btnBuscar = new JButton("Buscar");

    //método construtor
    public TelaBuscaFilial(){

        //aqui setamos as medidas de nossos atributos
        lblIdFilial.setFont(new Font("Arial", Font.BOLD, 20));
        lblIdFilial.setBounds(80, 20, 260, 30);

        btnBuscar.setBounds(130, 100, 100, 30);
        
        txtIdFilial.setPreferredSize(new Dimension(300, 25));
        txtIdFilial.setBounds(80, 60, 200, 25);
        
        janelaBuscaFilial.setLayout(null);

        janelaBuscaFilial.add(lblIdFilial);
        janelaBuscaFilial.add(btnBuscar);
        janelaBuscaFilial.add(txtIdFilial);

        janelaBuscaFilial.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janelaBuscaFilial.setVisible(true);
        janelaBuscaFilial.setLocationRelativeTo(null); 
        janelaBuscaFilial.setSize(350, 175);   
    }
    
    public static void main(String[] args) {
        new TelaBuscaFilial().setVisible(true);
    }
}
