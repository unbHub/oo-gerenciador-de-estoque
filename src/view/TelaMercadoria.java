package view;

import javax.swing.*;

import control.ControleDados;
import model.Dados;
import model.Filial;
import model.Mercadoria;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author Diego Carlito
 * @author Filipe Carvalho
 * @author Marcos Castilhos
 * Classe view TelaMercadoria, para exibição, cadastro, edição, filtro e remoção
 * de mercadorias
 */

public class TelaMercadoria extends JFrame { 

    Filial filialSelecionada = null;
    
    //aqui colocamos os atributos que iremos utilizar para montarmos nossa tela

    /**
     * instancia dos labels
     */
    private JFrame janelaMercadoria = new JFrame("Mercadoria");
    private JLabel lblDadosMercadoria = new JLabel("Digite os dados da mercadoria: ");
    private JLabel lblNomeMercadoria = new JLabel("Nome:");
    private JLabel lblIdMercadoria = new JLabel("Código:");
    private JLabel lblQntMercadoria = new JLabel("Quantidade: ");
    private JLabel lblValorMercadoria = new JLabel("Valor:  R$");
    private JLabel lblDataValidade = new JLabel("Data de validade:");
    private JLabel lblFornecedor = new JLabel("Fornecedor:");
    private JLabel lblPerecivel = new JLabel("Perecível:");
    private JLabel lblMassa = new JLabel("Massa:");
    private JLabel lblAlcool = new JLabel("Álcool:");
    private JLabel lblVolume = new JLabel("Volume:");
    private JLabel pdLimpeza = new JLabel("Produto de limpeza:");
    private JLabel estadoFis = new JLabel("Estado Físico:");
    private JLabel filial = new JLabel("Filial: ");


    /**
     * instancia dos campos de texto
     */
    private JTextField txtNomeMercadoria = new JTextField();
    private JTextField txtQntMercadoria = new JTextField();
    private JTextField txtIdMercadoria = new JTextField();
    private JTextField txtValorMercadoria = new JTextField();
    private JTextField txtDataValidade = new JTextField();
    private JTextField txtFornecedor = new JTextField();
    private JTextField txtPerecivel = new JTextField();
    private JTextField txtMassa = new JTextField();
    private JTextField txtAlcool = new JTextField();
    private JTextField txtVolume = new JTextField();
    private JTextField txtPdLimpeza = new JTextField();
    private JTextField txtEstadoFis = new JTextField();

    private JComboBox<String> boxFilial = new JComboBox<String>();

    /**
     * instancia dos botões utilizaveis
     */
    private JButton btnSalvarAlimento = new JButton("Salvar");
    private JButton btnSalvarBebida = new JButton("Salvar");
    private JButton btnSalvarCasa = new JButton("Salvar");
    
