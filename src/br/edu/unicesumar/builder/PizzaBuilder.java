
package br.edu.unicesumar.builder;

public abstract class PizzaBuilder {
	protected Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}

	public void novaPizza() {
		pizza = new Pizza();
	}

	public void fazerPizza() {
		novaPizza();
		buildMassa();
		buildMolho();
		buildCobertura();
		buildAssar();
	}

	public abstract void buildMassa();

	public abstract void buildMolho();

	public abstract void buildCobertura();

	public abstract void buildAssar();

}
