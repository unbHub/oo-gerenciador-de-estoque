package model;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Diego Carlito
 * @author Filipe Carvalho
 * @author Marcos Castilhos
 *Classe model Filial, para instancia de filiais
 */
public class Filial {
    private String nome;
    private String idFilial;
    private List<Mercadoria> mercadorias;

	/**
	 * Construtor de filial. instancia um novo arraylist para cada filial 
	 * nova criada.
	 * @param n
	 * @param iF
	 */
    public Filial(String n, String iF) {
    	mercadorias = new ArrayList<Mercadoria>();
        nome = n;
        idFilial = iF;
  
    }
    
    //Metodos autogerados
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return idFilial;
    }
    public void setId(String id) {
        this.idFilial = id;
    }
	public List<Mercadoria> getMercadorias() {
		return mercadorias;
	}

    /**
     * Método para adição de novas mercadorias em uma filial
     * @param mercadoria
     */
    public void addMercadoria(Mercadoria mercadoria) {
        mercadorias.add(mercadoria);
    }
    /**
     * metodo para remoção de mercadorias
     * @param mercadoria
     */
    public void remMercadoria(Mercadoria mercadoria) {
    	mercadorias.remove(mercadoria);
    }
    @Override
    public String toString() {
        return "Filial [nome = " + nome + ", id =" 
        		+ idFilial;
    }

}