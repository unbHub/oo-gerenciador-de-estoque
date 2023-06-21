package control;
import model.*;
import java.util.Date;
import model.Filial;
import model.Empresa;
//import java.util.ArrayList;

public class ControleDados {
	
	//Instância previa de empresa
	private static Empresa mercado =  new Empresa("Mercado orientado");
	
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
	public static Empresa getMercado() {
		return mercado;
	}
	//Metodo de inserção de filiais
	public Filial inserirFiliais(String nome, String idFil) {
		Filial cadastro = new Filial(nome, idFil);
		mercado.addFilial(cadastro);
		return null;
	}
	//remoção de filiais
	public void removerFilial(String idFilial, Empresa empresa) {
		empresa.remFilial(empresa.buscarFilial(idFilial));
		
	}
	//buscar filiais
	public void buscarFiliais(String idFilial, Empresa empresa) {
		empresa.buscarFilial(idFilial);
	}
	//edição de filiais
	public void editarFiliais(String nome, String idFilial, Filial filial) {
		filial.setNome(nome);
		filial.setId(idFilial);
	}
	//inserção de mercadorias
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
