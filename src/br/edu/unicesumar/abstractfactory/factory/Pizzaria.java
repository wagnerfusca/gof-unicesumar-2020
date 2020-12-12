package br.edu.unicesumar.abstractfactory.factory;
public abstract class Pizzaria {
	public Pizza pedidoPizza(String sabor) {
		Pizza pizza;
		pizza = createPizza(sabor);
		
		//pizza.preparar();
		pizza.assar();
		pizza.cortar();
		pizza.embalar();
		return pizza;
	}
	abstract Pizza createPizza(String sabor);
}
