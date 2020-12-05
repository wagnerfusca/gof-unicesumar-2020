package br.edu.unicesumar.mediator;

public class BotaoPesquisarCommand implements Command{

	private final Mediator mediator;

	public BotaoPesquisarCommand(Mediator mediator) {
		this.mediator = mediator;

	}

	@Override
	public void execute() {
		mediator.pesquisar();
	}

}
