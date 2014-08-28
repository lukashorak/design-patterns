package singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {

		SingleObject o1 = SingleObject.getInstance();
		o1.showMessage();

		SingletonEnum o2 = SingletonEnum.INSTANCE;
		o2.showMessage();

		SingletonLazyInitialization o3 = SingletonLazyInitialization
				.getInstance();
		o3.showMessage();

		SingletonLazyInitializationSimple o4 = SingletonLazyInitializationSimple
				.getInstance();
		o4.showMessage();

		SingletonStaticBlockInitialization o5 = SingletonStaticBlockInitialization
				.getInstance();
		o5.showMessage();
	}
}
