package gerestoque;

public class Filial {
	private String nome;
	private double valorTotal;
	private double id;
	private String endereco;
	private Estoque estoque;
	
	public Filial(String n, double vT, double i, String e) {
		nome = n;
		valorTotal = vT;
		id = i;
		endereco = e;
		
	}
	
	public double relatarValorTotal() {
		return valorTotal;
		
	}
//	public void listarEstoque() {
//		Estoque es = this.getEstoque();
//		es.getId();
//		
//	}
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
	public void setId(double id) {
		this.id = id;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Estoque getEstoque() {
		return estoque;
	}
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

}
	
