package gerestoque;

import java.text.SimpleDateFormat;

public class Organica extends Mercadoria {
	
	private String formaArmazenamento;
	//Biblioteca do java para reformar a data
	SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
	
	
	//Construtor organica
	public Organica() {
	
	}
	
	//Metodos autogerados
	public String getFormaArmazenamento() {
		return formaArmazenamento;
	}
	public void setFormaArmazenamento(String formaArmazenamento) {
		this.formaArmazenamento = formaArmazenamento;
	}
	
	//Concatenação das caracteristicas da mercadoria
	@Override
	public String toString() {
		return "Mercadoria organica:\n" + nome + quantidade + "\n" + valor + 
				"\n" + descricao + codigoMercadoria + "\n" + 
				formatar.format(dataValidade) +"\n"+ fornecedor +
				formaArmazenamento + "\n";
	}

}
