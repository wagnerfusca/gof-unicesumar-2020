package br.edu.unicesumar.state;


public class CokeMachine {

	State semLata;
	State semMoeda;
	State comMoeda;
	State entregaLata;
	
	private State estadoAtual = semLata;
	
	private Integer quantidadeLatas = 0;
	
	public CokeMachine(Integer contador) {
		this.quantidadeLatas = contador;
		
		semLata = new SemLatasState(this);
		semMoeda = new SemMoedaState(this);
		comMoeda = new ComMoedaState(this);
		entregaLata = new EntregaLataState(this);
		
		if (this.quantidadeLatas > 0) {
			estadoAtual = semMoeda;
		} else {
			estadoAtual = semLata;
		}
	}
	
	public void setEstadoAtual(State estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
	
	public Integer getQuantidadeLatas() {
		return quantidadeLatas;
	}
	
	public void setQuantidadeLatas(Integer quantidadeLatas) {
		this.quantidadeLatas = quantidadeLatas;
	}
	
	public void recebeMoedas() {
		estadoAtual.recebeMoeda();
	}
	
	public void ejetaMoeda() {
		estadoAtual.ejetaMoeda();
	}
	
	public void pressionaBotao() {
		estadoAtual.pressionaBotao();
	}
	
	public void entregaLata() {
		estadoAtual.entregaLata();		
	}

	@Override
	public String toString() {
		return "CokeMachine [estadoAtual=" + estadoAtual + ", quantidadeLatas=" + quantidadeLatas + "]";
	}
	
	
	
}
