package nullobject;

public class NullPatternDemo {

	public static void main(String[] args) {

		AbstractCustomer c1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer c2 = CustomerFactory.getCustomer("John");
		AbstractCustomer c3 = CustomerFactory.getCustomer("Doe");
		AbstractCustomer c4 = CustomerFactory.getCustomer("Frank");

		System.out.println("Customers:");
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		System.out.println(c4.getName());
	}
}
