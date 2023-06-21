package view;

import java.awt.*;

import javax.swing.*;


public class TelaCadastro extends JFrame{

    //aqui colocamos os atributos que iremos utilizar para montarmos nossa tela
    private JFrame janelaCadastroFilial = new JFrame("Cadastro");

    //atributos para montagem dos labels
    private JLabel lblNomeFilial = new JLabel("Digite o nome da filial: ");
    private JLabel lblIdFilial = new JLabel("Digite o identificador da filial: ");
    
    //atributos para os campos de texto
    private JTextField txtNomeFilial = new JTextField();
    private JTextField txtIdFilial = new JTextField();

    //botões
    private static JButton btnSalvarFilial = new JButton("Salvar");
    private static JButton btnExcluirFilial = new JButton("Excluir");
    private static JButton btnRelatorio = new JButton("Relatório");
    private static JButton btnEstoque = new JButton("Estoque");

    public TelaCadastro(){

        //aqui setamos as medidas e as posições de nossos labels
        lblNomeFilial.setBounds(30, 20, 150, 25);
        lblIdFilial.setBounds(30, 60, 200, 25);

        //medidas e posições dos botões
        btnSalvarFilial.setBounds(20, 100, 100, 30);
        btnExcluirFilial.setBounds(20, 140, 100, 30);
        btnRelatorio.setBounds(260, 100, 100, 30);
        btnEstoque.setBounds(260, 140, 100, 30);

        //campos de texto
        txtNomeFilial.setPreferredSize(new Dimension(300, 25));
        txtNomeFilial.setBounds(180, 20, 180, 25);
        txtIdFilial.setPreferredSize(new Dimension(300, 25));
        txtIdFilial.setBounds(200, 60, 160, 25);



        janelaCadastroFilial.setLayout(null);

        //aqui adicionamos todos os elementos em nosso JFrame
        janelaCadastroFilial.add(lblNomeFilial);
        janelaCadastroFilial.add(lblIdFilial);
        janelaCadastroFilial.add(txtNomeFilial);
        janelaCadastroFilial.add(txtIdFilial);
        janelaCadastroFilial.add(btnSalvarFilial);
        janelaCadastroFilial.add(btnExcluirFilial);
        janelaCadastroFilial.add(btnRelatorio);
        janelaCadastroFilial.add(btnEstoque);

        //aqui configuramos o nosso JFrame
        janelaCadastroFilial.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janelaCadastroFilial.setVisible(true);
        janelaCadastroFilial.setLocationRelativeTo(null); 
        janelaCadastroFilial.setSize(400, 250);     

    }

    
    public static void main(String[] args) {
        new TelaCadastro().setVisible(true);
    }


}