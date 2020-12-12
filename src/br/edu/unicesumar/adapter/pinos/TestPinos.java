package br.edu.unicesumar.adapter.pinos;

public class TestPinos {

	public static void main(String[] args) {
		AdaptadoraTresPinosParaDoisPinos adaptador = new AdaptadoraTresPinosParaDoisPinos(new TresPinos());
		adaptador.pino1();
		adaptador.pino2();

	}
}
