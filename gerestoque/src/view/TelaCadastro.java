package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import control.ControleDados;
import model.Dados;

import javax.swing.*;


public class TelaCadastro extends JFrame{

    //aqui colocamos os atributos que iremos utilizar para montarmos nossa tela
    private JFrame cadastroFilial = new JFrame("Cadastro");

    //atributos para montagem dos labels
    private JLabel lbl1 = new JLabel("Digite o nome da filial: ");
    private JLabel lbl2 = new JLabel("Digite o identificador da filial: ");
    
    //atributos para os campos de texto
    private JTextField nomeFilialBox = new JTextField();
    private JTextField idFilialBox = new JTextField();
    //private JTextField remFilialBox = new JTextField();

    //botões
    private static JButton botaoSalvar = new JButton("Salvar");
    //private static JButton botaoExcluir = new JButton("Excluir");
    //private static JButton botaoRelator = new JButton("Relatório");
    //private static JButton botaoEst = new JButton("Estoque");
    
    private ControleDados cd = new ControleDados();
    
    public void inserir() {
    	
    }

    public TelaCadastro(){

        //aqui setamos as medidas e as posições de nossos labels
        lbl1.setBounds(30, 20, 150, 25);
        lbl2.setBounds(30, 60, 200, 25);

        //medidas e posições dos botões
        botaoSalvar.setBounds(20, 100, 100, 30);
        //botaoExcluir.setBounds(20, 140, 100, 30);
        //botaoRelator.setBounds(260, 100, 100, 30);
        //botaoEst.setBounds(260, 140, 100, 30);

        //campos de texto
        nomeFilialBox.setPreferredSize(new Dimension(300, 25));
        nomeFilialBox.setBounds(180, 20, 180, 25);
        idFilialBox.setPreferredSize(new Dimension(300, 25));
        idFilialBox.setBounds(200, 60, 160, 25);
        //remFilialBox.setPreferredSize(new Dimension(300, 25));
        //remFilialBox.setBounds(20, 175, 70, 27);



        cadastroFilial.setLayout(null);

        //aqui adicionamos todos os elementos em nosso JFrame
        cadastroFilial.add(lbl1);
        cadastroFilial.add(lbl2);
        cadastroFilial.add(nomeFilialBox);
        cadastroFilial.add(idFilialBox);
        //cadastroFilial.add(remFilialBox);
        cadastroFilial.add(botaoSalvar);
        //cadastroFilial.add(botaoExcluir);
        //cadastroFilial.add(botaoRelator);
        //cadastroFilial.add(botaoEst);

        //aqui configuramos o nosso JFrame
        cadastroFilial.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cadastroFilial.setVisible(true);
        cadastroFilial.setLocationRelativeTo(null); 
        cadastroFilial.setSize(400, 200);     
        
        botaoSalvar.addActionListener(new ActionListener() {
        	
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		String nomeFilial = nomeFilialBox.getText();
        		String idFilial = idFilialBox.getText();
        		
        		if (nomeFilial.isEmpty() == true) {
					JOptionPane.showMessageDialog(null, "Insira o nome da Filial");
				}
        		if (idFilial.isEmpty() == true) {
					JOptionPane.showMessageDialog(null, "Insira o id da Filial");
				}
        		else if (nomeFilial.matches("[0-9]+")) {
					JOptionPane.showMessageDialog(null, "Insira apenas letras "
							+ "no nome da filial");
				}
        		else if (!idFilial.matches("[0-9]+")) {
					JOptionPane.showMessageDialog(null, "Insira apenas numeros "
							+ "no id da filial");
				}
				if (nomeFilial.isEmpty() == false & !nomeFilial.matches("[0-9]+")
						& idFilial.isEmpty() == false & idFilial.matches("[0-9]+")) {
					
					Dados.getFiliais().add(cd.inserirFiliais(nomeFilial, idFilial));
					JOptionPane.showMessageDialog(null, "Filial cadastrada com sucesso!");
				}	
				
        	}
        });
          
        
    }

   
    public static void main(String[] args) {
        new TelaCadastro().setVisible(true);
    }


}