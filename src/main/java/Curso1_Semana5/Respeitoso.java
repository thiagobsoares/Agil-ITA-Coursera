package Curso1_Semana5;

public class Respeitoso implements FormatadorNome {

	private String sexo;

	public Respeitoso(String sexo){
		this.sexo = sexo;
	}

	public String formatarNome(String nome, String sobrenome) {
		String retorno = "Sra. " + sobrenome;

		if (sexo.equalsIgnoreCase("masculino"))
			retorno = "Sr. " + sobrenome;

		return retorno;
	}

}
