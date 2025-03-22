package model;

import java.util.ArrayList;
import java.util.List;

public class Dados {

	/**
	 * 
	 * @author Diego Carlito
	 * @author Filipe Carvalho
	 * @author Marcos Castilhos
	 *Classe model Dados, para simulação de um banco de dados
	 *
	 */
	public static final ArrayList<Mercadoria> mercadorias = new ArrayList<Mercadoria>();
	public static final ArrayList<Filial> filiais = new ArrayList<Filial>();
	
	/**
	 * Metodo para preenchemento de dados
	 */
	public static void fillWithSomeData() {
		for (int i = 0; i < 3; i++) {
	        Filial filial = new Filial("Filial" + i, "123" + i);

	        filial.addMercadoria(new Alimento("Alimento" + i, "" + i, "" + i, "123" + i, "10/10/2023", "Fornecedor" + i, "Perecivel", "" + i));
	        
	        filial.addMercadoria(new Casa("Casa" + i, "" + i, "" + i, "456" + i, "11/10/2023", "Fornecedor" + i, "Limpeza", "Liquido"));

	        filial.addMercadoria(new Bebida("Bebida" + i, "" + i, "" + i, "456" + i, "11/10/2023", "Fornecedor" + i, "Alcool", "" + i));
	          
	        filiais.add(filial);
	        
	        mercadorias.addAll(filial.getMercadorias());
		}

	}
	
	public static ArrayList<Filial> getFiliais() {
		return filiais;
	}
	
	public static ArrayList<Mercadoria> getMercadorias() {
		return mercadorias;
	}

}
