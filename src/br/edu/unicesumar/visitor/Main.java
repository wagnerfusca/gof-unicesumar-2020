package br.edu.unicesumar.visitor;

public class Main {

	public static void main(String[] args) {
		ConcreteElement concreteElement = new ConcreteElement();
		
		Visitor concreteVisitor = new ConcreteVisitor();
		Visitor mostraDiaAtualVisitor = new MostraDiaAtualVisitor();
		Visitor testeStringVisitor = new TesteStringVisitor();
		
		concreteElement.accept(concreteVisitor);
		concreteElement.accept(testeStringVisitor);				
		concreteElement.accept(mostraDiaAtualVisitor);
		
		
	}
	
}
