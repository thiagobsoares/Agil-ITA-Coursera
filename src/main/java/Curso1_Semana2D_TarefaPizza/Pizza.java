package Curso1_Semana2D_TarefaPizza;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Pizza {

	private Integer qtdIngrediente;
	private static Map<String, Integer> ingredienteTotal = new HashMap<>();
	
	public Pizza(){
		qtdIngrediente = 0;
	}
	
	
	public static void contabilizaIngrediente(String ingrediente){
		if(ingredienteTotal.containsKey(ingrediente)){
			ingredienteTotal.put(ingrediente, ingredienteTotal.get(ingrediente) + 1);
		}else{
			ingredienteTotal.put(ingrediente, 1);
		}
	}
	
	public void adicionaIngrediente(String ingrediente) {
		qtdIngrediente++;
		contabilizaIngrediente(ingrediente);
	}

	public Double getPreco() {
		Double preco = 0.0;
		
		if(qtdIngrediente <= 2){
			preco = 15.0;
		}else if(qtdIngrediente <= 5){
			preco = 20.0;
		}else if(qtdIngrediente > 5){
			preco = 23.0;
		}
		
		return preco;
	}
	
	public Integer getQtdIngrediente(){
		return qtdIngrediente;
	}


	public static String imprimirQtdCadaIngrediente() {
		String retorno = "";
		Set<Entry<String,Integer>> entrySet = ingredienteTotal.entrySet();
		
		for (Entry<String, Integer> entry : entrySet) {
			retorno += entry.getKey() + ":  " + entry.getValue() + "\n";
		
		}
		return retorno;
	}
}