    public TelaMercadoria(){
    	/**
    	 * configuração do tamanho dos elementos na tela
    	 */
        lblDadosMercadoria.setFont(new Font("Arial", Font.BOLD, 15));
        lblDadosMercadoria.setBounds(30, 20, 250, 25);
        lblNomeMercadoria.setBounds(30, 60, 200, 25);
        lblQntMercadoria.setBounds(30, 100, 200, 25);
        lblIdMercadoria.setBounds(30, 140, 200, 25);
        lblValorMercadoria.setBounds(30, 180, 200, 25);
        lblDataValidade.setBounds(30, 230, 200, 25);
        lblFornecedor.setBounds(30, 270, 200, 25);
        filial.setBounds(30, 390, 200, 25);

        txtNomeMercadoria.setPreferredSize(new Dimension(300, 25));
        txtNomeMercadoria.setBounds(150, 60, 160, 25);
        txtQntMercadoria.setPreferredSize(new Dimension(300, 25));
        txtQntMercadoria.setBounds(150, 100, 160, 25);
        txtIdMercadoria.setPreferredSize(new Dimension(300, 25));
        txtIdMercadoria.setBounds(150, 140, 160, 25);
        txtValorMercadoria.setPreferredSize(new Dimension(300, 25));
        txtValorMercadoria.setBounds(150, 180, 160, 25);
        txtDataValidade.setPreferredSize(new Dimension(300, 25));
        txtDataValidade.setBounds(150, 230, 160, 25);
        txtFornecedor.setPreferredSize(new Dimension(300, 25));
        txtFornecedor.setBounds(150, 270, 160, 25);
       

        boxFilial.setBounds(70, 390, 100, 25);

        for (Filial dado: Dados.getFiliais()) {
            boxFilial.addItem(dado.getNome());
        }

        janelaMercadoria.setLayout(null);

        btnSalvarAlimento.setBounds(30, 450, 100, 30);
        btnSalvarBebida.setBounds(30, 450, 100, 30);
        btnSalvarCasa.setBounds(30, 450, 100, 30);
        
        /**
         * adição dos elementos na tela
         */
        janelaMercadoria.add(lblDadosMercadoria);
        janelaMercadoria.add(lblNomeMercadoria);
        janelaMercadoria.add(lblQntMercadoria);
        janelaMercadoria.add(lblIdMercadoria);
        janelaMercadoria.add(lblValorMercadoria);
        janelaMercadoria.add(lblDataValidade);
        janelaMercadoria.add(lblFornecedor);
        janelaMercadoria.add(filial);
        janelaMercadoria.add(txtNomeMercadoria);
        janelaMercadoria.add(txtQntMercadoria);
        janelaMercadoria.add(txtIdMercadoria);
        janelaMercadoria.add(txtValorMercadoria);
        janelaMercadoria.add(txtDataValidade);
        janelaMercadoria.add(txtFornecedor);
        janelaMercadoria.add(boxFilial);

        //aqui configuramos o nosso JFrame
        janelaMercadoria.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        janelaMercadoria.setVisible(true);
        janelaMercadoria.setSize(350, 560);
        janelaMercadoria.setLocationRelativeTo(null); 
        
    }
    /**
     * metodo para alterar o tipo de mercadoria a ser cadastrada
     * 1 para alimentos
     * 2 para bebidas
     * 3 para produtos de casa
     * @param op
     */
    public void alterarCadastro(int op){

        switch(op){
            case 1: /**mostrar cadastro de alimentos */
            lblPerecivel.setBounds(30, 310, 200, 25);
            lblMassa.setBounds(30, 350, 200, 25);
            
            txtPerecivel.setPreferredSize(new Dimension(300, 25));
            txtPerecivel.setBounds(150, 310, 160, 25);
            txtMassa.setPreferredSize(new Dimension(300, 25));
            txtMassa.setBounds(150, 350, 160, 25);

            janelaMercadoria.add(lblPerecivel);
            janelaMercadoria.add(lblMassa);

            janelaMercadoria.add(txtPerecivel);
            janelaMercadoria.add(txtMassa);
            janelaMercadoria.add(btnSalvarAlimento);
            
            btnSalvarAlimento.addActionListener(new ActionListener() {

            /**
             * metodo de recebimento dos dados de um novo alimento
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeMercadoria = txtNomeMercadoria.getText();
                String qntMercadoria = txtQntMercadoria.getText();
                String idMercadoria = txtIdMercadoria.getText();
                String valorMercadoria = txtValorMercadoria.getText();
                String dataValidade = txtDataValidade.getText();
                String fornecedor = txtFornecedor.getText();
                String massa = txtMassa.getText();
                String perecivel = txtPerecivel.getText();
                
                String nomeSelecionado = (String) boxFilial.getSelectedItem();
                for (Filial filial : Dados.getFiliais()) {
                    if (filial.getNome().equals(nomeSelecionado)) {
                        filialSelecionada = filial;
                        break;
                    }
                }
                
                if(nomeMercadoria.isEmpty() == true || idMercadoria.isEmpty() == true || qntMercadoria.isEmpty() == true 
                || valorMercadoria.isEmpty() == true || /*dataValidade.isEmpty() == true*/ fornecedor.isEmpty() == true){
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                }else if(nomeMercadoria.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas letras no nome da mercadoria");
                }else if(!qntMercadoria.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas números na quantidade de mercadorias");
                }else if(!idMercadoria.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas números no identificador da mercadoria");
                }else if(!valorMercadoria.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas números no valor da mercadoria");
                }else if(fornecedor.matches("[0-9]+")){
                    JOptionPane.showMessageDialog(null, "Insira apenas letras no fornecedor");
                }
                else{
                Dados.getMercadorias().add(ControleDados.inserirAlimento(filialSelecionada, nomeMercadoria, qntMercadoria, idMercadoria, 
                	valorMercadoria, dataValidade, fornecedor, massa, perecivel));
                JOptionPane.showMessageDialog(null, "Mercadoria registrada com sucesso! :)");}
                txtNomeMercadoria.setText(null);
                txtQntMercadoria.setText(null);
                txtIdMercadoria.setText(null);
                txtValorMercadoria.setText(null);
                txtDataValidade.setText(null);
                txtFornecedor.setText(null);
                txtMassa.setText(null);
                txtPerecivel.setText(null);
            }
            
        });

            
            
