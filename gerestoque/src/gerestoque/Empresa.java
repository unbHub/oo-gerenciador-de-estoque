package gerestoque;

public class Empresa {
	
	private String nome;
	private Filial filial;

	public Empresa() {
		
	}
	
	public void addFilial() {
		Filial f = this.getFilial();
	}
	public void remFilial() {
		
	}
	public void attFilial() {
		
	}
	public void busFilial() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}
}
