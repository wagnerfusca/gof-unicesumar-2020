package br.edu.unicesumar.mediator;

public class BotaoEditarCommand implements Command {

	private final Mediator mediator;

	public BotaoEditarCommand(Mediator mediator) {
		this.mediator = mediator;

	}

	@Override
	public void execute() {
		mediator.editar();
	}

}
