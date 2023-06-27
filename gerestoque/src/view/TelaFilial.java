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

public class TelaFilial extends JFrame {
    
	//private String novoDado[] = new String[8];
	private int indexSelElement;
	public int getIndexSelElement() {
		return indexSelElement;
	}
	public void setIndexSelElement(int indexSelElement) {
		this.indexSelElement = indexSelElement;
	}

	//atributos para montagem dos labels
    private JFrame janelaFilial = new JFrame("Filiais");
    
    private JLabel lblFilial = new JLabel("Filiais");
    
    private JTextField txtFiltroFilial = new JTextField();

    //botões
    private JButton btnAdicionarFilial = new JButton("Adicionar Filial");
    private JButton btnRemoverFilial = new JButton("Remover Filial");
    private JButton btnAtualizarFilial = new JButton("Atualizar");
    private JButton btnFiltrarFilial = new JButton("Filtrar Filial");
    
    ControleDados cd = new ControleDados();
    
    //lista de filiais cadastradas em nosso sistema
    
    DefaultTableModel modelF = new DefaultTableModel();
    JTable jTFiliais = new JTable(modelF);
    JScrollPane scrollpaineltabela = new JScrollPane(jTFiliais);
    
    Filial filial = new Filial("banana", "2345");
    
    
    ArrayList<String> listaFiliais = new ArrayList<String>();


    //método construtor que irá gerar nossa tela
    public TelaFilial(Filial filiais){
    	
    	configInter();    	       
        
    	configEvent();

        

        btnAdicionarFilial.addActionListener(new ActionListener() {
        	
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		new TelaCadastro().setVisible(true);
        	}
        });
        
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
		
	    btnAtualizarFilial.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        
	        	if(TelaCadastro.getBotaoSalvar().isEnabled())	{
	        		modelF.addRow(new Object[]{TelaCadastro.getNomeFilialBox().getText(), 
		        			TelaCadastro.getIdFilialBox().getText()});
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
        janelaFilial.getContentPane().add(txtFiltroFilial);
        janelaFilial.getContentPane().add(btnAdicionarFilial);
        janelaFilial.getContentPane().add(btnRemoverFilial);
        janelaFilial.getContentPane().add(btnAtualizarFilial);
        janelaFilial.getContentPane().add(btnFiltrarFilial);
        
        scrollpaineltabela.setBounds(10, 50, 350, 150);
        janelaFilial.getContentPane().add(scrollpaineltabela);
        scrollpaineltabela.setViewportView(jTFiliais);	
        
      //posição e tamanho das caixa de Filtro de Filial
        txtFiltroFilial.setBounds(150, 10, 200, 25);
    	
        //posição e tamanho dos botões
        btnAdicionarFilial.setBounds(100, 250, 200, 30);
        btnRemoverFilial.setBounds(100, 290, 200, 30);
        btnAtualizarFilial.setBounds(100, 330, 200, 30);
        btnFiltrarFilial.setBounds(100, 370, 200, 30);
        
        modelF.addColumn("Nome Filial");
        modelF.addColumn("Id");
        
        //aqui configuramos o nosso JFrame
        janelaFilial.setVisible(true);
        janelaFilial.setLocationRelativeTo(null); 
        janelaFilial.setSize(400, 450);  
        janelaFilial.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        new TelaFilial(null).setVisible(true);
    }

}
