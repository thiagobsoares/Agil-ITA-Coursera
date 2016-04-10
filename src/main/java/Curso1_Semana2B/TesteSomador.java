package Curso1_Semana2B;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteSomador {

	@Test
	public void testeSomador() {
		Somador somador1 = new Somador();
		somador1.somar();

		assertEquals(new Integer(1), somador1.valorInstancia);
		assertEquals(new Integer(1), Somador.valorEstatico);
		
		Somador somador2 = new Somador();
		somador2.somar();

		assertEquals(new Integer(1), somador2.valorInstancia);
		assertEquals(new Integer(2), Somador.valorEstatico);
		
		somador2.somar();

		assertEquals(new Integer(2), somador2.valorInstancia);
		assertEquals(new Integer(3), Somador.valorEstatico);
	}

}
