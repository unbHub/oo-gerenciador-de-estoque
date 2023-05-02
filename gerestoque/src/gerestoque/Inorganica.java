package gerestoque;

import java.text.SimpleDateFormat;

public class Inorganica extends Mercadoria {
	SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");

	//Construtor inorganica
	public Inorganica() {
		
	}
	@Override
	public String toString() {
		return "Mercadoria inorganica:\n" +  nome + quantidade + "\n" + valor + "\n" + descricao + codigo + "\n" + formatar.format(dataValidade) +"\n"+ fornecedor;
	}
}
