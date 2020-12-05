package br.edu.unicesumar.state.pog;

public class TestCokeMachine {

	public static void main(String[] args) {
		CokeMachine machine = new CokeMachine(5);
		System.out.println(machine);

		machine.recebeMoeda();
		machine.pressionaBotao();

		System.out.println(machine);

		machine.recebeMoeda();
		machine.ejetaMoeda();
		machine.pressionaBotao();

		System.out.println(machine);

		machine.recebeMoeda();
		machine.pressionaBotao();
		machine.recebeMoeda();
		machine.pressionaBotao();
		machine.ejetaMoeda();

		System.out.println(machine);

		machine.recebeMoeda();
		machine.recebeMoeda();
		machine.pressionaBotao();
		machine.recebeMoeda();
		machine.pressionaBotao();
		machine.recebeMoeda();
		machine.pressionaBotao();

		System.out.println(machine);
	}
}
