package br.edu.unicesumar.chain.banco;

public class BancoC extends BancoChain {

	
	public BancoC() {
		super.tipoBanco = TipoBanco.BANCO_C;
	}
	
	@Override
	public void metodoEfetuarPagamentoDaSubclasse() {
		System.out.println("pagamento sendo efetuado pelo banco C");
		
	}

}
