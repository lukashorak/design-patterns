package singleton;

public class SingletonLazyInitializationSimple {

	private static SingletonLazyInitializationSimple instance = null;

	private SingletonLazyInitializationSimple() {
	}

	public static synchronized SingletonLazyInitializationSimple getInstance() {

		if (instance == null) {
			instance = new SingletonLazyInitializationSimple();
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("SingletonLazyInitializationSimple message");
	}

}
