package br.edu.unicesumar.factory;
public class PizzariaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  Pizzaria curitiba = new PizzariaCuritiba();

	  Pizzaria maringa = new PizzariaMaringa();

	  Pizza pizza = curitiba.pedidoPizza("Calabresa");
	  System.out.println("Fusca pediu pizza de curitiba ");

	  pizza = maringa.pedidoPizza("Calabresa");
	  System.out.println("\n\nfusca pediu pizza de maringa");

	  pizza = maringa.pedidoPizza("FrangoComCatupiry");

	}

}
