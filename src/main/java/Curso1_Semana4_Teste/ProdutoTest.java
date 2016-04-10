package Curso1_Semana4_Teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Curso1_Semana4.Produto;
import Curso1_Semana4.ProdutoComTamanho;

public class ProdutoTest {

	@Test
	public void testEquals() {
		Produto p1 = new Produto();
		p1.setCodigo(123);
		p1.setNome("Tênnis");
		p1.setPreco(10.0);

		Produto p2 = new Produto();
		p2.setCodigo(123);
		p2.setNome("Tênnis");
		p2.setPreco(10.0);

		Produto p3 = new Produto();
		p3.setCodigo(null);
		p3.setNome("Tênnis");
		p3.setPreco(10.0);

		Produto p4 = new Produto();
		p4.setCodigo(123);
		p4.setNome("Sapato");
		p4.setPreco(5.0);
		
		ProdutoComTamanho p5 = new ProdutoComTamanho();
		p5.setCodigo(123);
		p5.setNome("Sapato");
		p5.setPreco(5.0);
		p5.setTamanho(10);

		
		assertEquals(true, p1.equals(p2));
		assertEquals(true, p2.equals(p1));

		assertEquals(false, p3.equals(p1));
		assertEquals(false, p2.equals(p3));
		
		assertEquals(true, p4.equals(p1));
		assertEquals(true, p4.equals(p2));
		assertEquals(false, p4.equals(p3));
		
		assertEquals(false, p5.equals(p1));
	}

}
