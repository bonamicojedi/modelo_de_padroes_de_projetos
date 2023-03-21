package app;

import button.Button;
import checkbox.Checkbox;
import factories.GUIFactory;

public class Application {
	//declara uma instancia de cada interface
	private Button button;
	private Checkbox checkbox;

	public Application(GUIFactory factory) {
		//usa o metodo de criacao que foi implementado em uma das implementacoes de factory
		//para atribuir a instancia de componente à uma implementacao especifica
		//que esta vinculada a implementacao da factory
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}

	public void paint() {
		//printa usando os metodos das interfaces, que estao sendo implementados
		//pelas classes
		button.paint();
		checkbox.paint();
	}
}
