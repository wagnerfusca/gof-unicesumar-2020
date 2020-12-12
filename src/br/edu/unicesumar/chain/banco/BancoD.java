package br.edu.unicesumar.chain.banco;

public class BancoD extends BancoChain {

	public BancoD() {
		super.tipoBanco = TipoBanco.BANCO_D;
	}
	
	@Override
	public void metodoEfetuarPagamentoDaSubclasse() {
		System.out.println("pagamento sendo efetuado pelo banco D");
		
	}

}
