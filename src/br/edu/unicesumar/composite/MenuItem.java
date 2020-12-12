package br.edu.unicesumar.composite;

public class MenuItem extends MenuComponent {

	private final String nome;
	private final String descricao;
	private final boolean isVegetariano;
	private final double preco;

	public MenuItem(String nome, String descricao, boolean isVegetariano, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.isVegetariano = isVegetariano;
		this.preco = preco;

	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean isVegetariano() {
		return isVegetariano;
	}

	public double getPreco() {
		return preco;
	}

	public void print() {
		System.out.print(getNome());
		if (isVegetariano()) {
			System.out.print("(vegetariano)");
		}
		System.out.print(", " + getPreco());
		System.out.print(", " + getDescricao());
		
	}

}
