package view;

import javax.swing.*;
import java.awt.*;

public class TelaBusca extends JFrame {

     //aqui colocamos os atributos que iremos utilizar para montarmos nossa tela
    private JFrame frm = new JFrame("Buscar");
    private JLabel lbl1 = new JLabel("Buscar");

    private JButton btn1 = new JButton("Filiais");
    private JButton btn2 = new JButton("Busca");
    private JButton btn3 = new JButton("Mercadoria");

    //método construtor
    public TelaBusca(){

        //aqui setamos as medidas de nossos atributos
        lbl1.setFont(new Font("Arial", Font.BOLD, 20));
        lbl1.setBounds(100, 20, 160, 30);

        btn1.setBounds(115, 100, 100, 30);
        btn2.setBounds(115, 150, 100, 30);
        btn3.setBounds(115, 200, 100, 30);
        
        frm.setLayout(null);

        frm.add(lbl1);
        frm.add(btn1);
        frm.add(btn2);
        frm.add(btn3);

        frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null); 
        frm.setSize(350, 350);   
    }

    public static void main(String[] args) {
        new TelaBusca().setVisible(true);
    }
}
