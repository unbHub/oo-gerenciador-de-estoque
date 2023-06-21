package model;
import java.util.ArrayList;

public class Filial {
    private String nome;
    private double valorTotal;
    private int idFilial;
    private ArrayList<Mercadoria> mercadorias = new ArrayList<>();
    //private Mercadoria mercadoriasNoEstoque;
	//private boolean idCorreto;

	//Construtor
    public Filial(String n, int iF) {
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
    public int getId() {
        return idFilial;
    }
    public void setId(int id) {
        this.idFilial = id;
    }
	public ArrayList<Mercadoria> getMercadorias() {
		return mercadorias;
	}
	public void setMercadorias(ArrayList<Mercadoria> mercadorias) {
		this.mercadorias = mercadorias;
	}

    //Metodos 
    public void addMercadoria(Mercadoria mercadoria) {
        mercadorias.add(mercadoria);
    }

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
        return "Filial [nome=" + nome + ", valorTotal=" + valorTotal + ", id=" 
        		+ idFilial;
    }

}