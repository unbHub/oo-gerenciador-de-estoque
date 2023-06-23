package view;

import model.*;
import control.ControleDados;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import view.TelaCadastro;

public class TelaFilial extends JFrame{
    private JPanel janelaPanel = new JPanel(new GridBagLayout(), false);
	private JList<String> bancoFiliais = new JList<String>();
	private int indexSelElement;
	
    //aqui colocamos os atributos que iremos utilizar para montarmos nossa tela

	//atributos para montagem dos labels
    //private JFrame janelaFilial = new JFrame("Filiais");
    private JLabel lblFilial = new JLabel("Filiais");

    //aqui utilizamos um recurso do Swing para adicionarmos ícones em nossos botões
    //private ImageIcon img1 = new ImageIcon("C:/Users/f1l1p/Desktop/TOP SECRET/projeto oo/OO-UnB---2023.1---Gerenciamento-de-Estoque-/gerestoque/bin/images/maizin.png");
    //private ImageIcon img4 = new ImageIcon("C:/Users/f1l1p/Desktop/TOP SECRET/projeto oo/OO-UnB---2023.1---Gerenciamento-de-Estoque-/gerestoque/bin/images/atualizar.png");
    

    //botões
    private JButton btnAdicionarFilial = new JButton("Adicionar Filial");
    private JButton btnRemoverFilial = new JButton("Remover Filial");
    private JButton btnAtualizarFilial = new JButton("Atualizar");
    
    ControleDados cd = new ControleDados();

    
    //lista de filiais cadastradas em nosso sistema
    


    //método construtor que irá gerar nossa tela
    public TelaFilial(Filial filiais){
    	
    
        
        setTitle("Filiais");
        setSize(800, 500);
        setLocationRelativeTo(null);
        
    	
        
    	
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Filial");
        model.addColumn("Identificador");
        for (int i = 0; i < ControleDados.getMercado().getFiliais().size(); i++) {
            model.addRow(new Object[]{ControleDados.getMercado().getFiliais().get(i).getNome(), 
            		ControleDados.getMercado().getFiliais().get(i).getId()});
        }
		
        JTable jTFiliais = new JTable(model);
        
        
        GridBagConstraints gridBagConstains = new GridBagConstraints();
        gridBagConstains.insets = new Insets(5,0,0,0);
        gridBagConstains.gridx = 0;
        gridBagConstains.gridy = 0;
        
        lblFilial.setPreferredSize(new Dimension(200,25));
        gridBagConstains.gridy++;
        lblFilial.setFont(new Font("Arial", Font.BOLD, 20));
        janelaPanel.add(lblFilial, gridBagConstains);
       
        btnAdicionarFilial.setPreferredSize(new Dimension(200,35));
        gridBagConstains.gridy++;
        janelaPanel.add(btnAdicionarFilial, gridBagConstains);
        
        btnRemoverFilial.setPreferredSize(new Dimension(200,35));
        gridBagConstains.gridy++;
        janelaPanel.add(btnRemoverFilial, gridBagConstains);
        
        btnAtualizarFilial.setPreferredSize(new Dimension(200,35));
        gridBagConstains.gridy++;
        janelaPanel.add(btnAtualizarFilial, gridBagConstains);
        
        jTFiliais.setPreferredSize(new Dimension(300, 200));
        
        gridBagConstains.gridy++;
        janelaPanel.add(jTFiliais, gridBagConstains);
 
    	ArrayList<String> listaFiliais = new ArrayList<String> ();
    	

        //aqui setamos as medidas e as posições de nossos labels

        
        
        
        //JList<Object> filiaisAdicionadas = new JList<Object> (listaFiliais.toArray());
        
        //bancoFiliais.add(filiaisAdicionadas);
        
        //janelaFilial.add(bancoFiliais, gridBagConstains);
        //gridBagConstains.gridy ++;
     
        
        
        
        //posição e tamanho da nossa lista
        janelaPanel.setBounds(10,30, 765, 250);
		janelaPanel.setBackground(Color.white);
		//janelaPanel.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		//janelaPanel.setVisibleRowCount(10);
		
		
        //posição e tamanho dos botões
        /*btnAdicionarFilial.setBounds(300, 300, 200, 30);
        btnRemoverFilial.setBounds(300, 340, 200, 30);
        btnAtualizarFilial.setBounds(300, 380, 200, 30);
        */
        /*
        janelaFilial.setLayout(null);

        //aqui adicionamos todos os elementos em nosso JFrame
        janelaFilial.add(lblFilial);
        janelaFilial.add(BorderLayout.WEST, bancoFiliais);
        janelaFilial.add(btnAdicionarFilial);
        janelaFilial.add(btnRemoverFilial);
        janelaFilial.add(btnAtualizarFilial);
       	
	

        //aqui configuramos o nosso JFrame
        janelaFilial.setVisible(true);
        janelaFilial.setLocationRelativeTo(null); 
        janelaFilial.setSize(800, 500);  
        janelaFilial.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        janelaFilial.setSize(400, 300);  
        janelaFilial.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        */
    
        add(janelaPanel, BorderLayout.NORTH);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        /*filiaisAdicionadas.addListSelectionListener(new ListSelectionListener() {
				
				@Override
				public void valueChanged(ListSelectionEvent e) {
					int elemento = filiaisAdicionadas.getSelectedIndex();
					setIndexSelElement(elemento);
				}
			});*/
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
	        		
	        		//janelaPanel.revaTlidate();
	        		janelaPanel.repaint();
	        	}
	        });
          
    }
    
	public int getIndexSelElement() {
		return indexSelElement;
	}
	public void setIndexSelElement(int indexSelElement) {
		this.indexSelElement = indexSelElement;
	}


    public static void main(String[] args) {
        new TelaFilial(null).setVisible(true);
    }

}
