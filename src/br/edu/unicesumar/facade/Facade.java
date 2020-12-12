package br.edu.unicesumar.facade;

public class Facade {

	private Luzes luzes;
	private Televisao televisao;
	private Netflix netFlix;

	public Facade(Luzes luzes, Televisao televisao, Netflix netFlix) {
		this.luzes = luzes;
		this.televisao = televisao;
		this.netFlix = netFlix;
		
	}
	
	public void iniciarUmSeriado() {
		luzes.desligar();
		televisao.ligar();
		netFlix.ligar();
		netFlix.exibirRecomendacoes();
	}
	
	public void finalizarUmSeriado() {
		netFlix.desligar();
		televisao.desligar();
		luzes.ligar();
		
		
	}
	
}
