package Curso1_Semana6B;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ProcessadorArquivo {
	public Map<String, String> processar(String nomeArquivo) throws LeituraArquivoException, IOException {
		Map<String, String> map = new HashMap<>();
		File file = new File(nomeArquivo);

		try (FileReader reader = new FileReader(file);) {
			BufferedReader bf = new BufferedReader(reader);

			if (!file.exists())
				throw new LeituraArquivoException("Arquivo vazio");

			String[] split = bf.readLine().split("->");
			if (split.length != 2)
				throw new LeituraArquivoException("Formato de arquivo inválido");
			map.put(split[0], split[1]);

			split = bf.readLine().split("->");
			if (split.length != 2)
				throw new LeituraArquivoException("Formato de arquivo inválido");
			map.put(split[0], split[1]);

			split = bf.readLine().split("->");
			if (split.length != 2)
				throw new LeituraArquivoException("Formato de arquivo inválido");
			map.put(split[0], split[1]);

		} catch (Exception ex) {
			throw new LeituraArquivoException("Erro ao abrir o arquivo: " + ex.getMessage());
		}
		return map;
	}
}
