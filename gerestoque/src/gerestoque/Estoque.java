package gerestoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque{
	
	private int id;
	private int qtdMercadorias = 0;
	private ArrayList<Mercadoria> mercadorias;
	public Mercadoria mercadoria;
	
	Scanner scan = new Scanner(System.in);
	
	public Estoque(int i) {
		id = i;
		mercadorias = new ArrayList<>();
		
	}
	public void adicionarItem(Mercadoria mercadoria) {
		mercadorias.add(mercadoria);
		qtdMercadorias++;
	}
	public void removerItem(Mercadoria mercadoria) {
		mercadorias.remove(mercadoria);
		qtdMercadorias--;
	}
	public void attQtItem(Mercadoria mercadoria) {
		mercadoria.setQuantidade(scan.nextInt());
		scan.close();
	}
	public void buscarItem() {
		/*System.out.println("Digite o codigo do item");
		String i = scan.nextLine();
		for(Mercadoria m : mercadorias)
			if(i.equals(mercadoria.getCodigo())) {
				System.out.println("Item blalblalb");
				break;
			}*/
	}
	
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
