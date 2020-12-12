package br.edu.unicesumar.builder;

public class PizzaCalabresa extends PizzaBuilder {
	public void buildMassa() {
		pizza.setMassa("massa de p�o");
		System.out.println("massa de pao");
	}

	public void buildMolho() {
		pizza.setMolho("picante");
		System.out.println("picante");
	}

	public void buildCobertura() {
		pizza.setCobertura("pepperoni + salames");
		System.out.println("pepperoni + salames");
	}

	@Override
	public void buildAssar() {
		System.out.println("colocar no forno por 10 min.");

	}
}
