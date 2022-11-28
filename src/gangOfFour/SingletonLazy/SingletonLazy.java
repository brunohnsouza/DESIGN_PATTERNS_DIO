package gangOfFour.SingletonLazy;

/**
 * Singleton "PREGUIÇOSO"
 * 
 * @author brunohnsouza
 *
 */

public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
	
}