package br.edu.unicesumar.memento;

public class Mediator {

	public void remover() {
		System.out.println("botao pesquisar desabilitado");
		System.out.println("botao editar desabilitado");

		System.out.println("removendo...");
		try {
			Thread.sleep(300);
			System.out.println("removido com sucesso");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void editar() {
		System.out.println("botao pesquisar desabilitado");
		System.out.println("botao remover desabilitado");

		System.out.println("editando...");
		try {
			Thread.sleep(300);
			System.out.println("abriu a tela para edicao");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void pesquisar() {
		System.out.println("botao remover desabilitado");
		System.out.println("botao editar desabilitado");

		System.out.println("pesquisando...");

		try {
			Thread.sleep(300);
			System.out.println("pesquisa realizada com  sucesso");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
