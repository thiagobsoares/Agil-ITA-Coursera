package Curso1_Semana2A;

public class CalculadoraBonus {
	private Integer bonusDoDIa;

	public CalculadoraBonus() {
		bonusDoDIa = 1;
	}

	public CalculadoraBonus(Integer bonus) {
		bonusDoDIa = bonus;
	}

	public Integer bonusDoUsuario(Usuario usuario) {
		Integer bonus = bonusDoDIa;

		if (usuario.getClienteVip()) {
			bonus *= 5;
		}

		return bonus;
	}
}
