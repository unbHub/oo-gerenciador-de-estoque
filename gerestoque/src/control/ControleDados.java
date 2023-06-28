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
	public Filial inserirFiliais(String nome, String idFil) {
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
	public Alimento inserirAlimento(String nome, int quantidade, double valor, 
			String codigo, String dv, String fornecedor, boolean per,
			double massa, Filial filial) {
		Alimento novoAlimento = new Alimento(nome, quantidade, valor, 
	    		codigo, dv,fornecedor, per, massa);
		Filial.addMercadoria(novoAlimento);
		return novoAlimento;
		
	}
	public Bebida inserirBebida(String nome, int quantidade, double valor, 
    		String codigo, String dv, String fornecedor, boolean alcool, String volume) {
		Bebida novaBebida = new Bebida(nome, quantidade, valor, 
	    		codigo, dv, fornecedor, alcool, volume);
		Filial.addMercadoria(novaBebida);
		return novaBebida;
	}
	public Casa inserirPdCasa(String nome, int quantidade, double valor, String codigo, 
    		String dv, String fornecedor, boolean pdLimpeza,
    		String estadoFis) {
		Casa novoPdCasa = new Casa(nome, quantidade, valor, codigo, 
	    		dv, fornecedor, pdLimpeza, estadoFis);
		Filial.addMercadoria(novoPdCasa);
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
	//edição de mercadorias
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
