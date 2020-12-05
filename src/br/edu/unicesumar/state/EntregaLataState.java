package br.edu.unicesumar.state;

public class EntregaLataState implements State {

	private CokeMachine maquina;
	
	public EntregaLataState(CokeMachine maquina) {
		this.maquina = maquina;
	}
	@Override
	public void recebeMoeda() {
		System.out.println("aguarde, sua lata será entregue em breve");
		
	}

	@Override
	public void ejetaMoeda() {
		System.out.println("Não é possível devolver a moeda pois o refrigerante está sendo separado");
	}

	@Override
	public void pressionaBotao() {
		System.out.println("Você não tem mais credito para solicitar um novo refrigerante. Espero sua bebida ser disponibilizada.");
		
	}

	@Override
	public void entregaLata() {
		System.out.println("aguarde... processando");
		
		if (maquina.getQuantidadeLatas() == 0) {
			System.out.println("nao há refrigerante disponíve");
			maquina.setEstadoAtual(maquina.semLata);
		} else {
			maquina.setQuantidadeLatas(maquina.getQuantidadeLatas() - 1);
			maquina.setEstadoAtual(maquina.semMoeda);
		}
		
	}

}
