package br.edu.unicesumar.decorator;

public class ArCondicionado extends CarroDecorator{

	
	public ArCondicionado(Carro carro) {
		super(carro);
		
	}

	@Override
	public double getCusto() {
		return super.getCusto() + 1000;
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() ;
	}

	@Override
	public String getProdutos() {
		return super.getProdutos() + ", Ar condicionado";
	}

	
}
