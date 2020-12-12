package br.edu.unicesumar.facade;

public class ChaveFacade {

	private Luzes luzes;
	private Motor motor;
	private Radio radio;
	private Radiador radiador;

	public ChaveFacade(final Luzes luzes, final Motor motor, final Radiador radiador, final Radio radio) {

		this.luzes = luzes;
		this.motor = motor;
		this.radiador = radiador;
		this.radio = radio;
	}

	public void partidaCarro() {
		motor.ligarMotor();
		motor.injetarCombustivel();
		motor.rodarPistao();

		luzes.luzAgua();
		luzes.luzBateria();
		luzes.luzOleo();

		radiador.getTemperaturaAgua();

		radiador.bombarAgua();

		radio.ligar();
		radio.exibirHoras();

	}

	public void desligarCarro() {
		motor.desligar();

		luzes.apagar();

		radio.desligar();

	}
}
