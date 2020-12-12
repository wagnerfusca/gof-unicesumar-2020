package br.edu.unicesumar.decorator;

public class AirBag extends CarroDecorator{

	public AirBag(Carro carro) {
		super(carro);
	}

	@Override
	public double getCusto() {
		return super.getCusto() + 2500;
	}

	@Override
	public String getProdutos() {
		return super.getProdutos() + ", air bag";
	}


}
