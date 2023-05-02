package gerestoque;

import java.util.ArrayList;

public class Estoque{
	
	private int id;
	public ArrayList<Mercadoria> mercadorias;

	public Estoque(int i) {
		id = i;
		mercadorias = new ArrayList<>();
		
	}
	public void adicionarItem(Mercadoria mercadoria) {
		mercadorias.add(mercadoria);
	}
	public void removerItem(Mercadoria mercadoria) {
		mercadorias.remove(mercadoria);
	}
	public void attItem(Mercadoria mercadoria) {
		mercadoria.setQuantidade(0);
	}
	public void buscarItem() {
		for(Mercadoria m : mercadorias)
		
			getMercadorias();
			//e agora?kkkkkkkk
	}
	/*public void checarQuantidadeItem(String codigo) {
	
	}*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Mercadoria> getMercadorias() {
		return mercadorias;
	}

	public void setMercadorias(ArrayList<Mercadoria> mercadorias) {
		this.mercadorias = mercadorias;
	}

}
