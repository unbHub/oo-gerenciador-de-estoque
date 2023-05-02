package gerestoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	
	private String nome;
	private ArrayList<Filial> filiais;
	private Filial filial;
	
	Scanner search = new Scanner(System.in);
	public Empresa(String n) {
		
		nome = n;
	
	}
	
	public void addFilial(Filial filial) {
		filiais.add(filial);
	}
	public void remFilial(Filial filial) {
		filiais.add(filial);
	}
//	public void busFilial() {
//		
//	
//	}
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
}
