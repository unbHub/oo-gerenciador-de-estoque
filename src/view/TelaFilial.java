package view;

import model.*;
import control.ControleDados;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;

/**
 * 
 * @author Diego Carlito
 * @author Filipe Carvalho
 * @author Marcos Castilhos
 *Classe view TelaFilial, para exibição das filiais cadastradas e cadastro
 *de novas filiais, bem como remoção, filtro, atualização e edição
 */

public class TelaFilial extends JFrame{

	/**
	 * atributos para configuração dos labels
	 */
    private JFrame janelaFilial = new JFrame("Filiais");
    private JLabel lblFilial = new JLabel("Filiais");
	private JLabel cadastroFilial = new JLabel("Cadastro de Filiais:");
	private JLabel lbl1 = new JLabel("Digite o nome da filial: ");
    private JLabel lbl2 = new JLabel("Digite o identificador da filial: ");
    /**
     * Campos para digitação de nome e id de filial
     */
	private JTextField nomeFilialBox = new JTextField();
    private JTextField idFilialBox = new JTextField();
    private JTextField txtFiltroFilial = new JTextField();


    /**
     * instancia de botões
     */
    private JButton btnAdicionarFilial = new JButton("Adicionar Filial");
    private JButton btnRemoverFilial = new JButton("Remover Filial");
    private JButton btnFiltrarFilial = new JButton("Filtrar/Atualizar Filial");
    private JButton btnEditarFilial = new JButton("Editar Filial");
	private JButton botaoSalvar = new JButton("Salvar");

    /**
     * instancia da tabela usada para representar os dados
     */
    DefaultTableModel modelF = new DefaultTableModel();
    JTable jTFiliais = new JTable(modelF);
    JScrollPane scrollpaineltabela = new JScrollPane(jTFiliais);
    

    /**
     * método construtor que irá gerar nossa tela
     */
    public TelaFilial(){
    	
    	configInter();    	       
        
    	configEvent();
    
        btnAdicionarFilial.addActionListener(new ActionListener() {
        	
        	/**
        	 * metodo para adição de filial
        	 * verifica se o campo de nome e id é vazio e
        	 * verifica se os valores digitados sao validos
        	 */
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
        		
        		if (!nomeFilial.isEmpty() && !nomeFilial.matches("[0-9]+") 
        				&& !idFilial.isEmpty() && idFilial.matches("[0-9]+")) {
        			Dados.getFiliais().add(ControleDados.inserirFiliais(nomeFilial, idFilial));
					JOptionPane.showMessageDialog(null, "Filial cadastrada com sucesso!");
					nomeFilialBox.setText(null);
					idFilialBox.setText(null);
                    
        		}        			
        }});
        
