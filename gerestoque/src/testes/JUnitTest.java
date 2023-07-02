package testes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import control.ControleDados;
import model.Alimento;
import model.Casa;
import model.Filial;

public class JUnitTest {

	@Test
	public void testeInserirFiliais() {
		assertTrue(ControleDados.inserirFiliais("Filial jacare", "1873"));
	}

	private void assertTrue(Filial inserirFiliais) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void testeInserirAlimento() {
		Filial filial0 = new Filial("Jupiter", "1234");
		assertTrue(ControleDados.inserirAlimento(filial0, "aaa", 
				"12", "12", "123", "12/08/2009", "aaa", "200g", "s"));
	}

	private void assertTrue(Alimento inserirAlimento) {
		// TODO Auto-generated method stub
		
	}
	@Test
	public void testeInserirPdCasa() {
		Filial filial1 = new Filial("rj", "222");
		assertTrue(ControleDados.inserirPdCasa(filial1, "aaa", "12", "12", 
				"1234", "12/03/2005", "aaaa", "400ml", "n"));
	}

	private void assertTrue(Casa inserirPdCasa) {
		// TODO Auto-generated method stub
		
	}
}
