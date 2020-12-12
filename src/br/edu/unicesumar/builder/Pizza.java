package br.edu.unicesumar.builder;
public class Pizza {
	private String massa = "";
	private String molho = "";
	private String cobertura = "";

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	@Override
	public String toString() {
		return "Pizza [massa=" + massa + ", molho=" + molho + ", cobertura="
				+ cobertura + "]";
	}

}
