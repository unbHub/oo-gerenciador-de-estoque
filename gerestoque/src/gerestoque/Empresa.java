package gerestoque;

import java.util.ArrayList;

public class Empresa {

    private String nome;
    private ArrayList<Filial> filiais;
    private Filial filial;
   
    //Construtor
    public Empresa(String n) {

        filiais = new ArrayList<Filial>();
        nome = n;

    }
    
    //Metodos autogerados
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }
    
    //Metodos
    public void addFilial(Filial filial /*mudar*/) {
        filiais.add(filial);
    }
    public void remFilial(Filial filial /*mudar*/) {
        filiais.add(filial);
    }
    //Método com For Each que percorre as filiais da empresa usando o parâmetro do código da filial
    public void buscarFilial(int id) {
        for(Filial f : filiais) {
            if (f.getId() == id) {
            	
                
            }
        }
    }
}