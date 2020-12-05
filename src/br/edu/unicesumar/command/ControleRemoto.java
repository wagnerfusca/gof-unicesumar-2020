package br.edu.unicesumar.command;

public class ControleRemoto {

	public Command command;
	
	public void setCommand(Command command) {
		this.command = command; 
	}
	
	public void botaoPressionado() {
		command.execute();
	}
	
}
