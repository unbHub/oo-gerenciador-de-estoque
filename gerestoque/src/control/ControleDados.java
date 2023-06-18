package control;
import model.*;
import model.Filial;
import model.Empresa;
import java.util.ArrayList;

public class ControleDados {
	
	private Dados d = new Dados();

	public Dados getDados() {
		return d;
	}

	public void setDados(Dados d) {
		this.d = d;
	}
	
	public Filial[] getFiliais() {
		return this.d.getFiliais();
	}
	public int getQtdFiliais() {
		return this.d.getQtdFilais();
	}
	
	public Estoque[] getEstoques() {
		return this.d.getEstoques();
	}

	public int getQtdEstoques() {
		return this.d.getQtdEstoques();
	}
	public void inserirEmpresa(String nome) {
		Empresa novaEmpresa = new Empresa(nome);
		novaEmpresa.setNome(nome);
	}
	public void inserirFiliais(String nome, int id, Empresa empresa) {
		Filial cadastro = new Filial(nome, id);
		empresa.addFilial(cadastro);
		cadastro.setNome(nome);
		cadastro.setId(id);
	}
	public void editarFiliais(String nome, Filial filial) {
		 filial.setNome(nome);
	}
	
}
