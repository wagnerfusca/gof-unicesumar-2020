package br.edu.unicesumar.chainofresponsibility;

public class EmailSpam extends Email{

	public EmailSpam() {
		tipoEmail = TipoEmail.SPAM;
	}
	
	@Override
	protected void enviarEmailParaDestinatario() {
		System.out.println("caixa de spam");
		
	}
}
