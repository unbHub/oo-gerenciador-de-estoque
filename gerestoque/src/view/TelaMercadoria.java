package view;

import javax.swing.*;

import control.ControleDados;
import model.Dados;
import model.Empresa;
import model.Filial;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.ArrayList;

public class TelaMercadoria extends JFrame { 

    ControleDados cd = new ControleDados();
    Dados dt = new Dados();
    
    //aqui colocamos os atributos que iremos utilizar para montarmos nossa tela

    //atributos para montagem dos labels
    private JFrame janelaMercadoria = new JFrame("Mercadoria");
    private JLabel lblDadosMercadoria = new JLabel("Digite os dados da mercadoria: ");
    private JLabel lblNomeMercadoria = new JLabel("Nome:");
    private JLabel lblIdMercadoria = new JLabel("Identificador:");
    private JLabel lblQntMercadoria = new JLabel("Quantidade: ");
    private JLabel lblValorMercadoria = new JLabel("Valor:  R$");
    private JLabel lblDataValidade = new JLabel("Data de validade:");
    private JLabel lblFornecedor = new JLabel("Fornecedor:");
    private JLabel lblFilial = new JLabel("Filial:");
    private JLabel lblTipoMercadoria = new JLabel("Tipo:");

    //atributos para os campos de texto
    private JTextField txtNomeMercadoria = new JTextField();
    private JTextField txtQntMercadoria = new JTextField();
    private JTextField txtIdMercadoria = new JTextField();
    private JTextField txtValorMercadoria = new JTextField();
    private JTextField txtDataValidade = new JTextField();
    private JTextField txtFornecedor = new JTextField();

    //botões
    private JButton btnSalvarMercadoria = new JButton("Salvar");
    //private JButton btnExcluirMercadoria = new JButton("Excluir");

    private JComboBox<String> boxFiliais = new JComboBox<String>();
    private JComboBox<String> boxTipoDeMercadoria = new JComboBox<String>();


    //método construtor que irá gerar nossa tela
    public TelaMercadoria(){

        btnSalvarMercadoria.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	
                String nomeMercadoria = txtNomeMercadoria.getText();
                int qntMercadoria = txtQntMercadoria.getText();
                String idMercadoria = txtIdMercadoria.getText();
                double valorMercadoria = txtValorMercadoria.getText();
                Date dataValidade = txtDataValidade.getText();
                String fornecedor = txtFornecedor.getText();
                
                if(nomeMercadoria.isEmpty() == true){
                    JOptionPane.showMessageDialog(null, "Insira o nome da mercadoria");

                }if(idMercadoria.isEmpty() == true){
                    JOptionPane.showMessageDialog(null, "Insira o identificador da mercadoria");
                }else if(!idMercadoria.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas números no identificador da mercadoria");
                }else if(dataValidade.matches("[0-9]+")){
                     JOptionPane.showMessageDialog(null, "Insira apenas números no identificador da mercadoria");
                }

                else{
                Dados.getMercadorias().add(cd.inserirMercadorias(nomeMercadoria, 
                		qntMercadoria, valorMercadoria, idMercadoria, dataValidade, 
                		fornecedor));
                JOptionPane.showMessageDialog(null, "Mercadoria registrada com sucesso! :)");}
            }
            
        });

        //aqui setamos as medidas e as posições de nossos labels
        lblDadosMercadoria.setFont(new Font("Arial", Font.BOLD, 15));
        lblDadosMercadoria.setBounds(30, 20, 250, 25);
        lblNomeMercadoria.setBounds(30, 60, 200, 25);
        lblQntMercadoria.setBounds(30, 100, 200, 25);
        lblIdMercadoria.setBounds(30, 140, 200, 25);
        lblValorMercadoria.setBounds(30, 180, 200, 25);
        lblDataValidade.setBounds(30, 230, 200, 25);
        lblFornecedor.setBounds(30, 270, 200, 25);
        lblFilial.setBounds(30, 320, 200, 25);
        lblTipoMercadoria.setBounds(30, 350, 200, 25);

        //medidas e posições dos botões
        btnSalvarMercadoria.setBounds(30, 410, 100, 30);
        //btnExcluirMercadoria.setBounds(190, 410, 100, 30);
     

        //campos de texto
        txtNomeMercadoria.setPreferredSize(new Dimension(300, 25));
        txtNomeMercadoria.setBounds(80, 60, 100, 25);
        txtQntMercadoria.setPreferredSize(new Dimension(300, 25));
        txtQntMercadoria.setBounds(110, 100, 100, 25);
        txtIdMercadoria.setPreferredSize(new Dimension(300, 25));
        txtIdMercadoria.setBounds(110, 140, 160, 25);
        txtValorMercadoria.setPreferredSize(new Dimension(300, 25));
        txtValorMercadoria.setBounds(90, 180, 160, 25);
        txtDataValidade.setPreferredSize(new Dimension(300, 25));
        txtDataValidade.setBounds(130, 230, 160, 25);
        txtFornecedor.setPreferredSize(new Dimension(300, 25));
        txtFornecedor.setBounds(110, 270, 160, 25);

        

        boxFiliais.setBounds(110, 320, 100, 25);
        for(Filial i : Dados.getFiliais()){
            boxFiliais.add(rootPane, i, ABORT);
        }
        
        boxTipoDeMercadoria.setBounds(110, 350, 100, 25);
        boxTipoDeMercadoria.addItem("Alimento");
        boxTipoDeMercadoria.addItem("Bebida");
        boxTipoDeMercadoria.addItem("Casa");
        
        janelaMercadoria.setLayout(null);
        
        //aqui adicionamos todos os elementos em nosso JFrame
        janelaMercadoria.add(lblDadosMercadoria);
        janelaMercadoria.add(lblNomeMercadoria);
        janelaMercadoria.add(lblQntMercadoria);
        janelaMercadoria.add(lblIdMercadoria);
        janelaMercadoria.add(lblValorMercadoria);

        janelaMercadoria.add(lblDataValidade);
        janelaMercadoria.add(lblFornecedor);
        janelaMercadoria.add(lblFilial);
        janelaMercadoria.add(lblTipoMercadoria);

        janelaMercadoria.add(txtNomeMercadoria);
        janelaMercadoria.add(txtQntMercadoria);
        janelaMercadoria.add(txtIdMercadoria);
        janelaMercadoria.add(txtValorMercadoria);
        janelaMercadoria.add(txtDataValidade);
        janelaMercadoria.add(txtFornecedor);
        janelaMercadoria.add(btnSalvarMercadoria);
        //janelaMercadoria.add(btnExcluirMercadoria);
        janelaMercadoria.add(boxFiliais);
        janelaMercadoria.add(boxTipoDeMercadoria);



        //aqui configuramos o nosso JFrame
        janelaMercadoria.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janelaMercadoria.setVisible(true);
        janelaMercadoria.setLocationRelativeTo(null); 
        janelaMercadoria.setSize(350, 520);     
    }



    public static void main(String[] args) {
        new TelaMercadoria().setVisible(true);
    }
}
