package Curso1_Semana6_models;

public class Palavra {
	private String palavraCorreta;
	private String palavraEmbaralhada;

	public String getPalavraCorreta() {
		return palavraCorreta;
	}

	public void setPalavraCorreta(String palavraCorreta) {
		this.palavraCorreta = palavraCorreta;
	}

	public String getPalavraEmbaralhada() {
		return palavraEmbaralhada;
	}

	public void setPalavraEmbaralhada(String palavraEmbaralhada) {
		this.palavraEmbaralhada = palavraEmbaralhada;
	}
	
	public String embaralharPalavra(Embaralhador embaralhador){
		palavraEmbaralhada = embaralhador.embaralharPalavra(palavraCorreta);
		return palavraEmbaralhada;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Palavra other = (Palavra) obj;
		if (palavraCorreta == null) {
			if (other.palavraCorreta != null)
				return false;
		} else if (!palavraCorreta.equals(other.palavraCorreta))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return palavraCorreta;
	}
}
