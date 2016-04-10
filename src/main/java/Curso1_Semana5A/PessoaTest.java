package Curso1_Semana5A;

import static org.junit.Assert.*;

import org.junit.Test;

public class PessoaTest {

	@Test
	public void test() {
		Pessoa pessoa = new Pessoa(17, 7, 1991);
		assertEquals(new Integer(25), pessoa.getIdade());
		assertEquals("Câncer", pessoa.getSigno());

		Pessoa pessoa2 = new Pessoa(1, 1, 2000);
		assertEquals(new Integer(16), pessoa2.getIdade());
		assertEquals("Capricórnio", pessoa2.getSigno());
		
		Pessoa pessoa3 = new Pessoa(1, 10, 1995);
		assertEquals(new Integer(21), pessoa3.getIdade());
		assertEquals("Libra", pessoa3.getSigno());
	}

}
