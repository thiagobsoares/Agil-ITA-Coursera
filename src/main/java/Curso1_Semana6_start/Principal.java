package Curso1_Semana6_start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Curso1_Semana6_models.Embaralhador;
import Curso1_Semana6_models.EmbaralhadorDificil;
import Curso1_Semana6_models.EmbaralhadorFacil;
import Curso1_Semana6_models.EmbaralhadorMedio;
import Curso1_Semana6_models.JogoComVida;
import Curso1_Semana6_models.JogoLivre;
import Curso1_Semana6_models.MecanicaDoJogo;

public class Principal {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String entrada;

		System.out.println("Bem vindo ao Acertador de Palavras 3001\n\n\n");

		MecanicaDoJogo jogo = escolherModoDeJogo(bf);
		entrada = escolherNivel(bf);
		Embaralhador embaralhador = escolhendoNivel(Integer.parseInt(entrada));
		
		jogo.definirNivelEmbaralhador(embaralhador);
		jogo.lerPalavras("palavras.txt");
		jogo.jogar();

	}

	private static MecanicaDoJogo escolherModoDeJogo(BufferedReader bf) throws IOException {
		String entrada;
		System.out.println("Escolha qual modo deseja jogar\n1 - Jogo Livre (sem vidas)\n2 - Jogo com Vidas\n");
		entrada = bf.readLine().trim();
		Integer jogoEscolido = Integer.parseInt(entrada);
		MecanicaDoJogo jogo;
		
		if (jogoEscolido.equals(1)) {
			jogo = new JogoLivre();
		} else {
			jogo = new JogoComVida();
		}
		return jogo;
	}

	private static String escolherNivel(BufferedReader bf) throws IOException {
		String entrada;
		System.out.println("Escolha o nível\n\n");

		do {
			System.out.println("1 - Fácil\n2 - Médio\n3 - Díficil\n\n");
			entrada = bf.readLine().trim();

			if (!entrada.equals("1") && !entrada.equals("2") && !entrada.equals("3")) {
				System.out.println("\nEntrada inválida, tente novamente");
				continue;
			}
		} while (false);
		return entrada;
	}

	public static Embaralhador escolhendoNivel(Integer nivelEscolhido) {
		switch (nivelEscolhido) {
		case 1:
			return new EmbaralhadorFacil();
		case 2:
			return new EmbaralhadorMedio();
		case 3:
			return new EmbaralhadorDificil();
		default:
			return new EmbaralhadorFacil();
		}
	}

}
