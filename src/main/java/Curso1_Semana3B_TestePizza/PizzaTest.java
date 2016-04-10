package Curso1_Semana3B_TestePizza;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PizzaTest {

	@Before
	public void zerarRegistros(){
		Pizza.zerarIngredienteTotal();
	}
	
	@Test
	public void testeValorPizza() {
		Pizza pizza = new Pizza();
		
		assertEquals(new Double(0.0), pizza.getPreco());

		pizza = new Pizza();
		pizza.adicionaIngrediente("Frango");
		assertEquals(new Double(15.0), pizza.getPreco());

		pizza = new Pizza();
		pizza.adicionaIngrediente("Mussarela");
		pizza.adicionaIngrediente("Frango");
		assertEquals(new Double(15.0), pizza.getPreco());

		pizza = new Pizza();
		pizza.adicionaIngrediente("Bacon");
		pizza.adicionaIngrediente("Mussarela");
		pizza.adicionaIngrediente("Frango");
		assertEquals(new Double(20.0), pizza.getPreco());

		pizza = new Pizza();
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Bacon");
		pizza.adicionaIngrediente("Mussarela");
		pizza.adicionaIngrediente("Frango");
		assertEquals(new Double(20.0), pizza.getPreco());

		pizza = new Pizza();
		pizza.adicionaIngrediente("Chedder");
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Bacon");
		pizza.adicionaIngrediente("Mussarela");
		pizza.adicionaIngrediente("Frango");
		assertEquals(new Double(20.0), pizza.getPreco());

		pizza = new Pizza();
		pizza.adicionaIngrediente("Ingrediente Secreto");
		pizza.adicionaIngrediente("Chedder");
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Bacon");
		pizza.adicionaIngrediente("Mussarela");
		pizza.adicionaIngrediente("Frango");
		assertEquals(new Double(23.0), pizza.getPreco());
	}
	
	@Test
	public void testeRegistroIngrediente() {
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();

		pizza1.adicionaIngrediente("Frango");
		pizza1.adicionaIngrediente("Frango");
		pizza2.adicionaIngrediente("Frango");
		pizza3.adicionaIngrediente("Frango");
		pizza1.adicionaIngrediente("Frango");
		pizza1.adicionaIngrediente("Frango");
		pizza1.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Bacon");
		pizza2.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Tomate");
		pizza2.adicionaIngrediente("Bacon");
		pizza2.adicionaIngrediente("Mussarela");
		pizza3.adicionaIngrediente("Chedder");
		pizza3.adicionaIngrediente("Tomate");
		pizza3.adicionaIngrediente("Bacon");
		pizza3.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Ingrediente Secreto");
		pizza3.adicionaIngrediente("Chedder");
		pizza1.adicionaIngrediente("Tomate");
		pizza2.adicionaIngrediente("Bacon");
		pizza3.adicionaIngrediente("Mussarela");

		assertEquals(new Integer(0),Pizza.recuperarTotalIngredienteEspecifico("Pernil"));
		assertEquals(new Integer(6),Pizza.recuperarTotalIngredienteEspecifico("Frango"));
		assertEquals(new Integer(5),Pizza.recuperarTotalIngredienteEspecifico("Mussarela"));
		assertEquals(new Integer(3),Pizza.recuperarTotalIngredienteEspecifico("Tomate"));
		assertEquals(new Integer(4),Pizza.recuperarTotalIngredienteEspecifico("Bacon"));
		assertEquals(new Integer(2),Pizza.recuperarTotalIngredienteEspecifico("Chedder"));
		assertEquals(new Integer(1),Pizza.recuperarTotalIngredienteEspecifico("Ingrediente Secreto"));
		
	}


}
