package view;

import model.*;
import control.ControleDados;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class TelaSelecao{
    
    private JFrame janelaSelecao = new JFrame("Mercadoria");
    private JLabel lblDadosMercadoria = new JLabel("Selecione o tipo de mercadoria: ");

    private static JButton btnAlimento = new JButton("Alimento");
    private static JButton btnBebida = new JButton("Bebida");
    private static JButton btnCasa = new JButton("Casa");
    private static JButton btnFiltrarMercadoria = new JButton("Filtrar Mercadorias");
    private static JButton btnRemoverMercadoria = new JButton("Remover");
    
    
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
        
    }
}


