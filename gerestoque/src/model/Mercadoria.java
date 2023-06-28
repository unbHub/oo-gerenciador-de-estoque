package model;

import java.util.Date;


public abstract class Mercadoria {
	
	protected String nome;
	protected String quantidade;
	protected String valor;
	protected String codM;
	protected String dataValidade;
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
		public String getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(String quantidade) {
			this.quantidade = quantidade;
		}
		public String getValor() {
			return valor;
		}
		public void setValor(String valor) {
			this.valor = valor;
		}
		public String getCodigo() {
			return codM;
		}
		public void setCodigo(String codigo) {
			this.codM = codigo;
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
					+ ", valor=" + valor + ", codigo=" + codM
					+ ", descricao=" + ", dataValidade=" + dataValidade 
					+ ", fornecedor=" + fornecedor
					+ "]";
		}
		
}




