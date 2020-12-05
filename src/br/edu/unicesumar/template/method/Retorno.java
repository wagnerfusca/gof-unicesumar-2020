package br.edu.unicesumar.template.method;

public class Retorno extends Arquivo{

	@Override
	void lerHeader() {
		System.out.println("leu header retorno");
		
	}

	@Override
	void lerDetail() {
		System.out.println("leu detail retorno");
		
	}

	@Override
	void lerFooter() {
		 System.out.println("leu footer retorno");
		
	}

}
