package br.edu.unicesumar.state.pog;

public class CokeMachine {

	final static int SEM_LATA = 0;
	final static int SEM_MOEDA = 1;
	final static int COM_MOEDA = 2;
	final static int ENTREGA_LATA = 3;

	int estado = SEM_LATA;
	int count = 0;

	public CokeMachine(int count) {
		this.count = count;
		if (count > 0) {
			estado = SEM_MOEDA;
		}
	}

	public void recebeMoeda() {
		if (estado == COM_MOEDA) {
			System.out.println("nao pode inserir outra moeda");
		} else if (estado == SEM_MOEDA) {
			estado = COM_MOEDA;
			System.out.println("Moeda inserida");
		} else if (estado == SEM_LATA) {
			System.out.println("nao há latas nesta maquina");
		} else if (estado == ENTREGA_LATA) {
			System.out.println("aguarde, sua lata já sera entregue");
		}
	}

	public void ejetaMoeda() {
		if (estado == COM_MOEDA) {
			System.out.println("devolve a moeda");
			estado = SEM_MOEDA;
		} else if (estado == SEM_MOEDA) {
			// estado = COM_MOEDA;
			System.out.println("Moeda nao inserida");
		} else if (estado == SEM_LATA) {
			System.out.println("Nao eh possivel ejetar pois a maquina esta vazia e nao aceita moedas");
		} else if (estado == ENTREGA_LATA) {
			System.out.println("Voce ja selecionou o seu refrigerante, nao podemos devolver");
		}
	}

	public void pressionaBotao() {
		if (estado == COM_MOEDA) {
			System.out.println("processando");
			estado = ENTREGA_LATA;
			entregaLata();
		} else if (estado == SEM_MOEDA) {
			System.out.println("Insira uma moeda");
		} else if (estado == SEM_LATA) {
			System.out.println("Esta opcao esgotou, selecione outro refrigerante");
		} else if (estado == ENTREGA_LATA) {
			System.out.println("segunda tentativa. Aguarde a o seu refrigerante");
		}
	}

	public void entregaLata() {
		if (estado == COM_MOEDA) {
			System.out.println("Sem lata para entregar");
		} else if (estado == SEM_MOEDA) {
			System.out.println("Insira primeiro uma moeda");
		} else if (estado == SEM_LATA) {
			System.out.println("Sem lata para entregar");
		} else if (estado == ENTREGA_LATA) {
			System.out.println("Aguarde... estamos separando seu refrigerante");
			count--;
			if (count == 0) {
				System.out.println("refrigerante esgotado");
				estado = SEM_LATA;
			} else {
				estado = SEM_MOEDA;
			}
		}
	}

	@Override
	public String toString() {
		return "CokeMachine [estado=" + estado + ", count=" + count + "]";
	}

}
