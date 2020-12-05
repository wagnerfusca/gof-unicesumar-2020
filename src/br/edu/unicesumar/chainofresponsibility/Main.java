package br.edu.unicesumar.chainofresponsibility;

public class Main {

	public static void main(String[] args) {
		Email email = criaSequencia();
		
		email.enviarEmail(TipoEmail.SOLICITACAO);
		email.enviarEmail(TipoEmail.SOLICITACAO);
		email.enviarEmail(TipoEmail.SPAM);
		email.enviarEmail(TipoEmail.RECLAMACAO);
		email.enviarEmail(TipoEmail.ELOGIO);
	}

	private static Email criaSequencia() {
		Email emailElogio = new EmailElogio();
		Email emailReclamacao = new EmailReclamacao();
		Email emailSolicitacao = new EmailSolicitacao();
		Email emailSpam = new EmailSpam();
		
		emailElogio.setNext(emailReclamacao);
		emailReclamacao.setNext(emailSolicitacao);
		emailSolicitacao.setNext(emailSpam);
		
		return emailElogio;
	}
}
