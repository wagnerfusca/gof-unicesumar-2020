package br.edu.unicesumar.composite;

public abstract class MenuComponent {
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	public String getNome() {
		throw new UnsupportedOperationException();
	}

	public String getDescricao() {
		throw new UnsupportedOperationException();
	}

	public double getPreco() {
		throw new UnsupportedOperationException();
	}

	public boolean isVegetariano() {
		throw new UnsupportedOperationException();
	}

	public void print() {
		throw new UnsupportedOperationException();
	}
}
