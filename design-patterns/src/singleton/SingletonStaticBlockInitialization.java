package singleton;

public class SingletonStaticBlockInitialization {

	private static final SingletonStaticBlockInitialization instance;

	static {
		try {
			instance = new SingletonStaticBlockInitialization();
		} catch (Exception e) {
			throw new RuntimeException(
					"Error during SingletonStaticBlockInitialization initialization",
					e);
		}
	}

	public static SingletonStaticBlockInitialization getInstance() {
		return instance;
	}

	private SingletonStaticBlockInitialization() {
	}

	public void showMessage() {
		System.out.println("SingletonStaticBlockInitialization message");
	}

}
