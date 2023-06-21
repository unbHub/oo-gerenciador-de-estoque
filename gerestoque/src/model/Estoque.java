package model;

import java.util.ArrayList;

import model.Mercadoria;

public class Estoque{
/**
    private int id;
    private int qtdMercadorias = 0;
    private ArrayList<Mercadoria> mercadorias = new ArrayList<>();
    private boolean codigoCorreto;
    
	//Construtor
    public Estoque(int i) {
        id = i;
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
    public boolean isCodigoCorreto() {
		return codigoCorreto;
	}
	public void setCodigoCorreto(boolean codigoCorreto) {
		this.codigoCorreto = codigoCorreto;
	}
    
    //Métodos especiais
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
    public Mercadoria buscarItem(String codigoItem) {
        for(Mercadoria m : mercadorias){
            if(m.getCodigo().equals(codigoItem)){
                return m;
            }
        }
        return null;
    }

    public boolean isEstoqueVazio(int id) {
        return mercadorias.isEmpty();
    }
**/
}