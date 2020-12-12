package br.edu.unicesumar.chain.banco;

public class BancoA extends BancoChain{

	public BancoA() {
		super.tipoBanco = TipoBanco.BANCO_A;
	}
	
	@Override
	public void metodoEfetuarPagamentoDaSubclasse() {
		System.out.println("pagamento sendo efetuado pelo banco A");
		
	}

}
