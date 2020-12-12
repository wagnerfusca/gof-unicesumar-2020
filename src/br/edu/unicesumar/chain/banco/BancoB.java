package br.edu.unicesumar.chain.banco;

public class BancoB extends BancoChain {

	public BancoB() {
		super.tipoBanco = TipoBanco.BANCO_B;
	}
	
	@Override
	public void metodoEfetuarPagamentoDaSubclasse() {
		System.out.println("pagamento sendo efetuado pelo banco B");
		
	}

}
