package Curso1_Semana4A_Teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Curso1_Semana4A.CompraParcelada;

public class CompraParceladaTest {

	@Test
	public void testeTotalParcelado() {
		CompraParcelada compra = new CompraParcelada(1000.0, 10, 0.5);
		assertEquals(new Double(57665.0390), compra.total(), 0.009);
		

		compra = new CompraParcelada(1000.0, 1, 0.5);
		assertEquals(new Double(1500.0), compra.total(), 0.009);
	} 	

}
