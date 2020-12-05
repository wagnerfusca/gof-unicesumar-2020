package br.edu.unicesumar.visitor;

public class Main {

	public static void main(String[] args) {
		ConcreteElement concreteElement = new ConcreteElement();
		
		ConcreteVisitor concreteVisitor = new ConcreteVisitor();
		concreteElement.accept(concreteVisitor);
		
		MostraDiaAtualVisitor mostraDiaAtualVisitor = new MostraDiaAtualVisitor();		
		concreteElement.accept(mostraDiaAtualVisitor);
		
		
	}
	
}
