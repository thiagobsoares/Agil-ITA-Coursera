package Curso1_Semana6_Teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Curso1_Semana6_IOFile.BancoDePalavra;
import Curso1_Semana6_models.Palavra;

public class BancoDePalavraTest {

	private static final String nomeDoArquivoTesteSucesso = "teste-sucesso.txt";
	private static final String nomeDoArquivoTesteFail = "teste-fail.txt";
	private static final String nomeDoArquivoOriginal = "palavras.txt";
	private BancoDePalavra bancoDePalavra;
	private List<Palavra> listaPalavras;

	@BeforeClass
	public static void deletarArquivosComeco() {
		BancoDePalavra banco = new BancoDePalavra();
		banco.deletarArquivoDeTeste(nomeDoArquivoTesteSucesso);

		banco = new BancoDePalavra();
		banco.deletarArquivoDeTeste(nomeDoArquivoTesteFail);
	}

	@AfterClass
	public static void deletarArquivosFinal() {
		BancoDePalavra banco = new BancoDePalavra();
		banco.deletarArquivoDeTeste(nomeDoArquivoTesteSucesso);

		banco = new BancoDePalavra();
		banco.deletarArquivoDeTeste(nomeDoArquivoTesteFail);
	}

	@Test
	public void testCriarArquivoSucesso() {
		listaPalavras = new ArrayList<>();

		Palavra palavra = new Palavra();
		palavra.setPalavraCorreta("Laranja");
		listaPalavras.add(palavra);

		palavra = new Palavra();
		palavra.setPalavraCorreta("Morango");
		listaPalavras.add(palavra);

		palavra = new Palavra();
		palavra.setPalavraCorreta("Pera");
		listaPalavras.add(palavra);

		bancoDePalavra = new BancoDePalavra();
		Boolean resultado = bancoDePalavra.escreverPalavras(nomeDoArquivoTesteSucesso, listaPalavras);

		assertEquals(new Boolean("true"), resultado);
	}

	@Test(expected = InvalidParameterException.class)
	public void testCriarArquivoFail() {
		List<Palavra> listaPalavras = new ArrayList<>();
		bancoDePalavra = new BancoDePalavra();
		bancoDePalavra.escreverPalavras(nomeDoArquivoTesteFail, listaPalavras);

	}

	@Test
	public void testLeituraArquivoSucesso() {
		bancoDePalavra = new BancoDePalavra();
		List<Palavra> listaPalavrasDoArquivo;

		try {
			listaPalavrasDoArquivo = bancoDePalavra.lerPalavras(nomeDoArquivoTesteSucesso);

			for (int i = 0; i < listaPalavrasDoArquivo.size(); i++) {
				assertEquals(listaPalavras.get(i), listaPalavrasDoArquivo.get(i));
			}

		} catch (FileNotFoundException e) {
			fail();
		}
	}

	@Test(expected = FileNotFoundException.class)
	public void testLeituraArquivoFail() throws FileNotFoundException {
		bancoDePalavra = new BancoDePalavra();
		bancoDePalavra.lerPalavras(nomeDoArquivoTesteFail);
		fail();
	}

	@Test
	public void testLeituraArquivoOriginalSucesso() {
		bancoDePalavra = new BancoDePalavra();
		List<Palavra> listaPalavrasDoArquivo;

		try {
			listaPalavrasDoArquivo = bancoDePalavra.lerPalavras(nomeDoArquivoOriginal);
			Palavra palavra1 = new Palavra();
			Palavra palavra2 = new Palavra();

			palavra1.setPalavraCorreta("Maça");
			palavra2.setPalavraCorreta("Perâ");

			assertEquals(palavra1, listaPalavrasDoArquivo.get(0));
			assertEquals(palavra2, listaPalavrasDoArquivo.get(1));

		} catch (FileNotFoundException e) {
			fail();
		}
	}
}
