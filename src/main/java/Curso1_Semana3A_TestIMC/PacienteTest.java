package Curso1_Semana3A_TestIMC;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PacienteTest {

	@Test
	public void testCalcularIMC() {
		Paciente paciente = new Paciente(100, 2);
		assertEquals(25, paciente.calcularIMC(), 0.001);
	}

	@Test
	public void testDiagnostico() {
		Paciente paciente;
		paciente = new Paciente(47, 1.75);
		assertEquals("Baixo peso muito grave", paciente.diagnostico());
		paciente = new Paciente(60, 1.9);
		assertEquals("Baixo peso grave", paciente.diagnostico());
		paciente = new Paciente(55, 1.76);
		assertEquals("Baixo peso", paciente.diagnostico());
		paciente = new Paciente(80, 1.79);
		assertEquals("Peso normal", paciente.diagnostico());
		paciente = new Paciente(85, 1.8);
		assertEquals("Sobrepeso", paciente.diagnostico());
		paciente = new Paciente(90, 1.71);
		assertEquals("Obesidade grau I", paciente.diagnostico());
		paciente = new Paciente(120, 1.74);
		assertEquals("Obesidade grau II", paciente.diagnostico());
		paciente = new Paciente(180, 1.98);
		assertEquals("Obesidade grau III (obesidade m�rbida)",
				paciente.diagnostico());

	}
}
