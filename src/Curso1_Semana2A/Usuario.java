package Curso1_Semana2A;

public class Usuario {
	
	private String nome;
	private Integer pontos;
	private Boolean clienteVip;

	public Usuario(){
		this.nome = "";
		this.pontos = new Integer(0);
		this.clienteVip = false;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	public Boolean getClienteVip() {
		return clienteVip;
	}

	public void setClienteVip(Boolean clienteVip) {
		this.clienteVip = clienteVip;
	}
}
