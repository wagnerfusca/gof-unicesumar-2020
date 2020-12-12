package br.edu.unicesumar.factory;
public class PizzariaCuritiba  extends Pizzaria{

	@Override
	Pizza createPizza(String sabor) {
		if (sabor.equals("4Queijos")) {
			return new QuatroQueijos();
		} else if (sabor.equals("Calabresa")) {
			return new CalabresaCuritibana();
		}
		System.out.println("sabor indisponivel");
		return null;
	}



}
