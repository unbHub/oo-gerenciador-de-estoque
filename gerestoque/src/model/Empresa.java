package model;

import java.util.ArrayList;

public class Empresa {

    private String nome;
    private ArrayList<Filial> filiais;
    private String nomeFilial;
	private int idFilial;
    //private Filial filial;

	// Construtor
    public Empresa(String n) {
        nome = n;

    }

    // Metodos autogerados
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

    public ArrayList<Filial> getFiliais() {
		return filiais;
	}

	public void setFiliais(ArrayList<Filial> filiais) {
		this.filiais = filiais;
	}

    // Metodos
    public void addFilial(Filial filial) {
        filiais.add(filial);
    }

    public void remFilial(Filial filial) {
        filiais.remove(filial);
    }

    // Método com For Each que percorre as filiais da empresa usando o parâmetro do
    // código da filial
    public Filial buscarFilial(int id) {
        for (Filial f : filiais) {
            if (f.getId() == id){
                return f;
                
            }
        }
        return null;
    }
 
}