package factories;

import button.Button;
import button.WindowsButton;
import checkbox.Checkbox;
import checkbox.WindowsCheckbox;

//declara a classe implementando a interface 
public class WindowsFactory implements GUIFactory {
	// sobrescreve o metodo abstrato
	@Override
	// implementa o metodo que cria um button
	public Button createButton() {
		return new WindowsButton();
	}

	// sobrescreve o metodo abstrato
	@Override
	// implementa o metodo que cria um checkbox
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}

}
