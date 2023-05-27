package produtos.organicos;

import java.util.Date;

public class Bebidas extends Organica {
    public boolean alcool;

    public Bebidas(String nome, int quantidade, double valor, String codigoMercadoria, String descricao,
			Date dataValidade, String fornecedor) {
		super(nome, quantidade, valor, codigoMercadoria, descricao, dataValidade, fornecedor);
	}

    
    //definimos aqui a forma de armazenamento da bebida
    @Override
    public void setFormaArmazenamento(String formaArmazenamento) {
        super.setFormaArmazenamento(formaArmazenamento);
    }

    //getters e setters
    public boolean isAlcool() {
        return alcool;
    }

    public void setAlcool(boolean alcool) {
        this.alcool = alcool;
    }
}
