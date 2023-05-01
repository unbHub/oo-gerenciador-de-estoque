package gerestoque;

public class Organica extends Mercadoria {
	
	//private String tipo;
	private String formaArmazenamento;

	//Objeto organica
	public Organica() {

	}
	//Concatenação das caracteristicas da mercadoria
	public String toString() {
		return "Mercadoria organica:\n" + nome + quantidade + "\n" + valor + "\n" + descricao + codigo + "\n" + dataValidade + fornecedor + formaArmazenamento;
	}
	public String getFormaArmazenamento() {
		return formaArmazenamento;
	}
	public void setFormaArmazenamento(String formaArmazenamento) {
		this.formaArmazenamento = formaArmazenamento;
	}
}
