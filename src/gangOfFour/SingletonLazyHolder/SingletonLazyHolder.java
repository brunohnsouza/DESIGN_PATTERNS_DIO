package gangOfFour.SingletonLazyHolder;

/**
 * Singleton "LAZY HOLDER"
 * 
 * @author brunohnsouza
 *
 */

public class SingletonLazyHolder {
	
	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
	
}