		btnRemoverFilial.addActionListener(new ActionListener() {
			
			/**
			 * metodo para remoção de filiais
			 * obtem o indice selecionado e remove a filial da tabela
			 * @param e
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				// Obtém o índice da linha selecionada
				int selectedRow = jTFiliais.getSelectedRow();
				
				// Verifica se uma linha foi selecionada
				if (selectedRow != -1 && 
						!modelF.getValueAt(selectedRow, 1).toString().isEmpty()) {
					// Remove a linha da tabela
					modelF.removeRow(selectedRow);										
					
					// Atualiza a exibição do JTable
					jTFiliais.repaint();
					
					// Remove a Filial do Banco de dados
					Dados.getFiliais().remove(selectedRow);
					JOptionPane.showMessageDialog(null, 
							"Filial removida com sucesso com sucesso!");
				} else {
					JOptionPane.showMessageDialog(null, 
							"Nenhuma Filial foi selecionada!");
				}
				
			}
		});
		
	    btnFiltrarFilial.addActionListener(new ActionListener() {
	    	/**
	    	 * metodo para filtragem de filiais
	    	 * percorre todo o array de filiais e obtem nome e id
	    	 */
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
                        if ((dado.getNome().equalsIgnoreCase(filtroTexto) || 
                        		(dado.getId().equals(filtroTexto)))) {
                            modelF.addRow(new Object[]{dado.getNome(), dado.getId()});
                            
                    	    
                        }

                    }
	        	  }
	        	
        	}
	    });
		btnEditarFilial.addActionListener(new ActionListener() {
			/**
			 * metodo para edição de filiais
			 * verifica os indices selecionados e define novos valores
			 * a partir de uma mensagem de input
			 */
			@Override
			public void actionPerformed(ActionEvent e) {
				// Obtém o índice da linha selecionada
				int indiceLinha = jTFiliais.getSelectedRow();
    			int indiceColuna = jTFiliais.getSelectedColumn();
    			int colunaIndex = jTFiliais.convertColumnIndexToModel(indiceColuna);
				
				// Verifica se uma linha foi selecionada
				if (indiceLinha != -1 && 
						!modelF.getValueAt(indiceLinha, 1).toString().isEmpty() &&
						indiceLinha > -1 && indiceColuna == 0) {
					
	    			Object valorAtualNome = jTFiliais.getValueAt(indiceLinha, colunaIndex);
	    			String novoValorNome = JOptionPane.showInputDialog("Novo valor:", valorAtualNome);
	    			if (novoValorNome == null) {
	    				JOptionPane.showMessageDialog(null, "insira algum valor" );
	    			}
	    			else if(novoValorNome.matches("[0-9]+")) {
	    				JOptionPane.showMessageDialog(null, "valor inválido!");
	    			}
	    			else {
		    			jTFiliais.getModel().setValueAt(novoValorNome, indiceLinha, colunaIndex);
		    			((AbstractTableModel) jTFiliais.getModel()).fireTableCellUpdated(indiceLinha, colunaIndex);
		    			Dados.getFiliais().get(indiceLinha).setNome(novoValorNome);
	    			}

					
				}
				else if (indiceLinha != -1 && 
						!modelF.getValueAt(indiceLinha, 1).toString().isEmpty() &&
						indiceLinha > -1 && indiceColuna == 1) {
					Object valorAtualId = jTFiliais.getValueAt(indiceLinha, colunaIndex);
	    			String novoValorId = JOptionPane.showInputDialog("Novo valor:", valorAtualId);
	    			
	    			if (novoValorId == null) {
	    				JOptionPane.showMessageDialog(null, "insira algum valor" );
	    			}
	    			else if(!novoValorId.matches("[0-9]+")) {
	    				JOptionPane.showMessageDialog(null, "valor inválido!");
	    			}
	    			else {
		    			jTFiliais.getModel().setValueAt(novoValorId, indiceLinha, colunaIndex);
		    			((AbstractTableModel) jTFiliais.getModel()).fireTableCellUpdated(indiceLinha, colunaIndex);
		    			Dados.getFiliais().get(indiceLinha).setId(novoValorId);
	    			}

					
				}
				else {
					JOptionPane.showMessageDialog(null, 
							"Nenhuma Filial foi selecionada!");
				}
				
			}
		});
    	
    }
    /**
     * metodo para configuração da interface
     */
    public void configInter() {
    	
    	/**
    	 * instancia da tabela e suas configurações
    	 */
      	modelF = new DefaultTableModel();
    	jTFiliais = new JTable(modelF);
    	scrollpaineltabela = new JScrollPane(jTFiliais);
    
        /**
         * aqui adicionamos todos os elementos em nosso JFrame
         */
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
        janelaFilial.getContentPane().add(btnEditarFilial);
        janelaFilial.getContentPane().add(botaoSalvar);
        
        scrollpaineltabela.setBounds(10, 50, 350, 150);
        janelaFilial.getContentPane().add(scrollpaineltabela);
        scrollpaineltabela.setViewportView(jTFiliais);	

        
        
      //posição e tamanho das caixa de Filtro de Filial
        txtFiltroFilial.setBounds(150, 10, 200, 25);
    	
        /**
         * posição e tamanho dos botões
         */
        btnAdicionarFilial.setBounds(100, 220, 200, 30);
        btnRemoverFilial.setBounds(100, 260, 200, 30);
        btnEditarFilial.setBounds(350,260, 200,30);
        btnFiltrarFilial.setBounds(100, 300, 200, 30);
        
        /**
         * criação das colunas da tabela
         */
        modelF.addColumn("Nome Filial");
        modelF.addColumn("Id");
        
        /**
         * aqui configuramos o nosso JFrame
         */
        janelaFilial.setVisible(true); 
        janelaFilial.setSize(650, 400);  
		janelaFilial.setLocationRelativeTo(null);
        janelaFilial.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	
		/**
		 * configurações dos labels de cadastro
		 */
		cadastroFilial.setFont(new Font("Arial", Font.BOLD, 20));
		cadastroFilial.setBounds(400, 10, 200, 30);
		lbl1.setBounds(400, 50 , 200, 30);
		lbl2.setBounds(400, 120 , 200, 30);
		nomeFilialBox.setBounds(400, 80, 200, 30);
		idFilialBox.setBounds(400, 150, 200, 30);
    	

    }
    /**
     * metodo para configuração dos eventos da janela
     */
    public void configEvent() {
    	
    	DefaultTableModel modelF = (DefaultTableModel) jTFiliais.getModel();
        
    	/**
    	 * Inserindo as Filiais armazenadas
    	 */
        for (Filial dado : Dados.getFiliais()) {
            modelF.addRow(new Object[]{dado.getNome(), dado.getId()});
            
        }
    }
}

