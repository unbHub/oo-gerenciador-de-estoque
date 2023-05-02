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
        qtdMercadorias += 1;
    }
    public void removerItem(Mercadoria mercadoria) {
        mercadorias.remove(mercadoria);
        qtdMercadorias -= 1;
    }
    public void attQtItem(Mercadoria mercadoria) {
        mercadoria.setQuantidade(scan.nextInt());
        scan.close();
    }
    public void buscarItem(String codigoItem) {
        for(Mercadoria m : mercadorias) {
            if (m.getCodigo() == codigoItem) {
                System.out.println("-----------------------------------------------------------------------------------------------");
                System.out.println(m.toString());
            }
        }
    }
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



}