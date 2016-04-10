package Curso1_Semana1;

public class Principal {
	public static void main(String[] args) {
		Paciente p1 = new Paciente(100, 1.80);
		Paciente p2 = new Paciente(150, 1.70);
		Paciente p3 = new Paciente(60, 1.90);

		System.out.println("IMC: " + p1.calcularIMC() + " - MSG: " + p1.diagnostico());
		System.out.println("IMC: " + p2.calcularIMC() + " - MSG: " + p2.diagnostico());
		System.out.println("IMC: " + p3.calcularIMC() + " - MSG: " + p3.diagnostico());
	}
}
