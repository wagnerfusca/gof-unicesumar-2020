package br.edu.unicesumar.proxy;

public class BancoProxy extends BancoDeDados implements IBancoDeDados {

	private final String usuario;
	private final String senha;

	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public String getUsuariosConectados() {
		if (temPermissao()) {
			return super.getUsuariosConectados();
		} else {
			return null;
		}
	}

	@Override
	public String getNumeroDeUsuarios() {
		if (temPermissao()) {
			return super.getNumeroDeUsuarios();
		} else {
			return null;
		}
	}

	private boolean temPermissao() {
		return usuario.equals("admin") && senha.equals("admin");
	}
}
