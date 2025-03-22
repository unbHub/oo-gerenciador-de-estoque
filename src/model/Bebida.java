package model;

import java.util.Date;

/**
 * 
 * @author Diego Carlito
 * @author Filipe Carvalho
 * @author Marcos Castilhos
 *Classe model bebida, para instacia de bebidas
 */
public class Bebida extends Mercadoria {
    
	private String alcool;
    private String volume;

    /**
     * 
     * @param nome
     * @param quantidade
     * @param valor
     * @param codigoMercadoria
     * @param dataValidade
     * @param fornecedor
     * @param alcool
     * @param volume
     */
	public Bebida(String nome, String quantidade, String valor, 
    		String codigoMercadoria, String dataValidade, 
    		String fornecedor, String alcool, String volume) {
		
    	this.nome = nome;
    	this.quantidade = quantidade;
    	this.valor = valor;
    	this.codM = codigoMercadoria;
    	this.dataValidade = dataValidade;
    	this.fornecedor = fornecedor;
    	this.alcool = alcool;
    	this.volume = volume;
	}

    //getters e setters
    public String getAlcool() {
        return alcool;
    }

    public void setAlcool(String alcool) {
        this.alcool = alcool;
    }

    public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}
}
