package Curso1_Semana6_models;

import java.security.InvalidParameterException;

public class EmbaralhadorMedio implements Embaralhador {

	@Override
	public String embaralharPalavra(String palavra) throws InvalidParameterException {
		if (palavra.length() == 0 || palavra.isEmpty())
			throw new InvalidParameterException();

		StringBuilder sb = new StringBuilder();

		Integer tamanho = palavra.length();

		for (int i = tamanho - 1; i >= 0; i--) {
			sb.append(palavra.charAt(i));
		}

		for (int i = 1; i < tamanho; i++) {
			if (i % 2 == 1) {
				Character character = sb.charAt(i);
				Character character1 = sb.charAt(i - 1);

				sb.replace(i - 1, i, character.toString());
				sb.replace(i, i + 1, character1.toString());
			}
		}

		return sb.toString();
	}

	@Override
	public Integer getPontos() {
		return 2;
	}

}
