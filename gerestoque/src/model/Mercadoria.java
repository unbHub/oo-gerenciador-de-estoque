package model;

import java.util.Date;


public abstract class Mercadoria {
	
	protected String nome;
	protected int quantidade;
	protected double valor;
	protected String codM;
	protected Date dataValidade;
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
			return codM;
		}
		public void setCodigo(String codigo) {
			this.codM = codigo;
		}
		public Date getDataValidade() {
			return dataValidade;
		}
		public void setDataValidade(Date dataValidade) {
			this.dataValidade = dataValidade;
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




