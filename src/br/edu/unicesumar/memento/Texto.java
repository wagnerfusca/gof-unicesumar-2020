package br.edu.unicesumar.memento;

public class Texto {
	protected String texto;
	TextoArmazenador textoArmazenador;

	public Texto() {
		textoArmazenador = new TextoArmazenador();
		texto = new String();
	}

	public void escreverTexto(String novoTexto) {
		textoArmazenador.adicionarMemento(new TextoMemento(texto));
		texto += novoTexto;
	}

	public void desfazerEscrita() {
		texto = textoArmazenador.getUltimoEstadoSalvo().getTextoSalvo();
	}

	public void mostrarTexto() {
		System.out.println(texto);
	}
}