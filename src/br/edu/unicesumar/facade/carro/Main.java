package br.edu.unicesumar.facade.carro;

public class Main {

	public static void main(String[] args) {
		ChaveFacade rodarChaveFacade = new ChaveFacade(new Luzes(), new Motor(), new Radiador(), new Radio());

		rodarChaveFacade.partidaCarro();

	}

}
