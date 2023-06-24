package model;
import java.util.ArrayList;

public class Dados {

/** classe simulação banco de dados
 * @author Marcos, Diego e Filipe
 */
	public static final ArrayList<Mercadoria> mercadorias = new ArrayList<Mercadoria>();
	public static final ArrayList<Filial> filiais = new ArrayList<Filial>();
	


	public static ArrayList<Filial> getFiliais() {
		return filiais;
	}



	public static ArrayList<Mercadoria> getMercadorias() {
		return mercadorias;
  }
	
	
}

