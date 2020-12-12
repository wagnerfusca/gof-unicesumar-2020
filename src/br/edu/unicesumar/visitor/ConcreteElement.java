package br.edu.unicesumar.visitor;

public class ConcreteElement extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);

	}

}
