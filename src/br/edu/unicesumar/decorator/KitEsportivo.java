package br.edu.unicesumar.decorator;

public class KitEsportivo extends CarroDecorator {

	public KitEsportivo(Carro carro) {
		super(carro);
	}

	@Override
	public double getCusto() {
		return super.getCusto() + 10000;
	}

	@Override
	public String getProdutos() {
		return super.getProdutos() + ", kit esportivo";
	}

}
