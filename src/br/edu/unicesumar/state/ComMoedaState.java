package br.edu.unicesumar.state;

public class ComMoedaState implements State {

	private CokeMachine maquina;
	
	public ComMoedaState(CokeMachine maquina) {
		this.maquina = maquina;
	}
	
	@Override
	public void recebeMoeda() {
		System.out.println("Não pode inserir outra moeda");
		
	}

	@Override
	public void ejetaMoeda() {
		System.out.println("devolvendo moeda");
		maquina.setEstadoAtual(maquina.semMoeda);
		System.out.println("Moeda devolvida");
		
	}

	@Override
	public void pressionaBotao() {
		System.out.println("Separando bebida");
		maquina.setEstadoAtual(maquina.entregaLata);
		maquina.entregaLata();
		
	}

	@Override
	public void entregaLata() {
		System.out.println("sem lata para entregar");
		
	}

}
