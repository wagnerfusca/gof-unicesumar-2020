package br.edu.unicesumar.observer;

public class Main {

	public static void main(String[] args) {
		SireneConcreta sirene = new SireneConcreta();
		
		OperarioConcreto op1 = new OperarioConcreto(sirene);
		OperarioConcreto op2 = new OperarioConcreto(sirene);
		
		sirene.alterarAlerta();
		sirene.alterarAlerta();
		sirene.removerObservador(op2);
		sirene.alterarAlerta();
	}
}
