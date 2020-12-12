package br.edu.unicesumar.composite;


public class GarcomClient {

	private final MenuComponent allMenus;

	public GarcomClient(MenuComponent allMenus) {
		this.allMenus = allMenus;

	}

	public void printMenu() {
		allMenus.print();

	}
}
