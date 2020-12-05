package br.edu.unicesumar.strategy;

public class RegraBasquete implements IRegras{

	@Override
	public String getSubstituicao() {
		return "SUBSTITUICAO: a qualquer momento";
	}

	@Override
	public String getTempoJogo() {
		return "TEMPO DE JOGO: 4 tempos de 10 min" ;
	}

	@Override
	public Integer quantidadeJogadores() {
		return 12;
	}

}
