package control;
import model.*;
import model.Filial;
import java.util.Date;
import model.Empresa;
import java.util.List;
import java.util.ArrayList;

public class ControleDados {
	
	//Instância previa de empresa
	private static Empresa mercado = new Empresa("Mercado orientado");
	
	private String tipoMercadoria;
	private String escolha;
	
	public ControleDados() {
		Dados.fillWithSomeData();
	}
	
	public String getTipoMercadoria() {
		return tipoMercadoria;
	}
	
	public void setTipoMercadoria(String tipoMercadoria) {
		this.tipoMercadoria = tipoMercadoria;
	}
	public static Empresa getMercado() {
		return mercado;
	}
	
	//Metodo de inserção de filiais
	public static Filial inserirFiliais(String nome, String idFil) {
		Filial cadastro = new Filial(nome, idFil);
		mercado.addFilial(cadastro);
		return cadastro;
	}
	//remoção de filiais
	public void removerFilial(String idFilial) {
		mercado.remFilial(mercado.buscarFilial(idFilial));
		
	}
	//buscar filiais
	public void buscarFiliais(String idFilial) {
		mercado.buscarFilial(idFilial);
	}
	//edição de filiais
	public void editarFiliais(String nome, String idFilial, Filial filial) {
		filial.setNome(nome);
		filial.setId(idFilial);
	}
	public static Alimento inserirAlimento(Filial filial, String nome, String quantidade, String valor, String codigo, 
    		String dv, String fornecedor, String massa, String perecivel) {
		Alimento novoAlimento = new Alimento(nome, quantidade, valor, 
				codigo, dv, fornecedor, massa, perecivel);
		filial.addMercadoria(novoAlimento);
		return novoAlimento;
		
	}
	public static Bebida inserirBebida(Filial filial, String nome, String quantidade, String valor, 
    		String codigo, String dv, String fornecedor, String alcool, String volume) {
		Bebida novaBebida = new Bebida(nome, quantidade, valor, 
	    		codigo, dv, fornecedor, alcool, volume);	
		filial.addMercadoria(novaBebida);
		return novaBebida;
	}
	public static Casa inserirPdCasa(Filial filial, String nome, String quantidade, String valor, String codigo, 
    		String dv, String fornecedor, String pdLimpeza, String estadoFis) {
		Casa novoPdCasa = new Casa(nome, quantidade, valor, codigo, 
	    		dv, fornecedor, pdLimpeza, estadoFis);
		filial.addMercadoria(novoPdCasa);
		return novoPdCasa;
	}
	
	//remoção de mercadorias
	public void removerMercadorias(String codigoM, Filial filial) {
		filial.remMercadoria(filial.buscarMercadoria(codigoM));
	
	}
	//busca mercadorias
	public void buscarMercadorias(String codM, Filial filial) {
		filial.buscarMercadoria(codM);
	}

	
}
