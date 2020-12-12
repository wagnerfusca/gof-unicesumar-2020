package br.edu.unicesumar.adapter.ps2usb;

public class Adaptador implements USB{

	private PS2 ps2;

	public Adaptador(PS2 ps2){
		this.ps2 = ps2;
	}

	@Override
	public void canal1() {
		ps2.canal2();

	}

	@Override
	public void canal2() {
		System.err.println("canal nao utilizado");
	}

	@Override
	public void canal3() {
		System.err.println("canal nao utilizado");

	}

	@Override
	public void canal4() {
		ps2.canal1();

	}

	@Override
	public void canal5() {
		ps2.canal3();
	}

}
