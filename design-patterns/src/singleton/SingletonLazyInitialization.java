package singleton;

public class SingletonLazyInitialization {

	private static volatile SingletonLazyInitialization instance = null;

	private SingletonLazyInitialization() {

	}

	public static SingletonLazyInitialization getInstance() {
		if (instance == null) {
			synchronized (SingletonLazyInitialization.class) {
				if (instance == null) {
					instance = new SingletonLazyInitialization();
				}
			}
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("SingletonLazyInitialization message");
	}
}
