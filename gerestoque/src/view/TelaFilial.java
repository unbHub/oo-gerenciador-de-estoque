package view;

import model.*;
import model.Dados;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaFilial extends JFrame implements ActionListener {
    
	//private String novoDado[] = new String[8];
    //aqui colocamos os atributos que iremos utilizar para montarmos nossa tela

    //atributos para montagem dos labels
    private JFrame janelaFilial = new JFrame("Filiais");
    private JLabel lblFilial = new JLabel("Filiais");
    private JTextField nomeFilial;

    //aqui utilizamos um recurso do Swing para adicionarmos ícones em nossos botões
    //private ImageIcon img1 = new ImageIcon("C:/Users/f1l1p/Desktop/TOP SECRET/projeto oo/OO-UnB---2023.1---Gerenciamento-de-Estoque-/gerestoque/bin/images/maizin.png");
    //private ImageIcon img4 = new ImageIcon("C:/Users/f1l1p/Desktop/TOP SECRET/projeto oo/OO-UnB---2023.1---Gerenciamento-de-Estoque-/gerestoque/bin/images/atualizar.png");
    
    //botões
    private JButton btn1 = new JButton("Adicionar Filial", img1);
    private JButton btn2 = new JButton("Atualizar", img4);
    
    //lista de filiais cadastradas em nosso sistema
    private String[] filiais = {"Congonhas", "Japão", "Jacarezinho", "Acre"};
    private JList lst = new JList(filiais);
    
    


    //método construtor que irá gerar nossa tela
    public TelaFilial(){

        TelaFilial tf = new TelaFilial();

        //aqui setamos as medidas e as posições de nossos labels
        lblFilial.setFont(new Font("Arial", Font.BOLD, 20));
        lblFilial.setBounds(10, 0, 500, 30);

        //posição e tamanho da nossa lista
        lst.setBounds(10, 50, 150, 300);

        //posição e tamanho dos botões
        btnAdicionarFilial.setBounds(170, 100, 200, 30);
        btnAtualizarFilial.setBounds(170, 200, 200, 30);

        janelaFilial.setLayout(null);

        //aqui adicionamos todos os elementos em nosso JFrame
        janelaFilial.add(lblFilial);
        janelaFilial.add(BorderLayout.WEST, lst);
        janelaFilial.add(btnAdicionarFilial);
        janelaFilial.add(btnAtualizarFilial);


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
