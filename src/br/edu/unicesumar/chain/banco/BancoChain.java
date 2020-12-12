package br.edu.unicesumar.chain.banco;

public abstract class BancoChain {

	public BancoChain next;
	public TipoBanco tipoBanco;
	
	public void setNext(BancoChain next) {
		this.next = next;
	}
	
	public void efetuarPagamento(TipoBanco tipoBancoParam) {
		if(this.tipoBanco.equals(tipoBancoParam)) {
			metodoEfetuarPagamentoDaSubclasse();
		}
		
		if (this.next != null) {
			this.next.efetuarPagamento(tipoBancoParam);
		}
	}
	
	public abstract void metodoEfetuarPagamentoDaSubclasse();
	
}
