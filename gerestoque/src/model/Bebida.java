package model;

import java.util.Date;

public class Bebida extends Mercadoria {
    
	private boolean alcool;
    private String volume;

	public Bebida(String nome, int quantidade, double valor, 
    		String codigoMercadoria, String dataValidade, 
    		String fornecedor, boolean alcool, String volume) {
	}

    //getters e setters
    public boolean isAlcool() {
        return alcool;
    }

    public void setAlcool(boolean alcool) {
        this.alcool = alcool;
    }

    public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}
}
