package checkbox;

//declara a classe implementando a interface 
public class MacOSCheckbox implements Checkbox {
	//sobrescreve o metodo abstrato
	@Override
	// implementa o metodo
	public void paint() {
		System.out.println("You have created MacOSCheckbox");
	}
}
