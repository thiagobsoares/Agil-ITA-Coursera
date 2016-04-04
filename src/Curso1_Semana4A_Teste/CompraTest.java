package Curso1_Semana4A_Teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Curso1_Semana4A.Compra;

public class CompraTest {

	@Test
	public void testeInicializacao() {
		Compra compra = new Compra(1000.0);
		assertEquals(new Double(1000.0), compra.total());
	}

}