        break;

        case 2: /**mostrar cadastro de bebidas */
            lblAlcool.setBounds(30, 310, 200, 25);
            lblVolume.setBounds(30, 350, 200, 25);

            txtAlcool.setPreferredSize(new Dimension(300, 25));
            txtAlcool.setBounds(150, 310, 160, 25);
            txtVolume.setPreferredSize(new Dimension(300, 25));
            txtVolume.setBounds(150, 350, 160, 25);

            janelaMercadoria.add(lblAlcool);
            janelaMercadoria.add(lblVolume);

            janelaMercadoria.add(txtAlcool);
            janelaMercadoria.add(txtVolume);
            janelaMercadoria.add(btnSalvarBebida);
            
            btnSalvarBebida.addActionListener(new ActionListener() {

            	/**
            	 * metodo para recebimento de dados de uma nova bebida
            	 * @param e
            	 */
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nomeMercadoria = txtNomeMercadoria.getText();
                    String qntMercadoria = txtQntMercadoria.getText();
                    String idMercadoria = txtIdMercadoria.getText();
                    String valorMercadoria = txtValorMercadoria.getText();
                    String dataValidade = txtDataValidade.getText();
                    String alcool = txtAlcool.getText();
                    String volume = txtVolume.getText() ;
                    String fornecedor = txtFornecedor.getText();
                    
                    String nomeSelecionado = (String) boxFilial.getSelectedItem();
                    for (Filial filial : Dados.getFiliais()) {
                        if (filial.getNome().equals(nomeSelecionado)) {
                            filialSelecionada = filial;
                            break;
                        }
                    }
                    
                    if(nomeMercadoria.isEmpty() == true || idMercadoria.isEmpty() == true || qntMercadoria.isEmpty() == true 
                    || valorMercadoria.isEmpty() == true || /*dataValidade.isEmpty() == true*/ fornecedor.isEmpty() == true){
                        JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                    }else if(nomeMercadoria.matches("[0-9]+")){
                        JOptionPane.showMessageDialog(null, "Insira apenas letras no nome da mercadoria");
                    }else if(!qntMercadoria.matches("[0-9]+")){
                        JOptionPane.showMessageDialog(null, "Insira apenas números na quantidade de mercadorias");
                    }else if(!idMercadoria.matches("[0-9]+")){
                        JOptionPane.showMessageDialog(null, "Insira apenas números no identificador da mercadoria");
                    }else if(!valorMercadoria.matches("[0-9]+")){
                        JOptionPane.showMessageDialog(null, "Insira apenas números no valor da mercadoria");
                    }else if(fornecedor.matches("[0-9]+")){
                        JOptionPane.showMessageDialog(null, "Insira apenas letras no fornecedor");
                    }
                    else{
                    Dados.getMercadorias().add(ControleDados.inserirAlimento(filialSelecionada ,nomeMercadoria, qntMercadoria, idMercadoria,
                    		valorMercadoria, dataValidade, alcool, volume, fornecedor));
                    JOptionPane.showMessageDialog(null, "Mercadoria registrada com sucesso! :)");
                    txtNomeMercadoria.setText(null);
                    txtQntMercadoria.setText(null);
                    txtIdMercadoria.setText(null);
                    txtValorMercadoria.setText(null);
                    txtDataValidade.setText(null);
                    txtFornecedor.setText(null);
                    }
                }
                
            });
            
        break;

        case 3: /**mostrar cadastro de produtos de casa */
        	pdLimpeza.setBounds(30, 310, 200, 25);
            estadoFis.setBounds(30, 350, 200, 25);

            txtPdLimpeza.setPreferredSize(new Dimension(300, 25));
            txtPdLimpeza.setBounds(150, 310, 160, 25);
            txtEstadoFis.setPreferredSize(new Dimension(300, 25));
            txtEstadoFis.setBounds(150, 350, 160, 25);

            janelaMercadoria.add(pdLimpeza);
            janelaMercadoria.add(estadoFis);


            janelaMercadoria.add(txtPdLimpeza);
            janelaMercadoria.add(txtEstadoFis);
            janelaMercadoria.add(btnSalvarCasa);
            
            btnSalvarCasa.addActionListener(new ActionListener() {

            	/**
            	 * metodo para recebimento de dados de um novo produto para casa
            	 * @param e
            	 */
                @Override
                public void actionPerformed(ActionEvent e) {
                    String nomeMercadoria = txtNomeMercadoria.getText();
                    String qntMercadoria = txtQntMercadoria.getText();
                    String idMercadoria = txtIdMercadoria.getText();
                    String valorMercadoria = txtValorMercadoria.getText();
                    String dataValidade = txtDataValidade.getText();
                    String pdLimpeza = txtPdLimpeza.getText();
                    String estadoFis = txtEstadoFis.getText() ;
                    String fornecedor = txtFornecedor.getText();
                    
                    String nomeSelecionado = (String) boxFilial.getSelectedItem();
                    for (Filial filial : Dados.getFiliais()) {
                        if (filial.getNome().equals(nomeSelecionado)) {
                            filialSelecionada = filial;
                            break;
                        }
                    }
                    
                    if(nomeMercadoria.isEmpty() == true || 
                    		idMercadoria.isEmpty() == true 
                    		|| qntMercadoria.isEmpty() == true 
                    		|| valorMercadoria.isEmpty() == true 
                    		|| dataValidade.isEmpty() == true 
                    		|| fornecedor.isEmpty() == true)
                    {
                        JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                        
                    }else if(nomeMercadoria.matches("[0-9]+")){
                        JOptionPane.showMessageDialog(null, "Insira apenas letras no nome da mercadoria");
                    }else if(!qntMercadoria.matches("[0-9]+")){
                        JOptionPane.showMessageDialog(null, "Insira apenas números na quantidade de mercadorias");
                    }else if(!idMercadoria.matches("[0-9]+")){
                        JOptionPane.showMessageDialog(null, "Insira apenas números no identificador da mercadoria");
                    }else if(!valorMercadoria.matches("[0-9]+")){
                        JOptionPane.showMessageDialog(null, "Insira apenas números no valor da mercadoria");
                    }else if(fornecedor.matches("[0-9]+")){
                        JOptionPane.showMessageDialog(null, "Insira apenas letras no fornecedor");
                    }
                    else if(!dataValidade.matches("\\d\\d/\\d\\d/\\d\\d\\d\\d")) {
                    	JOptionPane.showMessageDialog(null, "Formato incorreto de data!");
                    }
                    else{
                    Dados.getMercadorias().add(ControleDados.inserirPdCasa(filialSelecionada, nomeMercadoria, 
                    		qntMercadoria, idMercadoria, valorMercadoria, dataValidade,
                    		pdLimpeza, estadoFis, fornecedor));
                    JOptionPane.showMessageDialog(null, "Mercadoria registrada com sucesso! :)");}
                }
                
            });
            
            
        break;
        }
    }
}