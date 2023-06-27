package view;

import model.*;
import control.ControleDados;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import view.TelaCadastro;

public class TelaFilial extends JFrame{


	//atributos para montagem dos labels
    private JFrame janelaFilial = new JFrame("Filiais");
    private JLabel lblFilial = new JLabel("Filiais");
	
	private JLabel cadastroFilial = new JLabel("Cadastro de Filiais:");
	private JLabel lbl1 = new JLabel("Digite o nome da filial: ");
    private JLabel lbl2 = new JLabel("Digite o identificador da filial: ");

	private static JTextField nomeFilialBox = new JTextField();
    private static JTextField idFilialBox = new JTextField();
    
    private JTextField txtFiltroFilial = new JTextField();


    //botões
    private JButton btnAdicionarFilial = new JButton("Adicionar Filial");
    private JButton btnRemoverFilial = new JButton("Remover Filial");
    private JButton btnFiltrarFilial = new JButton("Filtrar Filial");
	private static JButton botaoSalvar = new JButton("Salvar");
    
    ControleDados cd = new ControleDados();
    
    //lista de filiais cadastradas em nosso sistema
    
    DefaultTableModel modelF = new DefaultTableModel();
    JTable jTFiliais = new JTable(modelF);
    JScrollPane scrollpaineltabela = new JScrollPane(jTFiliais);
    

    //método construtor que irá gerar nossa tela
    public TelaFilial(){
    	
    	configInter();    	       
        
    	configEvent();

    
        btnAdicionarFilial.addActionListener(new ActionListener() {
        	
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		String nomeFilial = nomeFilialBox.getText();
        		String idFilial = idFilialBox.getText();
        		
        		if (nomeFilial.isEmpty() == true) {
					JOptionPane.showMessageDialog(null, "Insira o nome da Filial");
				} else if (nomeFilial.matches("[0-9]+")) {
					JOptionPane.showMessageDialog(null, "Insira apenas letras "
							+ "no nome da filial");
				}
        		
        		if (idFilial.isEmpty() == true) {
					JOptionPane.showMessageDialog(null, "Insira o id da Filial");
				} else if (!idFilial.matches("[0-9]+")) {
					JOptionPane.showMessageDialog(null, "Insira apenas numeros "
							+ "no id da filial");
				}
        		
        		if (!nomeFilial.isEmpty() && !nomeFilial.matches("[0-9]+") && !idFilial.isEmpty() && idFilial.matches("[0-9]+")) {
        			Dados.getFiliais().add(cd.inserirFiliais(nomeFilial, idFilial));
					JOptionPane.showMessageDialog(null, "Filial cadastrada com sucesso!");
                    
        		}        			
        }});
        
		btnRemoverFilial.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Obtém o índice da linha selecionada
				int selectedRow = jTFiliais.getSelectedRow();
				
