package br.edu.unicesumar.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class SireneConcreta implements Sirene{
	
	private Boolean alertaSonoro = false;
	private ArrayList<Operario> observadores = new ArrayList<Operario>();

	@Override
	public void adicionarObservador(Operario operario) {
		observadores.add(operario);
		
	}

	@Override
	public void removerObservador(Operario operario) {
		observadores.remove(operario);
		
	}
	
	public void notificarObservadores() {
		Iterator i = observadores.iterator();
		while (i.hasNext()) {
			Operario operario = (Operario) i.next();
			operario.atualizar(this);
		}
		
	}

	public void alterarAlerta() {
		if (alertaSonoro) {
			alertaSonoro = false; 
		} else {
			alertaSonoro = true;
		}
		notificarObservadores();
	}
	
	public Boolean getAlerta() {
		return alertaSonoro;
	}
}
