package gerestoque;

import java.util.ArrayList;

import produtos.organicos.Mercadoria;

public class Estoque{

    private int id;
    private int qtdMercadorias = 0;

    private ArrayList<Mercadoria> mercadorias;
    public Mercadoria mercadoria;
    private boolean codigoCorreto;
    
	//Construtor
    public Estoque(int i) {
        id = i;
        mercadorias = new ArrayList<>();

    }
    //Metodos autogerados
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getQtdMercadorias() {
        return qtdMercadorias;
    }
    public void setQtdMercadorias(int qtdMercadorias) {
        this.qtdMercadorias = qtdMercadorias;
    }
    public ArrayList<Mercadoria> getMercadorias() {
        return mercadorias;
    }
    public void setMercadorias(ArrayList<Mercadoria> mercadorias) {
        this.mercadorias = mercadorias;
    }
    public Mercadoria getMercadoria() {
        return mercadoria;
    }
    public void setMercadoria(Mercadoria mercadoria) {
        this.mercadoria = mercadoria;
    }
    public boolean isCodigoCorreto() {
		return codigoCorreto;
	}
	public void setCodigoCorreto(boolean codigoCorreto) {
		this.codigoCorreto = codigoCorreto;
	}
    
    //Métodos 
    public void adicionarItem(Mercadoria mercadoria) {
        mercadorias.add(mercadoria);
        qtdMercadorias += 1;
    }
    public void removerItem(Mercadoria mercadoria) {
        mercadorias.remove(mercadoria);
        qtdMercadorias -= 1;
    }
    public void attQtItem(String cdgM, int qtdM) {
        for(Mercadoria m : mercadorias) {
        	if (m.getCodigo() == cdgM) {
        		m.setQuantidade(qtdM);
        	} else {
        		break;
        	  }
        }
    }
    //Método com For Each que percorre as mercadorias do estoque usando o parâmetro do código do item
    public void buscarItem(String codigoItem) {
        for(Mercadoria m : mercadorias) {
            if (m.getCodigo() == codigoItem) {
            	codigoCorreto = true;
            } else {
            	break;
            }
        }
    }
    public boolean isEstoqueVazio(int id) {
    	this.id = getId();
    	if (mercadorias.isEmpty()) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

}