				// Verifica se uma linha foi selecionada
				if (selectedRow != -1 && !modelF.getValueAt(selectedRow, 1).toString().isEmpty()) {
					// Remove a linha da tabela
					modelF.removeRow(selectedRow);										
					
					// Atualiza a exibição do JTable
					jTFiliais.repaint();
					
					// Remove a Filial do Banco de dados
					Dados.getFiliais().remove(selectedRow);
					//String idFilial = (String) modelF.getValueAt(selectedRow, 1);
					//cd.removerFilial(idFilial);
					
					JOptionPane.showMessageDialog(null, "Filial removida com sucesso com sucesso!");
					
				} else if (selectedRow != -1 && modelF.getValueAt(selectedRow, 1).toString().isEmpty()) {
					// Remove a linha da tabela
					modelF.removeRow(selectedRow);										
					
					// Atualiza a exibição do JTable
					jTFiliais.repaint();
				}
				
			}
		});
		
	    btnFiltrarFilial.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		// Obtém o texto do campo de filtro
        		String filtroTexto = txtFiltroFilial.getText().trim();
        		
        		// Limpa o modelo de dados atual
        		modelF.setRowCount(0);
        		
        		// Verifica se o campo de filtro está vazio
	        	if (filtroTexto.isEmpty()) {
	        		for (Filial dado : Dados.getFiliais()) {
	        			modelF.addRow(new Object[]{dado.getNome(), dado.getId()});
	        		}
	        	} else {
	        		// Filtra os dados com base no texto do filtro
                    for (Filial dado : Dados.getFiliais()) {
                        if ((dado.getNome().equalsIgnoreCase(filtroTexto) || (dado.getId().equals(filtroTexto)))) {
                            modelF.addRow(new Object[]{dado.getNome(), dado.getId()});
                        }
                    }
	        	}
	        	
        	}
	    });
          
    }
    
    public void configInter() {
    	
      	modelF = new DefaultTableModel();
    	jTFiliais = new JTable(modelF);
    	scrollpaineltabela = new JScrollPane(jTFiliais);
    	
		
        //aqui adicionamos todos os elementos em nosso JFrame
        lblFilial.setBounds(20, 10, 200, 30);
        lblFilial.setFont(new Font("Arial", Font.BOLD, 20));
        janelaFilial.getContentPane().setLayout(null);
        janelaFilial.getContentPane().add(lblFilial);
		janelaFilial.getContentPane().add(cadastroFilial);
		janelaFilial.getContentPane().add(lbl1);
		janelaFilial.getContentPane().add(lbl2);
		janelaFilial.getContentPane().add(nomeFilialBox);
		janelaFilial.getContentPane().add(idFilialBox);
        janelaFilial.getContentPane().add(txtFiltroFilial);
        janelaFilial.getContentPane().add(btnAdicionarFilial);
        janelaFilial.getContentPane().add(btnRemoverFilial);
        janelaFilial.getContentPane().add(btnFiltrarFilial);
        janelaFilial.getContentPane().add(botaoSalvar);
        
        scrollpaineltabela.setBounds(10, 50, 350, 150);
        janelaFilial.getContentPane().add(scrollpaineltabela);
        scrollpaineltabela.setViewportView(jTFiliais);	
        
      //posição e tamanho das caixa de Filtro de Filial
        txtFiltroFilial.setBounds(150, 10, 200, 25);
    	
        //posição e tamanho dos botões
        btnAdicionarFilial.setBounds(100, 220, 200, 30);
        btnRemoverFilial.setBounds(100, 260, 200, 30);
        btnFiltrarFilial.setBounds(100, 300, 200, 30);
        
        modelF.addColumn("Nome Filial");
        modelF.addColumn("Id");
        
        //aqui configuramos o nosso JFrame
        janelaFilial.setVisible(true); 
        janelaFilial.setSize(650, 400);  
		janelaFilial.setLocationRelativeTo(null);
        janelaFilial.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		//configurações dos labels de cadastro
		cadastroFilial.setFont(new Font("Arial", Font.BOLD, 20));
		cadastroFilial.setBounds(400, 10, 200, 30);
		lbl1.setBounds(400, 50 , 200, 30);
		lbl2.setBounds(400, 120 , 200, 30);
		nomeFilialBox.setBounds(400, 80, 200, 30);
		idFilialBox.setBounds(400, 150, 200, 30);
    	
    }
    
    public void configEvent() {
    	
    	DefaultTableModel modelF = (DefaultTableModel) jTFiliais.getModel();
        
    	//Inserindo dados para testar, depois temos que colocar esses dados na classe "Dados" da model
    	Dados.getFiliais().add(cd.inserirFiliais("Parana", "123"));
    	Dados.getFiliais().add(cd.inserirFiliais("Jacarézinho", "321"));
    	Dados.getFiliais().add(cd.inserirFiliais("Jacarepaguá", "432"));
    	
        for (Filial dado : Dados.getFiliais()) {
            modelF.addRow(new Object[]{dado.getNome(), dado.getId()});
        }
    		
    }
    public static void main(String[] args) {
        new TelaFilial();
    }

}
