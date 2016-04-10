package Curso1_Semana5;

public class Autoridade {
	private String nome;
	private String sobrenome;

	public Autoridade(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getTratamento(FormatadorNome formatador){
		return formatador.formatarNome(nome, sobrenome);
	}
	
}
