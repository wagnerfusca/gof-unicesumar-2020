package br.edu.unicesumar.proxy;

public class Main {

	public static void main(String[] args) {
		System.out.println("Usuario sem acesso tentando acessar");

		BancoDeDados bancoDeDados = new BancoProxy("Jose", "1111");
		System.out.println(bancoDeDados.getNumeroDeUsuarios());
		System.out.println(bancoDeDados.getUsuariosConectados());

		System.out.println("Administrador acessando");
		bancoDeDados = new BancoProxy("admin", "admin");
		System.out.println(bancoDeDados.getNumeroDeUsuarios());
		System.out.println(bancoDeDados.getUsuariosConectados());
	}

}
