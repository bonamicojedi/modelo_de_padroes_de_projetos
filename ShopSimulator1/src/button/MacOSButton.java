package button;

//declara a classe implementando a interface 
public class MacOSButton implements Button{
	//sobrescreve o metodo abstrato
@Override
//implementa o metodo
public void paint() {
	System.out.println("You have created MacOSButton");
}
}
