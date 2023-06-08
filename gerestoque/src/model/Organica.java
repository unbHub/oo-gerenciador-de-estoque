/**package model;

import java.util.Date;

import java.text.SimpleDateFormat;

public class Organica extends Mercadoria {

	private String formaArmazenamento;
	//Biblioteca do java para reformar a data
	SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
	
	
	//Construtor organica
	public Organica(String nome, int quantidade, double valor, String codigoMercadoria, String descricao,
	Date dataValidade, String fornecedor) {
super(nome, quantidade, valor, codigoMercadoria, descricao, dataValidade, fornecedor);
	}
	
	//Metodos autogerados
	public String getFormaArmazenamento() {
		return formaArmazenamento;
	}
	public void setFormaArmazenamento(String formaArmazenamento) {
		this.formaArmazenamento = formaArmazenamento;
	}

	//esse método serve para listarmos todas as características do produto
	public void listarOrganica(){
		System.out.println("mercadoria organica:\n"); 
		System.out.printf("nome: %s\n", getNome()); 
		System.out.printf("quantidade: %d\n", getQuantidade()); 
		System.out.printf("valor: %.2f\n", getValor()); 
		System.out.printf("código da mercadoria: %s\n", getCodigo()); 
		System.out.printf("descrição: %s\n", getDescricao()); 
		//System.out.printf("data de validade: %d\n", getDataValidade()); 
		System.out.printf("fornecedor: %s\n", getFornecedor()); 
	}
	
	//Concatenação das caracteristicas da mercadoria
	/*@Override
	public String toString() {
		return "Mercadoria organica:\n" + this.nome + this.quantidade + "\n" + this.valor + 
				"\n" + this.descricao + this.codigoMercadoria + "\n" + 
				formatar.format(dataValidade) +"\n"+ this.fornecedor +
				this.formaArmazenamento + "\n";
	}
			
**/


