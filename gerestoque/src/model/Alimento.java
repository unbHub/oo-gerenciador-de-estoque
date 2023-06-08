package model;

import java.util.Date;

public class Alimento extends Mercadoria {
	
	private boolean perecivel;
	private String massa;
	
    public Alimento(String nome, int quantidade, double valor, 
    		String codigoMercadoria, String descricao, Date dataValidade,
    		String fornecedor, boolean perecivel, String massa){
        
   }
    public boolean isPerecivel() {
		return perecivel;
	}

	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}
}
