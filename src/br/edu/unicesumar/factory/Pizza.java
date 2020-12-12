package br.edu.unicesumar.factory;

public abstract class Pizza {

	private String tamanho;
	private Double preco;

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public void preparar() {
		System.out.println("Preparando a pizza");
		for (int x = 0; x < 3; x++) {
			System.out.println("adiciona ingrediente " + x);
		}
		System.out.println("pizza preparada");
	}

	public void assar() {
		System.out.println("Assar: levar ao forno.");
	}

	public void cortar() {
		System.out.println("cortar da forma que o fusca ensinou");

	}

	public void embalar() {
		System.out.println("Colocar na embalagem de tamanho correto");
	}
}
