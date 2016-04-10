package Curso1_Semana6_Teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Curso1_Semana6_models.EmbaralhadorDificil;
import Curso1_Semana6_models.EmbaralhadorFacil;
import Curso1_Semana6_models.EmbaralhadorMedio;

public class EmbaralhadorTest {

	@Test
	public void testEmbaralhadorFacil() {
		EmbaralhadorFacil embaralhador = new EmbaralhadorFacil();
		String palavra = "THIAGO";
		String embaralhada = embaralhador.embaralharPalavra(palavra);
		String esperada = "OGAIHT";
		
		assertEquals(esperada,embaralhada);
		
		
		palavra = "ABACATE-VERDE";
		embaralhada = embaralhador.embaralharPalavra(palavra);
		esperada = "EDREV-ETACABA";
		
		assertEquals(esperada,embaralhada);
	}
	
	@Test
	public void testEmbaralhadorMedio() {
		EmbaralhadorMedio embaralhador = new EmbaralhadorMedio();
		String palavra = "THIAGO";
		String embaralhada = embaralhador.embaralharPalavra(palavra);
		String esperada = "GOIATH";
		
		assertEquals(esperada,embaralhada);
		
		palavra = "ABACATE-VERDE";
		embaralhada = embaralhador.embaralharPalavra(palavra);
		esperada = "DEER-VTECABAA";
		
		assertEquals(esperada,embaralhada);
		
	}
	
	@Test
	public void testEmbaralhadorDificil() {
		EmbaralhadorDificil embaralhador = new EmbaralhadorDificil();
		String palavra = "THIAGO";
		String embaralhada = embaralhador.embaralharPalavra(palavra);
		String esperada = "_OIAT_";
		
		assertEquals(esperada,embaralhada);
		
		palavra = "ABACATE-VERDE";
		embaralhada = embaralhador.embaralharPalavra(palavra);
		esperada = "__ER-VTECAB__";
		
		assertEquals(esperada,embaralhada);
		
	}

}
