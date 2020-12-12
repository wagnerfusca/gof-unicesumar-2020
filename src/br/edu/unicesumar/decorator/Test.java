package br.edu.unicesumar.decorator;

public class Test {
	public static void main(String[] args) {
		Carro carro = new Fusca();
		System.out.println(carro.getDescricao() + " valor: " + carro.getCusto()
				+ " item de fabrica: " + carro.getProdutos());

		carro = new ArCondicionado(carro);

		System.out.println(carro.getDescricao() + " valor: " + carro.getCusto()
				+ " item de fabrica: " + carro.getProdutos());


		carro = new AirBag(carro);
		System.out.println(carro.getDescricao() + " valor: " + carro.getCusto()
				+ " item de fabrica: " + carro.getProdutos());

		Carro fox = new Fox();
		fox = new AirBag(fox);
		fox = new KitEsportivo(fox);
		fox = new ArCondicionado(fox);
		fox = new DirecaoHidraulica(fox);
		System.out.println(fox.getDescricao() + " valor: " + fox.getCusto()
				+ " item de fabrica: " + fox.getProdutos());


	}
}
