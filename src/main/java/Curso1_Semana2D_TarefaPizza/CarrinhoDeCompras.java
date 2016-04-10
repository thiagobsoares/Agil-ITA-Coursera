package Curso1_Semana2D_TarefaPizza;

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

	public Integer getTotalPizza() {
		return listaPizza.size();
	}
}
