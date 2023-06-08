package produtos.organicos;

import java.util.Date;

public class Alimento extends Mercadoria {
    public Alimento(String nome, int quantidade, double valor, String codigoMercadoria, String descricao,
	Date dataValidade, String fornecedor){
        super(nome, quantidade, valor, codigoMercadoria, descricao, dataValidade, fornecedor);
   }
}
