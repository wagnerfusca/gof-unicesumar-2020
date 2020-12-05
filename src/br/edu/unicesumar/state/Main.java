package br.edu.unicesumar.state;

public class Main {

	public static void main(String[] args) {
		CokeMachine maquina = new CokeMachine(2);
		System.out.println(maquina);
		
		maquina.recebeMoedas();
		System.out.println(maquina);
		maquina.pressionaBotao();
		System.out.println(maquina);
		
		maquina.recebeMoedas();
		maquina.pressionaBotao();
		maquina.recebeMoedas();
		maquina.pressionaBotao();
		
		System.out.println(maquina);
	}
}
