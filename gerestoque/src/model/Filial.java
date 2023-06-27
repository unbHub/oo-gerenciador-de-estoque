package model;
import java.util.ArrayList;
import java.util.List;

public class Filial {
    private String nome;
    private double valorTotal;
    private String idFilial;
    private List<Mercadoria> mercadorias;

	//Construtor
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
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
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

	public void setMercadorias(List<Mercadoria> mercadorias) {
		this.mercadorias = mercadorias;
	}

    //Metodos 
	/*
    public void addMercadoria(Mercadoria mercadoria) {
        mercadorias.add(mercadoria);
    }
	*/
    public void remMercadoria(Mercadoria mercadoria) {
        mercadorias.remove(mercadoria);
    }
    public Mercadoria buscarMercadoria(String cod) {
        for (Mercadoria m : mercadorias) {
            if (m.getCodigo() == cod){
                return m;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Filial [nome = " + nome + ", id =" 
        		+ idFilial;
    }

}