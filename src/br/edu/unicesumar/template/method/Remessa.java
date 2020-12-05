package br.edu.unicesumar.template.method;

public class Remessa extends Arquivo{

	@Override
	void lerHeader() {
		System.out.println("leu header remessa");
		
	}

	@Override
	void lerDetail() {
		 System.out.println("leu detail remessa");
		
	}

	@Override
	void lerFooter() {
		System.out.println("leu footer remessa");
		
	}

}
