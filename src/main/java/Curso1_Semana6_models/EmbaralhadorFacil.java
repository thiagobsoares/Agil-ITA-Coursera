package Curso1_Semana6_models;

import java.security.InvalidParameterException;

public class EmbaralhadorFacil implements Embaralhador {

	@Override
	public String embaralharPalavra(String palavra) throws InvalidParameterException{
		if(palavra.length() == 0 || palavra.isEmpty())
			throw new InvalidParameterException();
		
		StringBuilder sb = new StringBuilder();

		Integer tamanho = palavra.length();

		for (int i = tamanho - 1; i >= 0; i--) {
			sb.append(palavra.charAt(i));
		}

		return sb.toString();
	}

	@Override
	public Integer getPontos() {
		return 1;
	}

}
