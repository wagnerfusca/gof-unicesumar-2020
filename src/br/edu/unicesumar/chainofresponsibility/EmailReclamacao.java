package br.edu.unicesumar.chainofresponsibility;

public class EmailReclamacao extends Email{

	public EmailReclamacao() {
		tipoEmail = TipoEmail.RECLAMACAO;
	}
	
	@Override
	protected void enviarEmailParaDestinatario() {
		System.out.println("envia email para o juridico");
		
	}
}
