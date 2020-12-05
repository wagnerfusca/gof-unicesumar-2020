package br.edu.unicesumar.template.method;

public abstract class Arquivo {
	
	public void leituraDoArquivo() {
		lerHeader();
		lerDetail();
		lerFooter();
	}
	
	abstract void lerHeader();
	abstract void lerDetail();
	abstract void lerFooter();
}
