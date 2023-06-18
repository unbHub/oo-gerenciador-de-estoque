package model;


public class Filial {
    private String nome;
    private double valorTotal;
    private int id;
    private Estoque estoque;
    private Mercadoria mercadoriasNoEstoque;
	//private boolean idCorreto;
    
    //Construtor
    public Filial(String nome, int id) {
        this.nome = nome;
        this.id = id;
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
    public double getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Estoque getEstoque() {
        return estoque;
    }
    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
    public Mercadoria getMercadoriasNoEstoque() {
		return mercadoriasNoEstoque;
	}

	public void setMercadoriasNoEstoque(Mercadoria mercadoriasNoEstoque) {
		this.mercadoriasNoEstoque = mercadoriasNoEstoque;
	}

    //Metodos 
    public boolean listarEstoque(int ident) {
    	if(ident == estoque.getId()) {
        	estoque.getMercadorias();
    		return true;
    	} else {
    		return false;
    	}
    }

    @Override
    public String toString() {
        return "Filial [nome=" + nome + ", valorTotal=" + valorTotal + ", id=" 
        		+ id;
    }

}