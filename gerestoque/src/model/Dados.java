package model;

public class Dados {

	private int qtdFiliais = 0;
	private Filial[] filiais = new Filial[10];
	private int qtdEstoques = qtdFiliais;
	private Estoque[] estoques = new Estoque[10];
	private Mercadoria[] mercadorias = new Mercadoria[25];
	private int qtdMercadoriasEstoque;
	
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
	public void inserirEditarFiliais(Filial f, int pos) {
		this.filiais[pos] = f;
		if(pos == qtdFiliais) {
			qtdFiliais++;
		}
	}
	public int getQtdEstoques() {
		return qtdEstoques;
	}
	public void setQtdEstoques(int qtdEstoques) {
		this.qtdEstoques = qtdEstoques;
	}
	public Estoque[] getEstoques() {
		return estoques;
	}
	public void setEstoques(Estoque[] estoques) {
		this.estoques = estoques;
	}
	public void inserirEditarEstoque(Estoque e, int pos) {
		this.estoques[pos] = e;
		if(pos == qtdEstoques) {
			qtdEstoques++;
		}
	}
	public Mercadoria[] getMercadorias() {
		return mercadorias;
	}
	public void setMercadorias(Mercadoria[] mercadorias) {
		this.mercadorias = mercadorias;
	}

	public int getQtdMercadoriasEstoque() {
		return qtdMercadoriasEstoque;
	}
	public void setQtdMercadoriasEstoque(int qtdMercadoriasEstoque) {
		this.qtdMercadoriasEstoque = qtdMercadoriasEstoque;
	}
	
}

