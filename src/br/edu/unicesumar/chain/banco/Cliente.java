package br.edu.unicesumar.chain.banco;

public class Cliente {

	public static void main(String[] args) {
		BancoA bancoA = new BancoA();
		BancoB bancoB = new BancoB();
		BancoC bancoC = new BancoC();
		BancoD bancoD = new BancoD();
		
		bancoA.setNext(bancoB);
		bancoB.setNext(bancoC);
		bancoC.setNext(bancoD);
		
		BancoChain bancoChain = bancoA;
		
		bancoChain.efetuarPagamento(TipoBanco.BANCO_C);
		bancoChain.efetuarPagamento(TipoBanco.BANCO_A);
		bancoChain.efetuarPagamento(TipoBanco.BANCO_D);
		
	}
}
