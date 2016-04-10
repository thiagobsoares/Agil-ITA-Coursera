package Curso1_Semana4_Teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Curso1_Semana4.CarrinhoDeCompras;
import Curso1_Semana4.ProdutoComTamanho;

public class CarrinhoDeComprasTest {

	@Test
	public void testEquals() {

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		ProdutoComTamanho p1 = new ProdutoComTamanho();
		p1.setCodigo(123);
		p1.setNome("Tênnis");
		p1.setPreco(10.0);
		p1.setTamanho(43);
		carrinho.adicionaProduto(p1, 10);

		assertEquals(new Double(100), carrinho.calcularTotalDoCarrinho());

		ProdutoComTamanho p2 = new ProdutoComTamanho();
		p2.setCodigo(123);
		p2.setNome("Tênnis");
		p2.setPreco(30.0);
		p2.setTamanho(42);
		carrinho.adicionaProduto(p2, 5);

		assertEquals(new Double(250), carrinho.calcularTotalDoCarrinho());

		ProdutoComTamanho p3 = new ProdutoComTamanho();
		p3.setCodigo(null);
		p3.setNome("Tênnis");
		p3.setPreco(10.0);
		p3.setTamanho(40);
		carrinho.adicionaProduto(p3, 3);

		assertEquals(new Double(280), carrinho.calcularTotalDoCarrinho());

		ProdutoComTamanho p4 = new ProdutoComTamanho();
		p4.setCodigo(123);
		p4.setNome("Sapato");
		p4.setPreco(10.0);
		p4.setTamanho(43);
		carrinho.adicionaProduto(p4, 4);

		assertEquals(new Double(320), carrinho.calcularTotalDoCarrinho());

		ProdutoComTamanho p5 = new ProdutoComTamanho();
		p5.setCodigo(12);
		p5.setNome("Sapato");
		p5.setPreco(5.0);
		p5.setTamanho(43);
		carrinho.adicionaProduto(p5, 10);

		assertEquals(new Double(370), carrinho.calcularTotalDoCarrinho());

		// Adicionando produto repetido, com id e tamanho igual;
		ProdutoComTamanho p6 = new ProdutoComTamanho();
		p6.setCodigo(123);
		p6.setTamanho(43);
		carrinho.adicionaProduto(p6, 100);

		assertEquals(new Double(1370), carrinho.calcularTotalDoCarrinho());
	}
}
