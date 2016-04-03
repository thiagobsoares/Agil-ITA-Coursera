package Curso1_Semana3B_TestePizza;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Pizza> listaPizza;

	public CarrinhoDeCompras() {
		listaPizza = new ArrayList<Pizza>();
	}

	public Boolean adicionarPizza(Pizza pizza) {
		Boolean adicionadoComSucesso = false;

		if (pizza.getQtdIngrediente() > 0) {
			listaPizza.add(pizza);
			adicionadoComSucesso = true;
		}

		return adicionadoComSucesso;
	}

	public Double getTotalCarrinho() {
		Double valorTotal = 0.0;

		for (Pizza pizza : listaPizza) {
			valorTotal += pizza.getPreco();
		}

		return valorTotal;
	}
}
