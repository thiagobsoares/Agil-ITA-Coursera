package Curso1_Semana2A;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteRegistroPontos {

	@Test
	public void testePontosCriarTopico() {
		Usuario usuario = new Usuario();
		usuario.setNome("Thiago Soares");
		CalculadoraBonus calculadoraBonus = new CalculadoraBonus();
		RegistroPontos registroPontos = new RegistroPontos(calculadoraBonus);
		registroPontos.criarUmTopico(usuario);

		assertEquals(new Integer(5), usuario.getPontos());
	}

	@Test
	public void testePontosCriarTopicoVip() {
		Usuario usuario = new Usuario();
		usuario.setNome("Thiago Soares");
		usuario.setClienteVip(true);
		CalculadoraBonus calculadoraBonus = new CalculadoraBonus();
		RegistroPontos registroPontos = new RegistroPontos(calculadoraBonus);
		registroPontos.criarUmTopico(usuario);

		assertEquals(new Integer(25), usuario.getPontos());
	}
	
	@Test
	public void testePontosCriarTopicoBonusDoDia() {
		Usuario usuario = new Usuario();
		usuario.setNome("Thiago Soares");
		CalculadoraBonus calculadoraBonus = new CalculadoraBonus(new Integer(3));
		RegistroPontos registroPontos = new RegistroPontos(calculadoraBonus);
		registroPontos.criarUmTopico(usuario);

		assertEquals(new Integer(15), usuario.getPontos());
	}
	
	@Test
	public void testePontosCriarTopicoVipBonusDoDia() {
		Usuario usuario = new Usuario();
		usuario.setNome("Thiago Soares");
		usuario.setClienteVip(true);
		CalculadoraBonus calculadoraBonus = new CalculadoraBonus(new Integer(3));
		RegistroPontos registroPontos = new RegistroPontos(calculadoraBonus);
		registroPontos.criarUmTopico(usuario);

		assertEquals(new Integer(75), usuario.getPontos());
	}
}
