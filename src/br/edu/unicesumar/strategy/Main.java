package br.edu.unicesumar.strategy;

public class Main {

	public static void main(String[] args) {
		Basquete basquete = new Basquete();
		System.out.println(basquete.getRegras());
		
		System.out.println("--------");
		
		Futebol futebol = new Futebol();
		System.out.println(futebol.getRegras());
	}
}
