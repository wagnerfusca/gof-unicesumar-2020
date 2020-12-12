package br.edu.unicesumar.builder;

public class PizzaBacon extends PizzaBuilder{

	@Override
	public void buildMassa() {
		pizza.setMassa("massa fininha");

	}

	@Override
	public void buildMolho() {
		pizza.setMolho("catupiry + maionese + tomate + o que tiver");
	}

	@Override
	public void buildCobertura() {
		pizza.setCobertura("Mussarela + baconX4 + batata palha");
	}

	@Override
	public void buildAssar() {
		for(int x =0; x < 10 ; x++){
			System.out.println("assando!");
		}
		System.out.println("pronto!");

	}

}
