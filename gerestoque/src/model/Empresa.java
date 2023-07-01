package model;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nome;
    private static List<Filial> filiais;
	private String nomeFilial;
	private int idFilial;
    //private Filial filial;

	// Construtor empresa
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


    // Metodo de adição de filial
    
 	public void addFilial(Filial filial) {
        filiais.add(filial);
    }
    // Metodo de remoção de filial
    public void remFilial(Filial filial) {
        filiais.remove(filial);
    }

    // Método com For Each que percorre as filiais da empresa usando o parâmetro do
    // código da filial
    public static Filial buscarFilial(String id) {
        for (Filial f : filiais) {
            if (f.getId().equals(id)){
                return f;
                
            }
        }
        return null;
    }
 
}