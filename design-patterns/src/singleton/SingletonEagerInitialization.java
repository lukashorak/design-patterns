package singleton;

public class SingletonEagerInitialization {

	private static final SingletonEagerInitialization INSTANCE = new SingletonEagerInitialization();

	private SingletonEagerInitialization() {
	}

	public static SingletonEagerInitialization getInstance() {
		return INSTANCE;
	}

	public void showMessage() {
		System.out.println("SingletonEagerInitialization message");
	}
}
