package br.edu.unicesumar.builder;

public class BuilderTest {
	public static void main(String[] args) {
		Pizzaiolo pizzaiolo = new Pizzaiolo();

		pizzaiolo.setPizzaBuilder(new PizzaCalabresa());
		pizzaiolo.fazerPizza();

		Pizza pizza = pizzaiolo.getPizza();

		System.out.println(pizza.toString());

		pizzaiolo.setPizzaBuilder(new PizzaBacon());
		pizzaiolo.fazerPizza();
	}
}
