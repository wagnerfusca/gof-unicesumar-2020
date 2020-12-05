package br.edu.unicesumar.mediator;

public class BotaoRemoverCommand implements Command{

	private final Mediator mediator;

	public BotaoRemoverCommand(Mediator mediator) {
		this.mediator = mediator;

	}

	@Override
	public void execute() {
		mediator.remover();
	}


}
