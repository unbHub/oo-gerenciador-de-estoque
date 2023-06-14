package model;

public class Dados {

	private Mercadoria[] mercadorias = new Mercadoria[100]; 
	private int qtdMercadorias = 0;
	private Filial[] filiais = new Filial[10];
	private int qtdFiliais = 0;
	private Estoque[] estoques = new Estoque[10];
	private int qtdEstoques = qtdFiliais;
	
	public Mercadoria[] getMercadorias() {
		return mercadorias;
	}
	public void setMercadorias(Mercadoria[] mercadorias) {
		this.mercadorias = mercadorias;
	}
	public int getQtdMercadorias() {
		return qtdMercadorias;
	}
	public void setQtdMercadorias(int qtdMercadorias) {
		this.qtdMercadorias = qtdMercadorias;
	}
	public Filial[] getFiliais() {
		return filiais;
	}
	public void setFiliais(Filial[] filiais) {
		this.filiais = filiais;
	}
	public int getQtdFilais() {
		return qtdFiliais;
	}
	public void setQtdFilais(int qtdFilais) {
		this.qtdFiliais = qtdFilais;
	}
	
}
