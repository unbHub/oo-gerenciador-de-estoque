/**package model;

import java.util.Date;


public class Inorganica extends Mercadoria {
	private String formaUso;

	//Construtor inorganica
	public Inorganica(String nome, int quantidade, double valor, String codigoMercadoria, String descricao,
			Date dataValidade, String fornecedor) {
		super(nome, quantidade, valor, codigoMercadoria, descricao, dataValidade, fornecedor);
	}

	
	//Metodos autogerados
	public String getFormaUso() {
		return formaUso;
	}
	public void setFormaUso(String formaUso) {
		this.formaUso = formaUso;
	}

	//esse método serve para listarmos todas as caracterícas do produto 
	public void listarInorganica(){
		System.out.println("mercadoria inorganica:\n"); 
		System.out.printf("nome: %s\n", getNome()); 
		System.out.printf("quantidade: %d\n", getQuantidade()); 
		System.out.printf("valor: %.2f\n", getValor()); 
		System.out.printf("código da mercadoria: %s\n", getCodigo()); 
		System.out.printf("descrição: %s\n", getDescricao()); 
		//System.out.printf("data de validade: %d\n", getDataValidade()); 
		System.out.printf("fornecedor: %s\n", getFornecedor()); 
		
	}
	
	/*@Override
	public String toString() {
		return "Mercadoria inorganica:\n" +  nome + quantidade + "\n" + valor + 
				"\n" + descricao + codigoMercadoria + "\n" + fornecedor +
				formaUso + "\n";
	}

}
**/
