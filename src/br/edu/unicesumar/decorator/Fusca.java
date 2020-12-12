package br.edu.unicesumar.decorator;

public class Fusca implements Carro{

	@Override
	public double getCusto() {
		return 2000;
	}

	@Override
	public String getDescricao() {
		return "Fusca";
	}

	@Override
	public String getProdutos() {
		return "Quatro pneus, bancos, motor 1500";
	}


}
