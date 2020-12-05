package br.edu.unicesumar.observer;

public class OperarioConcreto implements Operario{

	private SireneConcreta objetoObservado;
	
	public OperarioConcreto(SireneConcreta sirene) {
		this.objetoObservado = sirene;
		this.objetoObservado.adicionarObservador(this);
	}
	
	@Override
	public void atualizar(Sirene sirene) {
		if (sirene == objetoObservado) {
			System.out.println("A sirene mudou seu estado para: "+objetoObservado.getAlerta());
		}
		
	}

}
