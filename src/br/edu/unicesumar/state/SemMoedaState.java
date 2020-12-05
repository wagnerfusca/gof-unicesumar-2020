package br.edu.unicesumar.state;

public class SemMoedaState implements State {

	private CokeMachine maquina;
	
	public SemMoedaState(CokeMachine maquina){
		this.maquina = maquina;

	}
	
	@Override
	public void recebeMoeda() {
		System.out.println("Moeda inserida");
		maquina.setEstadoAtual(maquina.comMoeda);
		
	}

	@Override
	public void ejetaMoeda() {
		System.out.println("Moeda nao inserida");
		
	}

	@Override
	public void pressionaBotao() {
		System.out.println("Insira uma moeda");
		
	}

	@Override
	public void entregaLata() {
		System.out.println("Insira primeiro uma moeda");
		
	}

}
