package model;

import java.util.Date;

public class Casa extends Mercadoria {
	//indica se é ou nao um produto de limpeza e seu estado (solido ou liquido)
	private boolean pdLimpeza;
	private String estadoFis;
	
    public Casa(String nome, int quantidade, double valor, String codigoMercadoria, 
    		String descricao,Date dataValidade, String fornecedor, boolean pdLimpeza,
    		String estadoFis) {
	
	}
    
	public boolean isPdLimpeza() {
		return pdLimpeza;
	}

	public void setPdLimpeza(boolean pdLimpeza) {
		this.pdLimpeza = pdLimpeza;
	}

	public String getEstadoFis() {
		return estadoFis;
	}

	public void setEstadoFis(String estadoFis) {
		this.estadoFis = estadoFis;
	}


}
