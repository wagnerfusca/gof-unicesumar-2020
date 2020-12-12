package br.edu.unicesumar.facade;

public class Client {

	public static void main(String[] args) {
		Facade facade = new Facade(new Luzes(), new Televisao(), new Netflix());
		facade.iniciarUmSeriado();
	}
}
