package factories;

import button.Button;
import button.MacOSButton;
import checkbox.Checkbox;
import checkbox.MacOSCheckbox;

//declara a classe implementando a interface 
public class MacOSFactory implements GUIFactory {
	// sobrescreve o metodo abstrato
	@Override
	// implementa o metodo que cria um button
	public Button createButton() {
		return new MacOSButton();
	}

	// sobrescreve o metodo abstrato
	@Override
	// implementa o metodo que cria um checkbox
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}

}
