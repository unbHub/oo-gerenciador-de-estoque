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

    //botões
    private JButton btnAdicionarFilial = new JButton("Adicionar Filial");
    private JButton btnRemoverFilial = new JButton("Remover Filial");
    private JButton btnAtualizarFilial = new JButton("Atualizar");
    
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
			
			
			public void valueChanged(ListSelectionEvent e) {
				//int elemento = filiaisAdicionadas.getSelectedIndex();
				//setIndexSelElement(elemento);
				ControleDados.removerFilial(getName(), ControleDados.getMercado());
			}
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Filial removida com sucesso com sucesso!");
				
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
        janelaFilial.getContentPane().add(btnAdicionarFilial);
        janelaFilial.getContentPane().add(btnRemoverFilial);
        janelaFilial.getContentPane().add(btnAtualizarFilial);
        
        scrollpaineltabela.setBounds(10, 50, 350, 150);
        janelaFilial.getContentPane().add(scrollpaineltabela);
        scrollpaineltabela.setViewportView(jTFiliais);	
        
    	
        //posição e tamanho dos botões
        btnAdicionarFilial.setBounds(100, 250, 200, 30);
        btnRemoverFilial.setBounds(100, 290, 200, 30);
        btnAtualizarFilial.setBounds(100, 330, 200, 30);
        
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
        
    	modelF.addRow(new Object[]{"Parana", "123"});
    	modelF.addRow(new Object[]{"Jacarézinho", "321"});
    	modelF.addRow(new Object[]{"Jacarepaguá", "432"});
    	


    	
    }
    public static void main(String[] args) {
        new TelaFilial(null).setVisible(true);
    }

}
