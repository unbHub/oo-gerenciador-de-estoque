package view;

import javax.swing.*;
import java.awt.*;

public class TelaFilial extends JFrame {
    
    //aqui colocamos os atributos que iremos utilizar para montarmos nossa tela

    //atributos para montagem dos labels
    private JFrame frm = new JFrame("Filiais");
    private JLabel lbl1 = new JLabel("Filiais");

    //aqui utilizamos um recurso do Swing para adicionarmos ícones em nossos botões
    private ImageIcon img1 = new ImageIcon("C:/Users/f1l1p/Desktop/TOP SECRET/projeto oo/OO-UnB---2023.1---Gerenciamento-de-Estoque-/gerestoque/bin/images/maizin.png");
    private ImageIcon img4 = new ImageIcon("C:/Users/f1l1p/Desktop/TOP SECRET/projeto oo/OO-UnB---2023.1---Gerenciamento-de-Estoque-/gerestoque/bin/images/atualizar.png");
    
    //botões
    private JButton btn1 = new JButton("Adicionar Filial", img1);
    private JButton btn2 = new JButton("Atualizar", img4);
    
    //lista de filiais cadastradas em nosso sistema
    private String[] filiais = {"Congonhas", "Japão", "Jacarezinho", "Acre"};
    private JList lst = new JList(filiais);


    //método construtor que irá gerar nossa tela
    public TelaFilial(){

        //aqui setamos as medidas e as posições de nossos labels
        lbl1.setFont(new Font("Arial", Font.BOLD, 20));
        lbl1.setBounds(10, 0, 500, 30);

        //posição e tamanho da nossa lista
        lst.setBounds(10, 50, 150, 300);

        //posição e tamanho dos botões
        btn1.setBounds(170, 100, 200, 30);
        btn2.setBounds(170, 200, 200, 30);

        frm.setLayout(null);

        //aqui adicionamos todos os elementos em nosso JFrame
        frm.add(lbl1);
        frm.add(BorderLayout.WEST, lst);
        frm.add(btn1);
        frm.add(btn2);


        //aqui configuramos o nosso JFrame
        frm.setVisible(true);
        frm.setLocationRelativeTo(null); 
        frm.setSize(400, 300);  
        frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TelaFilial().setVisible(true);
    }
}
