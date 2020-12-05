package br.edu.unicesumar.chainofresponsibility;

public class EmailSolicitacao extends Email{

	public EmailSolicitacao() {
		tipoEmail = TipoEmail.SOLICITACAO;
	}
	
	@Override
	protected void enviarEmailParaDestinatario() {
		System.out.println("envia email para o comercial");
		
	}
}
