package gerestoque;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    static Filial f1;
    static Filial f2;
    static Empresa e1;
    static Estoque es1;
    static Estoque es2;
    static Organica o1;
    static Organica o2;
    static Inorganica i1;

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        Date dataValidade = formatar.parse("01/06/2023");
        Scanner scan = new Scanner(System.in);

        f1 = new Filial("Congonhas", 123456789, "rua dos bobos n0");
        f2 = new Filial("Jacarezinho", 12345678, "rua lacoste n3");

        e1 = new Empresa("Mercado Jacare");

        e1.addFilial(f1);
        e1.addFilial(f2);

        es1 = new Estoque(1234);
        es2 = new Estoque(4321);

        o1 = new Organica();
        o1.setNome("Maca\n");
        o1.setQuantidade(20);
        o1.setValor(5.99);
        o1.setDescricao("Fruta\n");
        o1.setCodigo("000223");
        o1.setDataValidade(dataValidade);
        o1.setFornecedor("Paulinho frutas\n");
        o1.setFormaArmazenamento("Lugar seco e arejado");
        
        i1 = new Inorganica();
        i1.setNome("Detergente\n");
        i1.setQuantidade(15);
        i1.setValor(4.99);
        i1.setDescricao("Quimico\n");
        i1.setCodigo("000224");
        i1.setFornecedor("Limpeza Brasileira\n");
        i1.setFormaUso("Limpeza");

        
        es1.adicionarItem(o1);
        es1.adicionarItem(i1);
        
        f1.setEstoque(es1); 
        f2.setEstoque(es2);

        //e1.buscarFilial(12345678);
        //f1.listarEstoque();
        //es2.isEstoqueVazio(4321);
        //es1.isEstoqueVazio(1234);
        //System.out.println(o1.toString());
        //System.out.println(i1.toString());
        
        if (es1.isEstoqueVazio(1234) == true) {
        	System.out.println("Estoque VAZIO!!!!!!!!!!!!!!!!!!!!!!!!!!!1\n");
        } else {
        	System.out.println("Ja tem bagui nesse estroque\n");
        }
        //es1.attQtItem("000223", 10);
        
        /*es1.buscarItem("000223");
        System.out.println(o1.getQuantidade());
        */
        if (f1.listarEstoque(1234) == true) {
        	System.out.println(es1.getMercadorias());
        	
        }
        
    }

}
