package view;

import javax.swing.*;
import java.awt.*;

public class TelaBusca extends JFrame {

     //aqui colocamos os atributos que iremos utilizar para montarmos nossa tela
    private JFrame janelaBusca = new JFrame("Buscar");
    private JLabel lblBuscar = new JLabel("Buscar");

    private JButton btnFiliais = new JButton("Filiais");
    private JButton btnBusca = new JButton("Busca");
    private JButton btnMercadoria = new JButton("Mercadoria");

    //método construtor
    public TelaBusca(){

        //aqui setamos as medidas de nossos atributos
        lblBuscar.setFont(new Font("Arial", Font.BOLD, 20));
        lblBuscar.setBounds(130, 20, 160, 30);

        btnFiliais.setBounds(115, 100, 100, 30);
        btnBusca.setBounds(115, 150, 100, 30);
        btnMercadoria.setBounds(115, 200, 100, 30);
        
        janelaBusca.setLayout(null);

        janelaBusca.add(lblBuscar);
        janelaBusca.add(btnFiliais);
        janelaBusca.add(btnBusca);
        janelaBusca.add(btnMercadoria);

        janelaBusca.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        janelaBusca.setVisible(true);
        janelaBusca.setLocationRelativeTo(null); 
        janelaBusca.setSize(350, 350);   
    }

    public static void main(String[] args) {
        new TelaBusca().setVisible(true);
    }
}
