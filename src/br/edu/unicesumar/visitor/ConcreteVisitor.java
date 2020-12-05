package br.edu.unicesumar.visitor;

public class ConcreteVisitor implements Visitor {

	@Override
	public void visit(ConcreteElement concreteElement) {
		System.out.println("Visitando a classe :"
				+ concreteElement.getClass().getName());
	}

}
