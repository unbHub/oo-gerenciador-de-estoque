package gerestoque;

public class Organica extends Mercadoria {

	public Organica(String n, int q, double v, int i, String d, String dv, String f) {
		nome = n;
		quantidade = q;
		valor = v;
		id = i;
		descricao = d;
		dataValidade = dv;
		fornecedor = f;
	}
	public String toString() {
		return "Mercadoria norgânica: " + nome + quantidade + valor + id + descricao + dataValidade + fornecedor;
	}
}
