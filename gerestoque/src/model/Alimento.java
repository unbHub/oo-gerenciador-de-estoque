package model;

import java.util.Date;

public class Alimento extends Mercadoria {
	
	private String perecivel;
	private String massa;
	
    public Alimento(String nome, String quantidade, String valor, 
    		String codigoMercadoria, String dataValidade,
    		String fornecedor, String perecivel, String massa){
        
    	this.nome = nome;
    	this.quantidade = quantidade;
    	this.valor = valor;
    	this.codM = codigoMercadoria;
    	this.dataValidade = dataValidade;
    	this.fornecedor = fornecedor;
    	this.perecivel = perecivel;
    	this.massa = massa;
    }
    public String getPerecivel() {
		return perecivel;
	}

	public void setPerecivel(String perecivel) {
		this.perecivel = perecivel;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}
}
