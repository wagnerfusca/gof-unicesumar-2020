package br.edu.unicesumar.command;

public interface Command {

	void execute();
	
	void undo();
}
