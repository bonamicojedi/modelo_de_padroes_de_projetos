package app;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;
public class Demo {
private static Application configureApplication() {
	//declara instancia da classe application e a instancia da interface
	Application app;
	GUIFactory factory;
	//pega a propriedade do sistema operacional chamada os.name, que se refere
	//ao nome do sistema operacional (ex: windows) e deixa ele todo em lowercase
	//para poder comparar com o if sem dar problemas
	String osName = System.getProperty("os.name").toLowerCase();
	//se for mac, atribui a implementacao de mac para a factory, senao atribui a 
	//implementacao de windows
	if(osName.contains("mac")) {
		factory = new MacOSFactory();
	}else {
		factory = new WindowsFactory();
	}
	//pega o app declarado e usa o construtor dele que recebe uma factory
	//e nesse caso passa a factory ja com a implementacao especifica vinculada ao OS certo
	app = new Application(factory);
	return app;
}
public static void main(String[] args) {
	//cria uma instancia de app usando o configureApplication, metodo que faz o setup inicial
	//da classe
	Application app = configureApplication();
	//usa o metodo paint que esta na classe, pois a classe tem uma factory,
	//a factory tem dois componentes especifico, um botao e um checkbox
	//e cada um desses tem um metodo paint, portanto acaba chamando os dois
	app.paint();
}
}
