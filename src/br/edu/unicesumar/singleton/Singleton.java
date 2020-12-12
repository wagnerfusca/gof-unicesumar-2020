package br.edu.unicesumar.singleton;

public class Singleton {

	private static Singleton instancia;

	private Singleton() {
		System.out.println("achou o singleton");
	}

	public static Singleton getInstancia() {
		if (instancia == null) {
			instancia = new Singleton();
		}
		return instancia;
	}
}
