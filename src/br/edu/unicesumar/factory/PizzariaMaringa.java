package br.edu.unicesumar.factory;
public class PizzariaMaringa extends Pizzaria{

	@Override
	Pizza createPizza(String sabor) {
		if (sabor.equals("Calabresa")) {
			return new Calabresa();
		}else if (sabor.equals("Rucula")){
			return new Rucula();
		} else if (sabor.equals("Quatro queijos")){
			return new QuatroQueijosMaringa();
		}else if (sabor.equals("FrangoComCatupiry")){
			return new FrangoComCatupiry();
		}

		return null;
	}



}
