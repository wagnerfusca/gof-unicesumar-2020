package br.edu.unicesumar.chainofresponsibility;

public abstract class Email {

	protected Email next;
	protected TipoEmail tipoEmail;
	
	protected abstract void enviarEmailParaDestinatario();
	
	public void enviarEmail(TipoEmail tipoEmail) {

	}
	
	public void setNext(Email next) {
		this.next = next;
	}
}
