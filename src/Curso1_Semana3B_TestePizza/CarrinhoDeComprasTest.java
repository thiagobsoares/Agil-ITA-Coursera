package Curso1_Semana3B_TestePizza;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarrinhoDeComprasTest {

	@Test
	public void testeAdicionarPizzaSemIngrediente() {
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		Pizza pizza4 = new Pizza();
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		pizza1.adicionaIngrediente("Frango");
		pizza2.adicionaIngrediente("Bacon");
		pizza3.adicionaIngrediente("Mussarela");

		assertEquals(new Boolean(true), carrinho.adicionarPizza(pizza1));
		assertEquals(new Boolean(true), carrinho.adicionarPizza(pizza2));
		assertEquals(new Boolean(true), carrinho.adicionarPizza(pizza3));
		assertEquals(new Boolean(false), carrinho.adicionarPizza(pizza4));
	}


	@Test
	public void testeGetPrecoTotal() {
		//Primeiro teste
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		Pizza pizza4 = new Pizza();
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		pizza1.adicionaIngrediente("Frango");
		carrinho.adicionarPizza(pizza1);
		assertEquals(new Double(15), carrinho.getTotalCarrinho());
		

		//Segundo teste
		pizza1 = new Pizza();
		pizza2 = new Pizza();
		pizza3 = new Pizza();
		pizza4 = new Pizza();
		carrinho = new CarrinhoDeCompras();
		
		pizza1.adicionaIngrediente("Frango");
		pizza2.adicionaIngrediente("Frango");
		pizza3.adicionaIngrediente("Frango");
		carrinho.adicionarPizza(pizza1);
		carrinho.adicionarPizza(pizza2);
		carrinho.adicionarPizza(pizza3);
		carrinho.adicionarPizza(pizza4);
		assertEquals(new Double(45), carrinho.getTotalCarrinho());
		

		//Terceiro teste
		pizza1 = new Pizza();
		pizza2 = new Pizza();
		pizza3 = new Pizza();
		pizza4 = new Pizza();
		carrinho = new CarrinhoDeCompras();
		
		pizza1.adicionaIngrediente("Frango");
		pizza1.adicionaIngrediente("Frango");
		pizza1.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Bacon");
		pizza2.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Frango");
		pizza3.adicionaIngrediente("Frango");
		carrinho.adicionarPizza(pizza1);
		carrinho.adicionarPizza(pizza2);
		carrinho.adicionarPizza(pizza3);
		carrinho.adicionarPizza(pizza4);
		assertEquals(new Double(55), carrinho.getTotalCarrinho());
		
		//Quarto teste
		pizza1 = new Pizza();
		pizza2 = new Pizza();
		pizza3 = new Pizza();
		pizza4 = new Pizza();
		carrinho = new CarrinhoDeCompras();
		
		pizza1.adicionaIngrediente("Frango");
		pizza1.adicionaIngrediente("Frango");
		pizza1.adicionaIngrediente("Mussarela");
		pizza1.adicionaIngrediente("Frango");
		pizza1.adicionaIngrediente("Frango");
		pizza1.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Bacon");
		pizza2.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Bacon");
		pizza2.adicionaIngrediente("Frango");
		pizza3.adicionaIngrediente("Frango");
		pizza3.adicionaIngrediente("Chedder");
		pizza3.adicionaIngrediente("Tomate");
		pizza3.adicionaIngrediente("Bacon");
		pizza3.adicionaIngrediente("Mussarela");
		carrinho.adicionarPizza(pizza1);
		carrinho.adicionarPizza(pizza2);
		carrinho.adicionarPizza(pizza3);
		carrinho.adicionarPizza(pizza4);
		assertEquals(new Double(63), carrinho.getTotalCarrinho());
		
		//Quinto teste
		pizza1 = new Pizza();
		pizza2 = new Pizza();
		pizza3 = new Pizza();
		pizza4 = new Pizza();
		carrinho = new CarrinhoDeCompras();
		
		pizza1.adicionaIngrediente("Frango");
		pizza1.adicionaIngrediente("Frango");
		pizza1.adicionaIngrediente("Mussarela");
		pizza1.adicionaIngrediente("Frango");
		pizza1.adicionaIngrediente("Frango");
		pizza1.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Bacon");
		pizza2.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Bacon");
		pizza2.adicionaIngrediente("Frango");
		pizza3.adicionaIngrediente("Frango");
		pizza3.adicionaIngrediente("Chedder");
		pizza3.adicionaIngrediente("Tomate");
		pizza3.adicionaIngrediente("Bacon");
		pizza3.adicionaIngrediente("Mussarela");
		pizza3.adicionaIngrediente("Frango");
		pizza3.adicionaIngrediente("Chedder");
		pizza3.adicionaIngrediente("Tomate");
		pizza3.adicionaIngrediente("Bacon");
		pizza3.adicionaIngrediente("Mussarela");
		pizza4.adicionaIngrediente("Bacon");
		carrinho.adicionarPizza(pizza1);
		carrinho.adicionarPizza(pizza2);
		carrinho.adicionarPizza(pizza3);
		carrinho.adicionarPizza(pizza4);
		assertEquals(new Double(81), carrinho.getTotalCarrinho());

	}

}
