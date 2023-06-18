package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaComBotoes extends JFrame implements ActionListener{
    
    //atributos informados do Swing para formarmos a janela:
    private JFrame frm = new JFrame("GERENCIADOR DE ESTROQUE");
    private JLabel lbl1 = new JLabel("Menu Principal");
    private static JButton btn1 = new JButton("Filiais");
    private JButton btn2 = new JButton("Busca");

    public TelaComBotoes(){
        
        //configurações dos labels
        lbl1.setFont(new Font("Arial", Font.BOLD, 20));
        lbl1.setBounds(100, 20, 160, 30);
        
        //configurações dos botões:
        btn1.setBounds(115, 100, 100, 30);
        btn2.setBounds(115, 150, 100, 30);
        

        frm.setLayout(null);

        //adicionamos os atributos no nosso frame
        frm.add(lbl1);
        frm.add(btn1);
        frm.add(btn2);


        //aqui configuramos as funções do JFrame
        frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null); 
        frm.setSize(350, 350);        
    }

    public void actionPerformed(ActionEvent e){
        Object src = e.getSource();

        if(src == btn1){
            new TelaFilial().setVisible(true);
        }
    }

    public static void main(String[] args) {
        
        TelaComBotoes tm = new TelaComBotoes();
        
        btn1.addActionListener(tm);
    }
  }