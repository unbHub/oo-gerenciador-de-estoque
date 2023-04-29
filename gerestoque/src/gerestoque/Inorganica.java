package gerestoque;

public class Inorganica extends Mercadoria {

	//Objeto inorganica
	public Inorganica(String n, int q, double v, int i, String d, String dv, String f, String fa) {
		nome = n;
		quantidade = q;
		valor = v;
		id = i;
		descricao = d;
		dataValidade = dv;
		fornecedor = f;
		//tipo = t;
		
	}
}
