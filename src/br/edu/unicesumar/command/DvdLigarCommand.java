package br.edu.unicesumar.command;

public class DvdLigarCommand implements Command {

	private Dvd dvd;
	
	public DvdLigarCommand(Dvd dvd) {
		this.dvd = dvd;
	}
	
	@Override
	public void execute() {
		dvd.ligar();
		
	}

	@Override
	public void undo() {
		System.out.println("Aconteceu algo errado ao ligar");
		
	}

	
}
