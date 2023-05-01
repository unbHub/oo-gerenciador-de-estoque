package gerestoque;

public class Estoque{
	
	private int id;
	public Mercadoria mercadoria;

	public Estoque(int i) {
		id = i;
	}
	
	public void removerItem() {
		
	}
	public void attItem() {
		
	}
	public void buscarItem() {
		Mercadoria m = this.getMercadoria();
		m.getNome();
		m.getCodigo();
		
		
	}
	public void checarQuantidadeItem(String codigo) {
		Mercadoria m = this.getMercadoria();
		m.getQuantidade();
		System.out.println();
	}
//	public void addItem() {
//		int quant = 0;
//		Mercadoria m = this.getMercadoria();
//		m.setNome("");
//		m.setQuantidade(0);
//		m.setValor(0);
//		m.setId(0);
//		m.setDescricao("");
//		m.setDataValidade("");
//		m.setFornecedor("");
	
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Mercadoria getMercadoria() {
		return mercadoria;
	}

	public void setMercadoria(Mercadoria mercadoria) {
		this.mercadoria = mercadoria;
	}
}
