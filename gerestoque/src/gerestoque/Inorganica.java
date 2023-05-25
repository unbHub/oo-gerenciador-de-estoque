package gerestoque;

public class Inorganica extends Mercadoria {
	private String formaUso;

	//Construtor inorganica
	public Inorganica() {
		
	}
	
	//Metodos autogerados
	public String getFormaUso() {
		return formaUso;
	}
	public void setFormaUso(String formaUso) {
		this.formaUso = formaUso;
	}
	
	@Override
	public String toString() {
		return "Mercadoria inorganica:\n" +  nome + quantidade + "\n" + valor + 
				"\n" + descricao + codigoMercadoria + "\n" + fornecedor +
				formaUso + "\n";
	}

}
