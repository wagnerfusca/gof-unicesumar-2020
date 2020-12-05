package br.edu.unicesumar.chainofresponsibility;

public abstract class Email {

	protected Email next;
	protected TipoEmail tipoEmail;
	
	protected abstract void enviarEmailParaDestinatario();
	
	public void enviarEmail(TipoEmail tipoEmail) {
		if (this.tipoEmail == tipoEmail) {
			enviarEmailParaDestinatario();
		} 
		
		if(next != null) {
			next.enviarEmail(tipoEmail);
		}
	}
	
	public void setNext(Email next) {
		this.next = next;
	}
}
