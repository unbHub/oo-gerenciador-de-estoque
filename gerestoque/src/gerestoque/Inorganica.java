package gerestoque;

public class Inorganica extends Mercadoria {

	//Objeto inorganica
	public Inorganica() {
		
	}
	public String toString() {
		return "Mercadoria inorganica:\n" + nome + quantidade + "\n" + valor + "\n" + codigo + "\n" + descricao + "\n" + dataValidade + fornecedor;
	}
}
