package br.edu.unicesumar.strategy;

public class RegraFutebol implements IRegras{

	@Override
	public String getSubstituicao() {
		return "SUBSTITUICAO: 3 ao total, realizada durante a partida";
	}

	@Override
	public String getTempoJogo() {
		return "TEMPO DE JOGO: 2 tempos de 45 min" ;
	}

	@Override
	public Integer quantidadeJogadores() {
		return 22;
	}

}
