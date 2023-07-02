package view;

import model.*;
import control.ControleDados;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class TelaSelecao{
    
    private JFrame janelaSelecao = new JFrame("Mercadoria");
    private JLabel lblDadosMercadoria = new JLabel("Selecione o tipo de mercadoria: ");

    private JButton btnAlimento = new JButton("Alimento");
    private JButton btnBebida = new JButton("Bebida");
    private JButton btnCasa = new JButton("Casa");
    private JButton btnFiltrarMercadoria = new JButton("Filtrar Mercadorias");
    private JButton btnRemoverMercadoria = new JButton("Remover");
    private JButton btnEditarMercadoria = new JButton("Editar");    
    private JComboBox<String> boxFilial = new JComboBox<String>();
    
    private JTextField txtFiltroMercadoria = new JTextField();
    
    DefaultTableModel modelM = new DefaultTableModel();
    JTable jTMercadorias = new JTable(modelM);
    JScrollPane scrollpaineltabela = new JScrollPane(jTMercadorias);
    
    Filial filialSelecionada = null;

    public TelaSelecao(){
        
        lblDadosMercadoria.setFont(new Font("Arial", Font.BOLD, 15));

        lblDadosMercadoria.setBounds(170, 270, 250, 25);

        btnAlimento.setBounds(150, 300, 90, 30);
        btnBebida.setBounds(240, 300, 90, 30);
        btnCasa.setBounds(330, 300, 90, 30);
        btnFiltrarMercadoria.setBounds(210, 205, 150, 30);
        btnRemoverMercadoria.setBounds(210, 240, 150, 30);
        btnEditarMercadoria.setBounds(210, 400, 150, 30);
        
        boxFilial.setBounds(10, 10, 100, 25);
        for (Filial dado: Dados.getFiliais()) {
            boxFilial.addItem(dado.getNome());
        }
        
        txtFiltroMercadoria.setBounds(150, 10, 200, 25);
        
        janelaSelecao.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janelaSelecao.setVisible(true);
        janelaSelecao.setSize(638, 500); 
        janelaSelecao.setLocationRelativeTo(null);  
        
        janelaSelecao.setLayout(null);
        
        janelaSelecao.add(lblDadosMercadoria);
        janelaSelecao.add(btnAlimento);
        janelaSelecao.add(btnBebida);
        janelaSelecao.add(btnCasa);
        janelaSelecao.add(btnFiltrarMercadoria);
        janelaSelecao.add(btnRemoverMercadoria);
        janelaSelecao.add(btnEditarMercadoria);
        janelaSelecao.add(boxFilial);
        janelaSelecao.add(txtFiltroMercadoria);
    	
        scrollpaineltabela.setBounds(10, 50, 600, 150);
        janelaSelecao.getContentPane().add(scrollpaineltabela);
        scrollpaineltabela.setViewportView(jTMercadorias);	
        
        modelM.addColumn("Nome");
        modelM.addColumn("Id");
        modelM.addColumn("Data de validade");
        modelM.addColumn("Fornecedor");
        modelM.addColumn("Quantidade");
        modelM.addColumn("valor");


        btnAlimento.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaMercadoria().alterarCadastro(1);  
            }
        });

        btnBebida.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaMercadoria().alterarCadastro(2);
            }
            
        });

        btnCasa.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaMercadoria().alterarCadastro(3);
            }
            
        });
        
        btnFiltrarMercadoria.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
                String nomeSelecionado = (String) boxFilial.getSelectedItem();
                for (Filial filial : Dados.getFiliais()) {
                    if (filial.getNome().equals(nomeSelecionado)) {
                        filialSelecionada = filial;
                        break;
                    }
                }
        		
        		// Obtém o texto do campo de filtro
        		String filtroTexto = txtFiltroMercadoria.getText().trim();
        		
        		// Limpa o modelo de dados atual
        		modelM.setRowCount(0);
        		
        		// Verifica se o campo de filtro está vazio
	        	if (filtroTexto.isEmpty()) {
	        		for (Mercadoria dado : filialSelecionada.getMercadorias()) {

	        			modelM.addRow(new Object[]{dado.getNome(), dado.getCodigo(),
	        					dado.getDataValidade(), dado.getFornecedor(), 
                        		dado.getQuantidade(), dado.getValor()});
	        		}
	        	} else {
	        		// Filtra os dados com base no texto do filtro
                    for (Mercadoria dado : filialSelecionada.getMercadorias()) {
                        if ((dado.getNome().equalsIgnoreCase(filtroTexto) || 
                        		(dado.getCodigo().equals(filtroTexto)))) {
                            modelM.addRow(new Object[]{dado.getNome(), dado.getCodigo()});
                        }
                    }
	        	}
	        	
        	}
	    });
        
        btnRemoverMercadoria.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nomeSelecionado = (String) boxFilial.getSelectedItem();
                for (Filial filial : Dados.getFiliais()) {
                    if (filial.getNome().equals(nomeSelecionado)) {
                        filialSelecionada = filial;
                        break;
                    }
                }
				
				// Obtém o índice da linha selecionada
				int selectedRow = jTMercadorias.getSelectedRow();
				
				// Verifica se uma linha foi selecionada
				if (selectedRow != -1 && 
						!modelM.getValueAt(selectedRow, 1).toString().isEmpty()) {
					// Remove a linha da tabela
					modelM.removeRow(selectedRow);										
					
					// Atualiza a exibição do JTable
					jTMercadorias.repaint();
					
					
					// Remove a Mercadoria da Filial
					filialSelecionada.remMercadoria(filialSelecionada.getMercadorias().get(selectedRow));
				
					
					JOptionPane.showMessageDialog(null, 
							"Mercadoria removida com sucesso com sucesso!");	
				} else {
					JOptionPane.showMessageDialog(null, 
							"Nenhuma Mercadoria foi selecionada!");
				}
				
			}
		});
		btnEditarMercadoria.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Obtém o índice da linha selecionada
				int indiceLinha = jTMercadorias.getSelectedRow();
    			int indiceColuna = jTMercadorias.getSelectedColumn();
    			int colunaIndex = jTMercadorias.convertColumnIndexToModel(indiceColuna);
				
				// Verifica se uma linha foi selecionada
				if (indiceLinha != -1 && 
						!modelM.getValueAt(indiceLinha, 1).toString().isEmpty() &&
						indiceLinha > -1 && indiceColuna == 0) {
					
	    			Object valorAtualNome = jTMercadorias.getValueAt(indiceLinha, colunaIndex);
	    			String novoValorNome = JOptionPane.showInputDialog("Novo valor:", valorAtualNome);
	    			if (novoValorNome == null) {
	    				JOptionPane.showMessageDialog(null, "insira algum valor" );
	    			}
	    			else if(novoValorNome.matches("[0-9]+")) {
	    				JOptionPane.showMessageDialog(null, "valor inválido!");
	    			}
	    			else {
		    			jTMercadorias.getModel().setValueAt(novoValorNome, indiceLinha, colunaIndex);
		    			((AbstractTableModel) jTMercadorias.getModel()).fireTableCellUpdated(indiceLinha, colunaIndex);
		    			Dados.getMercadorias().get(indiceLinha).setNome(novoValorNome);
	    			}

					
				}
				else if (indiceLinha != -1 && 
						!modelM.getValueAt(indiceLinha, 1).toString().isEmpty() &&
						indiceLinha > -1 && indiceColuna == 1) {
					Object valorAtualId = jTMercadorias.getValueAt(indiceLinha, colunaIndex);
	    			String novoValorId = JOptionPane.showInputDialog("Novo valor:", valorAtualId);
	    			
	    			if (novoValorId == null) {
	    				JOptionPane.showMessageDialog(null, "insira algum valor" );
	    			}
	    			else if(!novoValorId.matches("[0-9]+")) {
	    				JOptionPane.showMessageDialog(null, "valor inválido!");
	    			}
	    			else {
		    			jTMercadorias.getModel().setValueAt(novoValorId, indiceLinha, colunaIndex);
		    			((AbstractTableModel) jTMercadorias.getModel()).fireTableCellUpdated(indiceLinha, colunaIndex);
		    			Dados.getMercadorias().get(indiceLinha).setCodigo(novoValorId);
	    			}

					
				}
				else {
					JOptionPane.showMessageDialog(null, 
							"Nenhuma mercadoria foi selecionada!");
				}
				
			}
    });
}
}


