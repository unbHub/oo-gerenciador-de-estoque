package model;

/**
 * 
 * @author Diego Carlito
 * @author Filipe Carvalho
 * @author Marcos Castilhos
 *Classe model Casa, para instacia de produtos de casa
 */

public class Casa extends Mercadoria {
	//indica se é ou nao um produto de limpeza e seu estado (solido ou liquido)
	private String pdLimpeza;
	private String estadoFis;
	
	/**
	 * 
	 * @param nome
	 * @param quantidade
	 * @param valor
	 * @param codigoMercadoria
	 * @param dataValidade
	 * @param fornecedor
	 * @param pdLimpeza
	 * @param estadoFis
	 */
    public Casa(String nome, String quantidade, String valor, String codigoMercadoria, 
    		String dataValidade, String fornecedor, String pdLimpeza,
    		String estadoFis) {
	
    	this.nome = nome;
    	this.quantidade = quantidade;
    	this.valor = valor;
    	this.codM = codigoMercadoria;
    	this.dataValidade = dataValidade;
    	this.fornecedor = fornecedor;
    	this.pdLimpeza = pdLimpeza;
    	this.estadoFis = estadoFis;
	}
    
	public String getPdLimpeza() {
		return pdLimpeza;
	}

	public void setPdLimpeza(String pdLimpeza) {
		this.pdLimpeza = pdLimpeza;
	}

	public String getEstadoFis() {
		return estadoFis;
	}

	public void setEstadoFis(String estadoFis) {
		this.estadoFis = estadoFis;
	}


}
