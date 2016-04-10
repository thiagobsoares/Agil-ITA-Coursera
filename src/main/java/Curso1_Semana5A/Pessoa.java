package Curso1_Semana5A;

import java.time.LocalDate;

public class Pessoa {
	private LocalDate dataDeNascimento;

	public Pessoa(Integer dia, Integer mes, Integer ano) {
		dataDeNascimento = LocalDate.of(ano, mes, dia);
	}

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public Integer getIdade() {
		return Math.abs(dataDeNascimento.minusYears(LocalDate.now().getYear()).getYear());
	}

	public String getSigno() {
		Integer mes = dataDeNascimento.getMonth().getValue();
		Integer dia = dataDeNascimento.getDayOfMonth();

		String retorno = "";

		if (dia >= 21 && mes == 3 || dia <= 20 && mes == 4) {
			retorno = "�ries";
		} else if (dia >= 21 && mes == 4 || dia <= 20 && mes == 5) {
			retorno = "Touro";
		} else if (dia >= 21 && mes == 5 || dia <= 20 && mes == 6) {
			retorno = "G�meos";
		} else if (dia >= 21 && mes == 6 || dia <= 21 && mes == 7) {
			retorno = "C�ncer";
		} else if (dia >= 22 && mes == 7 || dia <= 22 && mes == 8) {
			retorno = "Le�o";
		} else if (dia >= 23 && mes == 8 || dia <= 22 && mes == 9) {
			retorno = "Virgem";
		} else if (dia >= 23 && mes == 9 || dia <= 22 && mes == 10) {
			retorno = "Libra";
		} else if (dia >= 23 && mes == 10 || dia <= 21 && mes == 11) {
			retorno = "Escorpi�o";
		} else if (dia >= 22 && mes == 11 || dia <= 21 && mes == 12) {
			retorno = "Sagit�rio";
		} else if (dia >= 22 && mes == 12 || dia <= 20 && mes == 1) {
			retorno = "Capric�rnio";
		} else if (dia >= 21 && mes == 1 || dia <= 19 && mes == 2) {
			retorno = "Aqu�rio";
		} else if (dia >= 20 && mes == 2 || dia <= 20 && mes == 3) {
			retorno = "Peixes";
		}

		return retorno;
	}
}
