package br.edu.unicesumar.visitor;

import java.util.Date;

public class MostraDiaAtualVisitor implements Visitor {

	@Override
	public void visit(ConcreteElement concreteElement) {
		System.out.println("Dia atual :" +  new Date());
	}

}
