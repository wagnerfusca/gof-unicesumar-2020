package br.edu.unicesumar.decorator;

public class DirecaoHidraulica extends CarroDecorator{

	public DirecaoHidraulica(Carro carro) {
		super(carro);
	}

	@Override
	public double getCusto() {
		return super.getCusto() + 2200;
	}

	@Override
	public String getProdutos() {
		return super.getProdutos() + ", DH";
	}


}
