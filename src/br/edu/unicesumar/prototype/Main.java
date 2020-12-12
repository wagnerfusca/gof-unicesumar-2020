package br.edu.unicesumar.prototype;

public class Main {

	public static void main(String[] args) {
		Animal ovelha = new Ovelha("Dolly");
		System.out.println("Nome do animal: " + ovelha.getNameAnimal());
			
		 
		Animal animal = (Animal) ovelha.clone();
		System.out.println("Nome do animal: " + animal.getNameAnimal());
			
	}
}
