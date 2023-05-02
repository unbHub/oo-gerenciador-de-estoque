package gerestoque;

import java.text.SimpleDateFormat;

public class Organica extends Mercadoria {
	
	//private String tipo;
	private String formaArmazenamento;
	SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
	
	
	//Objeto organica
	public Organica() {
	
	}
	//Concatenação das caracteristicas da mercadoria
	public String toString() {
		return "Mercadoria organica:\n" + nome + quantidade + "\n" + valor + "\n" + descricao + codigo + "\n" + formatar.format(dataValidade) +"\n"+ fornecedor + formaArmazenamento;
	}
	public String getFormaArmazenamento() {
		return formaArmazenamento;
	}
	public void setFormaArmazenamento(String formaArmazenamento) {
		this.formaArmazenamento = formaArmazenamento;
	}
}
