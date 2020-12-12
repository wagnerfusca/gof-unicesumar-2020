package br.edu.unicesumar.decorator;
public abstract class CarroDecorator implements Carro{

	private final Carro carroDecorado;

	public CarroDecorator(Carro carro){
		this.carroDecorado = carro;
		
	}

	@Override
	public double getCusto() {
		return carroDecorado.getCusto();
	}

	@Override
	public String getDescricao() {
		return carroDecorado.getDescricao();
	}

	@Override
	public String getProdutos() {
		return carroDecorado.getProdutos();
	}
	
	
}
