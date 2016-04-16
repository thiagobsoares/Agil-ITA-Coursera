package Curso1_Semana6B;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProcessadorArquivoTest {
	private ProcessadorArquivo arquivo;

	@Before
	public void inicializarClazz() {
		File file = new File("arquivo.txt");
		file.delete();
		arquivo = new ProcessadorArquivo();
	}

	@After
	public void finalizarClazz() {
		File file = new File("arquivo.txt");
		file.delete();
		arquivo = null;
	}

	@Test(expected = LeituraArquivoException.class)
	public void testProcessarArquivoInexistente() throws LeituraArquivoException, IOException {
		arquivo.processar("teste");
		fail();
	}

	@Test(expected = LeituraArquivoException.class)
	public void testProcessarLinhaErrada() throws LeituraArquivoException, IOException {
		List<String> lista = new ArrayList<>();
		String nomeArquivo = "arquivo.txt";

		lista.add("nome->Thiago");
		lista.add("sobrenome->Soares");
		lista.add("idade->24->a");

		escreverPalavras(nomeArquivo, lista);
		arquivo.processar(nomeArquivo);
		fail();
	}

	@Test(expected = LeituraArquivoException.class)
	public void testProcessarArquivoVazio() throws LeituraArquivoException, IOException {
		List<String> lista = new ArrayList<>();
		String nomeArquivo = "arquivo.txt";

		escreverPalavras(nomeArquivo, lista);
		arquivo.processar(nomeArquivo);
		fail();
	}

	@Test(expected = LeituraArquivoException.class)
	public void testProcessarMaisQue4Linhas() throws LeituraArquivoException, IOException {
		List<String> lista = new ArrayList<>();
		String nomeArquivo = "arquivo.txt";

		lista.add("nome->Thiago");
		lista.add("sobrenome->Soares");
		lista.add("idade->24");
		lista.add("idade->24");

		escreverPalavras(nomeArquivo, lista);
		arquivo.processar(nomeArquivo);
		fail();
	}

	@Test
	public void testProcessarCorreto() throws LeituraArquivoException, IOException {
		List<String> lista = new ArrayList<>();
		String nomeArquivo = "arquivo.txt";

		lista.add("nome->Thiago");
		lista.add("sobrenome->Soares");
		lista.add("idade->24");

		escreverPalavras(nomeArquivo, lista);
		Map<String, String> processar = arquivo.processar(nomeArquivo);

		assertEquals("Thiago", processar.get("nome"));
		assertEquals("Soares", processar.get("sobrenome"));
		assertEquals("24", processar.get("idade"));

	}

	private Boolean escreverPalavras(String nomeArquivo, List<String> lista) {
		File file = new File(nomeArquivo);

		Boolean retorno = false;

		try (FileWriter fileWriter = new FileWriter(file);) {
			BufferedWriter bf = new BufferedWriter(fileWriter);

			for (String string : lista) {
				bf.write(string + "\n");
			}

			retorno = true;
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return retorno;
	}

}
