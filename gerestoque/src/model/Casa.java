package model;


public class Casa extends Mercadoria {
	//indica se é ou nao um produto de limpeza e seu estado (solido ou liquido)
	private String pdLimpeza;
	private String estadoFis;
	
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
    
	public String isPdLimpeza() {
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
