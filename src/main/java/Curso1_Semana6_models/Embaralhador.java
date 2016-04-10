package Curso1_Semana6_models;

import java.security.InvalidParameterException;

public interface Embaralhador {

	public String embaralharPalavra(String  palavra) throws InvalidParameterException;

	public Integer getPontos();
	
}
