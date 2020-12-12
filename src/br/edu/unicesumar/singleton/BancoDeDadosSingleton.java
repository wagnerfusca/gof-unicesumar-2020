package br.edu.unicesumar.singleton;
public class BancoDeDadosSingleton {

	private static BancoDeDadosSingleton conexao;

	private BancoDeDadosSingleton(){

	}
	public static BancoDeDadosSingleton getInstancia(){
		if (conexao == null){
			conexao = new BancoDeDadosSingleton();
		}
		return conexao;
	}

}
