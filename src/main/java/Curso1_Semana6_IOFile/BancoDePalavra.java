package Curso1_Semana6_IOFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import Curso1_Semana6_models.Palavra;

public class BancoDePalavra {

	public List<Palavra> lerPalavras(String nomeArquivo) throws FileNotFoundException {
		File file = new File(nomeArquivo);

		if (!file.exists())
			throw new FileNotFoundException();

		List<Palavra> listaPalavras = null;

		try (FileReader fileReader = new FileReader(file);) {
			BufferedReader bf = new BufferedReader(fileReader);
			listaPalavras = new ArrayList<>();
			String linhaEntrada = null;

			while ((linhaEntrada = bf.readLine()) != null) {
				Palavra palavra = new Palavra();
				palavra.setPalavraCorreta(linhaEntrada);
				listaPalavras.add(palavra);
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return listaPalavras;
	}

	public Boolean escreverPalavras(String nomeArquivo, List<Palavra> listaPalavras) {
		File file = new File(nomeArquivo);

		if (listaPalavras.isEmpty())
			throw new InvalidParameterException();

		Boolean retorno = false;

		try (FileWriter fileWriter = new FileWriter(file);) {
			BufferedWriter bf = new BufferedWriter(fileWriter);

			for (Palavra palavra : listaPalavras) {
				bf.write(palavra.getPalavraCorreta() + "\n");
			}

			retorno = true;
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return retorno;
	}

	public Boolean deletarArquivoDeTeste(String nomeArquivo) {
		File file = new File(nomeArquivo);
		return file.delete();
	}
}
