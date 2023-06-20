package control;
import model.*;
import java.util.Date;
import model.Filial;
import model.Empresa;
//import java.util.ArrayList;

public class ControleDados {
	
	private Dados d = new Dados();
	private String tipoMercadoria;
	private String escolha;

	public Dados getDados() {
		return d;
	}

	public void setDados(Dados d) {
		this.d = d;
	}
	public String getTipoMercadoria() {
		return tipoMercadoria;
	}

	public void setTipoMercadoria(String tipoMercadoria) {
		this.tipoMercadoria = tipoMercadoria;
	}
	
	public void inserirFiliais(String nome, int idFil, Empresa empresa) {
		Filial cadastro = new Filial(nome, idFil);
		empresa.addFilial(cadastro);
	}
	public void removerFilial(int idFilial, Empresa empresa) {
		empresa.remFilial(empresa.buscarFilial(idFilial));
		
	}
	public void buscarFiliais(int idFilial, Empresa empresa) {
		empresa.buscarFilial(idFilial);
	}
	public void editarFiliais(String nome, int idFilial, Filial filial) {
		filial.setNome(nome);
		filial.setId(idFilial);
	}
	public void inserirMercadorias(String nome, int quantidade, double valor, 
			String codigo, Date dv, String fornecedor, boolean perecivel, boolean alcool, 
			double massa, String volume, boolean pdLimpeza, String estadoFis, 
			Filial filial) {
		switch(tipoMercadoria) {
			case "Alimento":
				Alimento novoAlimento = new Alimento(nome, quantidade, valor, 
			    		codigo,dv,fornecedor, perecivel, massa);
				filial.addMercadoria(novoAlimento);
				break;
			case "Bebida":
				Bebida novaBebida = new Bebida(nome, quantidade, valor, 
			    		codigo, dv, fornecedor, alcool, volume);
				filial.addMercadoria(novaBebida);
				break;
			case "Casa":
				Casa novoProdCasa = new Casa(nome, quantidade, valor, codigo, 
			    		dv, fornecedor, pdLimpeza, estadoFis);
				filial.addMercadoria(novoProdCasa);
				break;
		}
	}
	public void removerMercadorias(String codigoM, Filial filial) {
		filial.remMercadoria(filial.buscarMercadoria(codigoM));
	
	}
	public void buscarMercadorias(String codM, Filial filial) {
		filial.buscarMercadoria(codM);
	}
	public void editarMercadorias(Mercadoria mercadoria, Filial filial) {
		switch(escolha) {
			case "nome":
				mercadoria.setNome("");
				break;
			case "quantidade":
				mercadoria.setQuantidade(0);
				break;
			case "valor":
				mercadoria.setValor(0);
				break;
			case "codigo":
				mercadoria.setCodigo("");
				break;
		}
	}
	
}
