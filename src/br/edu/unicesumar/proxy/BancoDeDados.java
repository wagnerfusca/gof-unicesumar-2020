package br.edu.unicesumar.proxy;

public class BancoDeDados implements IBancoDeDados {

	private int quantidadeDeUsuarios = 0;
	private int usuariosConectados = 0;

	public BancoDeDados() {
		quantidadeDeUsuarios = (int) (Math.random() * 100);
		usuariosConectados = (int) (Math.random() * 100);
	}

	@Override
	public String getUsuariosConectados() {
		return new String("Total de usuarios conectados: " + usuariosConectados);
	}

	@Override
	public String getNumeroDeUsuarios() {
		return new String("Total de usuarios: " + quantidadeDeUsuarios);
	}

}
