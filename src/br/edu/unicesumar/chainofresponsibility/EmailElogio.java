package br.edu.unicesumar.chainofresponsibility;

public class EmailElogio extends Email{

	public EmailElogio() {
		tipoEmail = TipoEmail.ELOGIO;
	}

	@Override
	protected void enviarEmailParaDestinatario() {
		System.out.println("envia email para a presidencia");
		
	}
}
