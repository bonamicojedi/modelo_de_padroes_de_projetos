package factories;
import button.Button;
import checkbox.Checkbox;

//cria a interface
public interface GUIFactory {
	//declara metodos abstratos para as criar duas outras interfaces, dando um nome e o tipo da interface
	Button createButton();
	Checkbox createCheckbox();
}
