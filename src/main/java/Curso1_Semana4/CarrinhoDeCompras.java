package Curso1_Semana4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CarrinhoDeCompras {
	private Map<Produto, Integer> mapItens;

	public CarrinhoDeCompras() {
		mapItens = new HashMap<>();
	}

	public Map<Produto, Integer> getMapItens() {
		return mapItens;
	}

	public void setMapItens(Map<Produto, Integer> mapItens) {
		this.mapItens = mapItens;
	}

	public void adicionaProduto(Produto produto, Integer quantidade) {
		if (mapItens.containsKey(produto)) {
			mapItens.put(produto, mapItens.get(produto) + quantidade);
		} else {
			mapItens.put(produto, quantidade);
		}
	}
	
	public void removeProduto(Produto produto, Integer quantidade){
		mapItens.remove(produto);
	}
	
	public Double calcularTotalDoCarrinho(){
		Set<Entry<Produto,Integer>> entrySet = mapItens.entrySet();
		Double valorTotal = 0.0;
		
		for (Entry<Produto, Integer> entry : entrySet) {
			valorTotal += entry.getKey().getPreco() * entry.getValue();
		}
	
		return valorTotal;	
	}

}
