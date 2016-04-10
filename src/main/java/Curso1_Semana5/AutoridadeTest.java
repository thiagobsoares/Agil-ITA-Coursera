package Curso1_Semana5;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AutoridadeTest {

	private static Autoridade autoridade;
	
	@BeforeClass
	public static void inicializarObj(){
		autoridade = new Autoridade("Thiago", "Soares");
	}
	
	@Test
	public void testInformal() {
		FormatadorNome formatador = new Informal();
		assertEquals("Thiago", autoridade.getTratamento(formatador));
	}
	
	@Test
	public void testRespeitoso() {
		FormatadorNome formatador = new Respeitoso("masculino");
		assertEquals("Sr. Soares", autoridade.getTratamento(formatador));
	}
	
	@Test
	public void testComTitulo() {
		FormatadorNome formatador = new ComTitulo("Mister");
		assertEquals("Mister Thiago Soares", autoridade.getTratamento(formatador));
	}

}
