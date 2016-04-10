package Curso1_Semana4_Teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Curso1_Semana4.ProdutoComTamanho;

public class ProdutoComTamanhoTest {

	@Test
	public void testEquals() {
		ProdutoComTamanho p1 = new ProdutoComTamanho();
		p1.setCodigo(123);
		p1.setNome("Tênnis");
		p1.setPreco(10.0);
		p1.setTamanho(43);
		
		ProdutoComTamanho p2 = new ProdutoComTamanho();
		p2.setCodigo(123);
		p2.setNome("Tênnis");
		p2.setPreco(10.0);
		p2.setTamanho(42);

		ProdutoComTamanho p3 = new ProdutoComTamanho();
		p3.setCodigo(null);
		p3.setNome("Tênnis");
		p3.setPreco(10.0);
		p3.setTamanho(40);

		ProdutoComTamanho p4 = new ProdutoComTamanho();
		p4.setCodigo(123);
		p4.setNome("Sapato");
		p4.setPreco(5.0);
		p4.setTamanho(43);
		
		ProdutoComTamanho p5 = new ProdutoComTamanho();
		p5.setCodigo(12);
		p5.setNome("Sapato");
		p5.setPreco(5.0);
		p5.setTamanho(43);

		
		assertEquals(false, p1.equals(p2));
		assertEquals(false, p2.equals(p1));

		assertEquals(false, p3.equals(p1));
		assertEquals(false, p2.equals(p3));
		
		assertEquals(true, p4.equals(p1));
		assertEquals(false, p4.equals(p2));
		assertEquals(false, p4.equals(p3));
		
		assertEquals(false, p5.equals(p1));
	}
}
