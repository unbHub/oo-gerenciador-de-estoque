package view;

import java.awt.*;

import javax.swing.*;


public class TelaCadastro extends JFrame{

    //aqui colocamos os atributos que iremos utilizar para montarmos nossa tela
    private JFrame frm = new JFrame("Cadastro");

    //atributos para montagem dos labels
    private JLabel lbl1 = new JLabel("Digite o nome da filial: ");
    private JLabel lbl2 = new JLabel("Digite o identificador da filial: ");
    
    //atributos para os campos de texto
    private JTextField txt1 = new JTextField();
    private JTextField txt2 = new JTextField();

    //botões
    private static JButton btn1 = new JButton("Salvar");
    private static JButton btn2 = new JButton("Excluir");
    private static JButton btn3 = new JButton("Relatório");
    private static JButton btn4 = new JButton("Estoque");

    public TelaCadastro(){

        //aqui setamos as medidas e as posições de nossos labels
        lbl1.setBounds(30, 20, 150, 25);
        lbl2.setBounds(30, 60, 200, 25);

        //medidas e posições dos botões
        btn1.setBounds(20, 100, 100, 30);
        btn2.setBounds(20, 140, 100, 30);
        btn3.setBounds(260, 100, 100, 30);
        btn4.setBounds(260, 140, 100, 30);

        //campos de texto
        txt1.setPreferredSize(new Dimension(300, 25));
        txt1.setBounds(180, 20, 180, 25);
        txt2.setPreferredSize(new Dimension(300, 25));
        txt2.setBounds(200, 60, 160, 25);



        frm.setLayout(null);

        //aqui adicionamos todos os elementos em nosso JFrame
        frm.add(lbl1);
        frm.add(lbl2);
        frm.add(txt1);
        frm.add(txt2);
        frm.add(btn1);
        frm.add(btn2);
        frm.add(btn3);
        frm.add(btn4);

        //aqui configuramos o nosso JFrame
        frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null); 
        frm.setSize(400, 250);     

    }

    
    public static void main(String[] args) {
        new TelaCadastro().setVisible(true);
    }


}