package gerestoque;

public class Filial {
	private String nome;
	private int valorTotal;
	private int id;
	private String endereco;
	
	public Filial(String n, int vT, int i, String e) {
		nome = n;
		valorTotal = vT;
		id = i;
		endereco = e;
		
	}
	public void relatarValorTotal() {
		
	}
	public void listarEstoque() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
	
