package Curso1_Semana2B;

public class Somador {

	String nome;
	Integer valorInstancia = 0;
	static Integer valorEstatico = 0;
	
	void somar(){
		valorEstatico++;
		valorInstancia++;
	}
	
	void imprimir(){
		System.out.println("Instancia " + valorInstancia + "\nEstatico " + valorEstatico);
	}
	
}
