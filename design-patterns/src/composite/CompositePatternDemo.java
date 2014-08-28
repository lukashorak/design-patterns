package composite;

public class CompositePatternDemo {

	public static void main(String[] args) {

		Employee CEO = new Employee("Frank", "CEO", 20000);

		Employee headSales = new Employee("John", "Head Sales", 10000);
		Employee headMfg = new Employee("Jane", "Head Mfg", 10000);

		Employee sales1 = new Employee("Peter", "Sales", 5000);
		Employee sales2 = new Employee("Kate", "Sales", 4000);
		Employee worker1 = new Employee("Mark", "Mfg", 6000);
		Employee worker2 = new Employee("Jill", "Mfg", 3000);

		CEO.add(headSales);
		CEO.add(headMfg);

		headSales.add(sales1);
		headSales.add(sales2);

		headMfg.add(worker1);
		headMfg.add(worker2);

		System.out.println(CEO);
		for (Employee e1 : CEO.getSubordinates()) {
			System.out.println(e1);
			for (Employee e2 : e1.getSubordinates()) {
				System.out.println(e2);
			}
		}

	}

}
