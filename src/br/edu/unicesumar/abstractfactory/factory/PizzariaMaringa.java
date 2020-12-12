package br.edu.unicesumar.abstractfactory.factory;

import br.edu.unicesumar.abstractfactory.PizzariaMaringaIngredientes;

public class PizzariaMaringa extends Pizzaria {

	@Override
	Pizza createPizza(String sabor) {
		if (sabor.equals("Calabresa")) {
			return new Calabresa();
		} else if (sabor.equals("Rucula")) {
			return new Rucula();
		} else if (sabor.equals("Quatro queijos")) {
			return new QuatroQueijos(new PizzariaMaringaIngredientes());
		}
		return null;
	}

}
