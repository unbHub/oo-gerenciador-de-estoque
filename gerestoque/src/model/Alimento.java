package model;

import java.util.Date;

public class Alimento extends Mercadoria {
	
	private boolean perecivel;
	private double massa;
	
    public Alimento(String nome, int quantidade, double valor, 
    		String codigoMercadoria, String dataValidade,
    		String fornecedor, boolean perecivel, double massa){
        
   }
    public boolean isPerecivel() {
		return perecivel;
	}

	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}

	public double getMassa() {
		return massa;
	}

	public void setMassa(double massa) {
		this.massa = massa;
	}
}
