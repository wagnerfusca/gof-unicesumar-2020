package br.edu.unicesumar.command;

public class DvdDesligarCommand implements Command {

	private Dvd dvd;
	
	public DvdDesligarCommand(Dvd dvd) {
		this.dvd = dvd;
	}
	
	@Override
	public void execute() {
		dvd.desligar();
		
	}

	@Override
	public void undo() {
		System.out.println("Aconteceu algo errado ao desligar");
		
	}

	
}
