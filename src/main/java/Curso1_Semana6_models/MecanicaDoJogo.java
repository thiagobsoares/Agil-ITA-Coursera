package Curso1_Semana6_models;

import java.io.IOException;
import java.util.List;

public interface MecanicaDoJogo {

	public void jogar() throws IOException;

	public Boolean definirNivelEmbaralhador(Embaralhador embaralhador);
	
	public Boolean embaralharPalavras();
	
	public Integer getPontuacao();
	
	public Integer aumentarPonto(Integer quantidade);
	
	public Integer diminuirPonto(Integer quantidade);
	
	public List<Palavra> lerPalavras(String nomeArquivo);

	public Embaralhador getEmbaralhador();

	public Boolean confirmarResposta(Palavra palavra, String entrada); 
	
	public Integer getVida(); 
}
