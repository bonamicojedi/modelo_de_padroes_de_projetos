package checkbox;

//declara a classe implementando a interface 
public class WindowsCheckbox implements Checkbox {
	// sobrescreve o metodo abstrato
	@Override
	// implementa o metodo
	public void paint() {
		System.out.println("You have created WindowsCheckbox");
	}
}
