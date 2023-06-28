package model;

import java.util.Date;


public abstract class Mercadoria {
	
	protected String nome;
	protected int quantidade;
	protected double valor;
	protected String codigoMercadoria;
	protected static String dataValidade = "\\d\\d/\\d\\d/\\d\\d\\d\\d";
	protected String fornecedor;
	
		public Mercadoria() {
			super();
		}
		
	//Metodos autogerados:
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		public double getValor() {
			return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}
		public String getCodigo() {
			return codigoMercadoria;
		}
		public void setCodigo(String codigo) {
			this.codigoMercadoria = codigo;
		}
		public String getDataValidade() {
			return dataValidade;
		}
		public String getFornecedor() {
			return fornecedor;
		}
		public void setFornecedor(String fornecedor) {
			this.fornecedor = fornecedor;
		}
		
		@Override
		public String toString() {
			return "Mercadoria [nome=" + nome + ", quantidade=" + quantidade 
					+ ", valor=" + valor + ", codigo=" + codigoMercadoria
					+ ", descricao=" + ", dataValidade=" + dataValidade 
					+ ", fornecedor=" + fornecedor
					+ "]";
		}
		
}




