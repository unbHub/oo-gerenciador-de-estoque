package model;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Diego Carlito
 * @author Filipe Carvalho
 * @author Marcos Castilhos
 *Classe model Empresa, para possivel instancia de empresas, não é o caso
 *do nosso codigo. Instanciamos uma empresa previamente
 */

public class Empresa {

    private String nome;
    private static List<Filial> filiais;
	private String nomeFilial;
	private int idFilial;

	/**
	 * 
	 * @param n
	 * construtor de empresa. instancia uma nova arraylist de filiais para cada
	 * empresa criada
	 */
    public Empresa(String n) {
    	filiais = new ArrayList<Filial>();
        nome = n;

    }

    // Metodos autogerados gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNomeFilial() {
 		return nomeFilial;
 	}

 	public void setNomeFilial(String nomeFilial) {
 		this.nomeFilial = nomeFilial;
 	}

 	public int getIdFilial() {
 		return idFilial;
 	}

 	public void setIdFilial(int idFilial) {
 		this.idFilial = idFilial;
 	}
    public List<Filial> getFiliais() {
 		return filiais;
 	}

 	public void setFiliais(List<Filial> filiais) {
 		this.filiais = filiais;
 	}


    /**
     *  Metodo de adição de filial
     * @param filial
     */
    
 	public void addFilial(Filial filial) {
        filiais.add(filial);
    }
    /**
     *  Metodo de remoção de filial
     * @param filial
     */
    public void remFilial(Filial filial) {
        filiais.remove(filial);
    }
 
}