package br.edu.unicesumar.strategy;

public abstract class Esporte {

	public Boolean usaBola;
	
	public String nome;
	
	public Boolean individual;
	
	public IRegras iRegras;
	
	public String getRegras() {
		return iRegras.getSubstituicao() + " - " + iRegras.getTempoJogo() + " - " + iRegras.quantidadeJogadores();
	}
	
}
