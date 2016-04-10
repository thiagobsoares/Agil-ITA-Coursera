package Curso1_Semana2D_TarefaPizza;

public class Principal {
	public static void main(String[] args) {
		Pizza pizza1 = new Pizza();
		pizza1.adicionaIngrediente("Queijo");
		pizza1.adicionaIngrediente("Frango");

		Pizza pizza2 = new Pizza();
		pizza2.adicionaIngrediente("Tomate");
		pizza2.adicionaIngrediente("Frango");
		pizza2.adicionaIngrediente("Bacon");
		

		Pizza pizza3 = new Pizza();
		pizza3.adicionaIngrediente("Queijo");
		pizza3.adicionaIngrediente("Queijo");
		pizza3.adicionaIngrediente("Frango");
		pizza3.adicionaIngrediente("Tomate Seco");
		pizza3.adicionaIngrediente("Tomate");
		pizza3.adicionaIngrediente("Bacon");
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarPizza(pizza1);
		carrinho.adicionarPizza(pizza2);
		carrinho.adicionarPizza(pizza3);
		
		System.out.println("Total de Pizza: " + carrinho.getTotalPizza() + "\n");
		System.out.println(Pizza.imprimirQtdCadaIngrediente());
	}
}
