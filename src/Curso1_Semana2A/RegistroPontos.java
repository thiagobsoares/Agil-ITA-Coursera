package Curso1_Semana2A;

public class RegistroPontos {
	private CalculadoraBonus calculadoraBonus;

	public RegistroPontos(CalculadoraBonus calculadoraBonus ) {
		this.calculadoraBonus = calculadoraBonus ;
	}

	public void fazerUmComentario(Usuario usuario) {
		Integer pontos = usuario.getPontos();
		pontos += 3 * calculadoraBonus.bonusDoUsuario(usuario);
		usuario.setPontos(pontos);
	}

	public void criarUmTopico(Usuario usuario) {
		Integer pontos = usuario.getPontos();
		pontos += 5 * calculadoraBonus.bonusDoUsuario(usuario);
		usuario.setPontos(pontos);
	}

	public void darUmLike(Usuario usuario) {
		Integer pontos = usuario.getPontos();
		pontos += 1 * calculadoraBonus.bonusDoUsuario(usuario);
		usuario.setPontos(pontos);
	}
}
