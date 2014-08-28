package iterator;

public class IteratorPatternDemo {

	public static void main(String[] args) {

		NameRepository r = new NameRepository();

		for (Iterator i = r.getIterator(); i.hasNext();) {
			String name = (String) i.next();
			System.out.println("Name : " + name);
		}

	}

}
