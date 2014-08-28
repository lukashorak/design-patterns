package singleton;

public class SingletonOnDemantHolderIdiom {

	private SingletonOnDemantHolderIdiom() {
	}

	private static class SingletonOnDemantHolderIdiomHolder {
		private static final SingletonOnDemantHolderIdiom INSTANCE = new SingletonOnDemantHolderIdiom();
	}

	public static SingletonOnDemantHolderIdiom getInstance() {
		return SingletonOnDemantHolderIdiomHolder.INSTANCE;
	}

	public void showMessage() {
		System.out.println("SingletonOnDemantHolderIdiom message");
	}
}
