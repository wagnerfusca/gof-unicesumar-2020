package br.edu.unicesumar.prototype;

public class Animal implements Cloneable {
	String animalNome;

	public void setNomeAnimal(String animalNome) {
		this.animalNome = animalNome;
	}

	public String getNameAnimal() {
		return this.animalNome;
	}

	public void comer() {
		System.out.println(animalNome + " esta comendo...");
	}

	public void andar() {
		System.out.println(animalNome + " esta andando...");
	}

	public Animal clone() {
		Animal animalClonado = null;
		try {
			animalClonado = (Animal) super.clone();
			animalClonado.setNomeAnimal(animalClonado.getNameAnimal() + " - clonado");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return animalClonado;
	}
}