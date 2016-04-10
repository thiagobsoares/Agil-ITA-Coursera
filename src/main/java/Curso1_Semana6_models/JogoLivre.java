package Curso1_Semana6_models;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import Curso1_Semana6_IOFile.BancoDePalavra;

public class JogoLivre implements MecanicaDoJogo {
	private Embaralhador embaralhador;
	private Integer pontuacao;
	private List<Palavra> listaPalavras;
	private BancoDePalavra bancoDePalavra;

	public JogoLivre() {
		pontuacao = new Integer(0);
		bancoDePalavra = new BancoDePalavra();
		listaPalavras = new ArrayList<>();
	}

	@Override
	public void jogar() throws IOException {
		if (listaPalavras == null || listaPalavras.isEmpty())
			throw new NullPointerException("Lista de palavras não inicializada");
		if (embaralhador == null)
			throw new NullPointerException("Nível não inicializada");

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String entrada;
		embaralharPalavras();

		System.out.println("Iniciando jogo...\n");

		for (Palavra palavra : listaPalavras) {
			System.out.println("Que palavra que é: " + palavra.getPalavraEmbaralhada());
			entrada = bf.readLine().trim().toLowerCase();
			if (confirmarResposta(palavra, entrada)) {
				System.out.println("Parabensss!! Voce acertou!");
			} else {
				System.out.println("Que pena :(\nVocê errou, resposta correta: " + palavra.getPalavraCorreta());
			}
		}

		System.out.println("\n\n\nObrigado por ter jogado\nFim de jogo, sua pontuação foi " + pontuacao);

	}

	public Boolean confirmarResposta(Palavra palavra, String entrada){
		if (entrada.equalsIgnoreCase(palavra.getPalavraCorreta())) {
			aumentarPonto(embaralhador.getPontos());
			return true;
		} else {
			diminuirPonto(embaralhador.getPontos());
			return false;
		}
	}

	@Override
	public List<Palavra> lerPalavras(String nomeArquivo) {
		List<Palavra> lerPalavras = null;

		try {
			lerPalavras = bancoDePalavra.lerPalavras(nomeArquivo);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for (Palavra palavra : lerPalavras) {
			Palavra palavra2 = new Palavra();
			palavra2.setPalavraCorreta(palavra.getPalavraCorreta());
			palavra2.setPalavraEmbaralhada(palavra.getPalavraEmbaralhada());
			listaPalavras.add(palavra2);
		}
		return lerPalavras;
	}

	@Override
	public Boolean definirNivelEmbaralhador(Embaralhador embaralhador) {
		this.embaralhador = embaralhador;
		return true;
	}

	@Override
	public Boolean embaralharPalavras() {
		for (Palavra palavra : listaPalavras) {
			palavra.embaralharPalavra(embaralhador);
		}

		return true;
	}

	@Override
	public Integer getPontuacao() {
		return pontuacao;
	}

	@Override
	public Integer aumentarPonto(Integer quantidade) {
		return this.pontuacao += quantidade;
	}

	@Override
	public Integer diminuirPonto(Integer quantidade) {
		return this.pontuacao -= quantidade;
	}

	public Embaralhador getEmbaralhador() {
		return embaralhador;
	}

	@Override
	public Integer getVida() {
		// TODO Auto-generated method stub
		return null;
	}

}
