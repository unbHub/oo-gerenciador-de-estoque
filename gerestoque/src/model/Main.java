package model;

import java.util.Date;
import java.util.Scanner;

import view.TelaCadastro;
import view.TelaComBotoes;
import view.TelaFilial;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    static Filial f1;
    static Filial f2;
    static Empresa e1;
    static Estoque es1;
    static Estoque es2;
    static Casa cs1;
    static Bebida b1;
    static Alimento al1;

    public static void main(String[] args) throws ParseException {

       // new TelaCadastro().setVisible(true);
       //new TelaComBotoes().setVisible(true);
       //new TelaFilial().setVisible(true);
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        Date dataValidade = formatar.parse("01/06/2023");
        //Scanner scan = new Scanner(System.in);

        f1 = new Filial("Congonhas", 123456789, "rua dos bobos n0");
        f2 = new Filial("Jacarezinho", 12345678, "rua lacoste n3");

        e1 = new Empresa("Mercado Jacare");

        e1.addFilial(f1);
        e1.addFilial(f2);

        es1 = new Estoque(1234);
        es2 = new Estoque(4321);

       Alimento al1 = new Alimento("Sucrilhos", 5, 75, "0000", "esse sucrilhos é bão",
    		   dataValidade, "Zé da Manga", true, "200g");

        
       Casa cs1  = new Casa("Detergente", 15, 4.99, "00024", "Químico", dataValidade,
    		   "Jaspion Limpezas", true, "liquido");
        
        
        es1.adicionarItem(al1);
        es1.adicionarItem(cs1);
        
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
