package br.edu.unicesumar.adapter.pinos;

public class AdaptadoraTresPinosParaDoisPinos implements PadraoAmericano {

	private PadraoBrasileiro padraoBrasileira;

	public AdaptadoraTresPinosParaDoisPinos(PadraoBrasileiro padraoBrasileira) {
		this.padraoBrasileira = padraoBrasileira;
	}

	@Override
	public void pino1() {
		this.padraoBrasileira.pino2();

	}

	@Override
	public void pino2() {
		this.padraoBrasileira.pino1();
	}

}
