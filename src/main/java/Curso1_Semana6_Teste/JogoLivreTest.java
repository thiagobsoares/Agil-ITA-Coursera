package Curso1_Semana6_Teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import Curso1_Semana6_models.Embaralhador;
import Curso1_Semana6_models.EmbaralhadorFacil;
import Curso1_Semana6_models.JogoLivre;
import Curso1_Semana6_models.MecanicaDoJogo;
import Curso1_Semana6_models.Palavra;

public class JogoLivreTest {
	private static final String nomeDoArquivoOriginal = "palavras.txt";
	private List<Palavra> listaPalavras;

	@Test
	public void testLerPalavras() {
		MecanicaDoJogo mecaninca = new JogoLivre();

		listaPalavras = mecaninca.lerPalavras(nomeDoArquivoOriginal);
		Palavra palavra1 = new Palavra();
		Palavra palavra2 = new Palavra();

		palavra1.setPalavraCorreta("Maça");
		palavra2.setPalavraCorreta("Perâ");

		assertEquals(palavra1, listaPalavras.get(0));
		assertEquals(palavra2, listaPalavras.get(1));

	}
	
	@Test
	public void testPontuacao() {
		MecanicaDoJogo mecaninca = new JogoLivre();


		assertEquals(new Integer(0), mecaninca.getPontuacao());
		assertEquals(new Integer(2), mecaninca.aumentarPonto(2));
		assertEquals(new Integer(7), mecaninca.aumentarPonto(5));
		assertEquals(new Integer(1), mecaninca.diminuirPonto(6));
		assertEquals(new Integer(1), mecaninca.getPontuacao());

	}
	
	@Test
	public void testDefinirNivelEmbaralhador() {
		MecanicaDoJogo mecanica = new JogoLivre();
		Embaralhador embaralhador = new EmbaralhadorFacil();
		mecanica.definirNivelEmbaralhador(embaralhador);
		assertEquals(embaralhador, mecanica.getEmbaralhador());
	}
	
	@Test
	public void testPalavraCorreta(){
		MecanicaDoJogo mecanica = new JogoLivre();
		mecanica.definirNivelEmbaralhador(new EmbaralhadorFacil());
		
		Palavra palavra = new Palavra();
		String entrada = "THIAGO";

		palavra.setPalavraCorreta("THIAGO");
		assertTrue(mecanica.confirmarResposta(palavra, entrada));
		
		palavra.setPalavraCorreta("ABACATE");
		assertFalse(mecanica.confirmarResposta(palavra, entrada));
	}

}
