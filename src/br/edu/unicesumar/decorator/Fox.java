package br.edu.unicesumar.decorator;

public class Fox implements Carro{

	@Override
	public double getCusto() {
		return 46000;
	}

	@Override
	public String getDescricao() {
		return "Fox ";
	}

	@Override
	public String getProdutos() {
		return "4 rodas, banco, flex, vidros verdes";
	}

}
