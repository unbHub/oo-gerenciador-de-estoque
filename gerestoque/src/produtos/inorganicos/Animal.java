package produtos.inorganicos;

import java.util.Date;

public class Animal extends Inorganica {
    public Animal(String nome, int quantidade, double valor, String codigoMercadoria, String descricao,
			Date dataValidade, String fornecedor) {
		super(nome, quantidade, valor, codigoMercadoria, descricao, dataValidade, fornecedor);
	}

}
