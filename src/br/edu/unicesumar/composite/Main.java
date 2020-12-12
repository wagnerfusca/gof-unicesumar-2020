package br.edu.unicesumar.composite;

public class Main {
	public static void main(String[] args) {
		MenuComponent pizzaria = new Menu("Pizzaria Menu", "Pizzaria");

		MenuComponent cafeDaManha = new Menu("Cafe da Manha Menu", "Cafe da Manha");

		MenuComponent almoco = new Menu("Almoco Menu", "Almoco");

		MenuComponent allMenus = new Menu("All Menus", "Todos menus combinados");

		allMenus.add(cafeDaManha);
		allMenus.add(almoco);
		allMenus.add(pizzaria);

		cafeDaManha.add(new MenuItem("Misto Frio", "pao, queijo e presunto", false, 2));

		almoco.add(new MenuItem("Feijoada", "feijao, focinho, rabinho", false, 22));

		pizzaria.add(new MenuItem("Quatro queijos", "quatro queijos", false, 19));

		GarcomClient garcom = new GarcomClient(allMenus);
		garcom.printMenu();
	}
}
