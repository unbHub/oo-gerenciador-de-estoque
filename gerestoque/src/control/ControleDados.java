package control;
import model.*;
import model.Filial;
import java.util.Date;
import model.Empresa;
import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author Diego Carlito
 * @author Filipe Carvalho
 * @author Marcos Castilhos
 *Classe control ControleDeDados, para melhor controlar inserção de dados 
 */
public class ControleDados {
	
	/**
	 * Empresa previamente instanciada
	 */
	private static Empresa mercado = new Empresa("Mercado orientado");

	/**
	 * Construtor controle de dados. Implementa o metodo fillWithSomeData
	 * para criação de dados aleatorios no app
	 */
	public ControleDados() {
		Dados.fillWithSomeData();
	}
	public static Empresa getMercado() {
		return mercado;
	}
	
	/**
	 * 
	 * @param nome
	 * @param idFil
	 * @return retorna nova filial cadastrada
	 */
	public static Filial inserirFiliais(String nome, String idFil) {
		Filial cadastro = new Filial(nome, idFil);
		mercado.addFilial(cadastro);
		return cadastro;
	}
	/**
	 * 
	 * @param filial
	 * @param nome
	 * @param quantidade
	 * @param valor
	 * @param codigo
	 * @param dv
	 * @param fornecedor
	 * @param massa
	 * @param perecivel
	 * @return retorna novo alimento cadastrado
	 */
	public static Alimento inserirAlimento(Filial filial, String nome, String quantidade, String valor, String codigo, 
    		String dv, String fornecedor, String massa, String perecivel) {
		Alimento novoAlimento = new Alimento(nome, quantidade, valor, 
				codigo, dv, fornecedor, massa, perecivel);
		filial.addMercadoria(novoAlimento);
		return novoAlimento;
		
	}
	/**
	 * 
	 * @param filial
	 * @param nome
	 * @param quantidade
	 * @param valor
	 * @param codigo
	 * @param dv
	 * @param fornecedor
	 * @param alcool
	 * @param volume
	 * @return retorna nova bebida cadastrada
	 */
	public static Bebida inserirBebida(Filial filial, String nome, String quantidade, String valor, 
    		String codigo, String dv, String fornecedor, String alcool, String volume) {
		Bebida novaBebida = new Bebida(nome, quantidade, valor, 
	    		codigo, dv, fornecedor, alcool, volume);	
		filial.addMercadoria(novaBebida);
		return novaBebida;
	}
	/**
	 * 
	 * @param filial
	 * @param nome
	 * @param quantidade
	 * @param valor
	 * @param codigo
	 * @param dv
	 * @param fornecedor
	 * @param pdLimpeza
	 * @param estadoFis
	 * @return retorna novo produto para casa cadastrado
	 */
	public static Casa inserirPdCasa(Filial filial, String nome, String quantidade, String valor, String codigo, 
    		String dv, String fornecedor, String pdLimpeza, String estadoFis) {
		Casa novoPdCasa = new Casa(nome, quantidade, valor, codigo, 
	    		dv, fornecedor, pdLimpeza, estadoFis);
		filial.addMercadoria(novoPdCasa);
		return novoPdCasa;
	}
	
}
