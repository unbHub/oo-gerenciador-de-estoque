package gerestoque;

public class Organica extends Mercadoria {
	
	//private String tipo;
	private String formaArmazenamento;

	//Objeto organica
	public Organica(/*String n, int q, double v, int i, String d, String dv, String f, String fa*/) {
//		nome = n;
//		quantidade = q;
//		valor = v;
//		id = i;
//		descricao = d;
//		dataValidade = dv;
//		fornecedor = f;
//		//tipo = t;
//		formaArmazenamento = fa;
	}
	//Concatenação das caracteristicas da mercadoria
	public String toString() {
		return "Mercadoria organica:\n" + nome + quantidade + "\n" + valor + "\n" + id + "\n" + descricao + dataValidade + fornecedor + formaArmazenamento;
	}
//	public String getTipo() {
//		return tipo;
//	}
//	public void setTipo(String tipo) {
//		this.tipo = tipo;
//	}
	public String getFormaArmazenamento() {
		return formaArmazenamento;
	}
	public void setFormaArmazenamento(String formaArmazenamento) {
		this.formaArmazenamento = formaArmazenamento;
	}
}
