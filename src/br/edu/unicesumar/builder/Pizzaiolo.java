package br.edu.unicesumar.builder;
public class Pizzaiolo {
	private PizzaBuilder pizzaBuilder;

	public void setPizzaBuilder(PizzaBuilder pb) {
		pizzaBuilder = pb;
	}

	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}

	public void fazerPizza() {
		pizzaBuilder.fazerPizza();
	}
}
