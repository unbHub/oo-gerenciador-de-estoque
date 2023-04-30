package gerestoque;

import java.util.Scanner;

public class Empresa {
	
	private String nome;
	private Filial filial;
	
	Scanner search = new Scanner(System.in);
	public Empresa(String n) {
		
		nome = n;
	
	}
	
	public void addFilial() {
		Filial f = this.getFilial();
		f.setNome("");
		f.setEndereco("");
		f.setId(0);
	}
	public void remFilial() {
		
	}
//	public void attFilial() {
//		
//	}
//	public void busFilial() {
//		
//		Filial f = this.getFilial();
//		search.nextLine();
//		f.getNome();
//		f.getId();
//		search.close();
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
