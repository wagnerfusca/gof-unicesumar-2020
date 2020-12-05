package br.edu.unicesumar.state;

public class SemLatasState implements State {

	private CokeMachine maquina;
	
	public SemLatasState(CokeMachine maquina) {
		this.maquina = maquina;
	}
	
	@Override
	public void recebeMoeda() {
		System.out.println("nao há latas nesta maquina");
		
	}

	@Override
	public void ejetaMoeda() {
		System.out.println("Nao eh possivel ejetar pois a maquina esta vazia e nao aceita moedas");
		
	}

	@Override
	public void pressionaBotao() {
		System.out.println("Esta opcao esgotou, selecione outro refrigerante");
		
	}

	@Override
	public void entregaLata() {
		System.out.println("Sem lata para entregar");
		
	}

}
