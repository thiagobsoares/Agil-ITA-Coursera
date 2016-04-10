package Curso1_Semana4;

public class ProdutoComTamanho extends Produto {
	private Integer tamanho;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((tamanho == null) ? 0 : tamanho.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoComTamanho other = (ProdutoComTamanho) obj;

		if (tamanho != null && other.tamanho != null && super.getCodigo() != null && other.getCodigo() != null) {
			if (tamanho.equals(other.tamanho) && super.getCodigo().equals(other.getCodigo())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}
}
