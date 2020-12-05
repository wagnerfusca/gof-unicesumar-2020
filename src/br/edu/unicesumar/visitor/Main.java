package br.edu.unicesumar.visitor;

public class Main {

	public static void main(String[] args) {
		Visitor mostra = new MostraDiaAtualVisitor();
		mostra.visit(new ConcreteElement());
		
		
	}
	
}
