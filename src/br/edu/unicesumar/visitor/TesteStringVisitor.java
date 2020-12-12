package br.edu.unicesumar.visitor;

public class TesteStringVisitor implements Visitor{

	@Override
	public void visit(ConcreteElement concreteElement) {
		System.out.println("passou na classe teste string visitor");	
	}

}
