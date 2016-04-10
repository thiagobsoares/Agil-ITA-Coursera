package Curso1_Semana1;

public class Paciente {

	private double peso;
	private double altura;
	
	public Paciente(double kg, double altura){
		this.peso = kg;
		this.altura = altura;
	}
	
	public double calcularIMC(){
		return peso / (altura * altura);
	}
	
	public String diagnostico(){
		double imc = calcularIMC();

		if(imc < 16)
			return "Baixo peso muito grave";
		if(imc <= 16.99)
			return "Baixo peso grave";
		if(imc <= 18.49)
			return "Baixo peso";
		if(imc <= 24.99)
			return "Peso normal";
		if(imc <= 29.99)
			return "Sobrepeso";
		if(imc <= 34.99)
			return "Obesidade grau I";
		if(imc <= 39.99)
			return "Obesidade grau II";

		return "Obesidade grau III (obesidade m�rbida)";
	}
}











