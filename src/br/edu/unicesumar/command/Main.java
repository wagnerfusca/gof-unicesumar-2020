package br.edu.unicesumar.command;

public class Main {
	public static void main(String[] args) {
		ControleRemoto controle = new ControleRemoto();

		DvdLigarCommand dvdLigar = new DvdLigarCommand(new Dvd());
		controle.setCommand(dvdLigar);
		controle.botaoPressionado();
		
		DvdDesligarCommand dvdDesligar = new DvdDesligarCommand(new Dvd());
		controle.setCommand(dvdDesligar);
		controle.botaoPressionado();
	}
	
}
