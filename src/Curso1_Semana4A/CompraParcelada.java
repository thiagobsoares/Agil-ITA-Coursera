package Curso1_Semana4A;

public class CompraParcelada extends Compra{

	private Integer qtdParcela;
	private Double juros;

	public CompraParcelada(Double valorDaCompra, Integer qtdParcela, Double juros) {
		super(valorDaCompra);
		this.qtdParcela = qtdParcela;
		this.juros = juros;
	}
	
	public Double total(){
		return super.total() * Math.pow((1 + juros), qtdParcela);
	}

}
