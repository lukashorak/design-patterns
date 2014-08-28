package composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private String department;
	private Integer salary;
	private List<Employee> subordinates;

	public Employee(String name, String department, Integer salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.subordinates = new ArrayList<>();
	}

	public void add(Employee e) {
		this.subordinates.add(e);
	}

	public void remove(Employee e) {
		this.subordinates.remove(e);
	}

	public List<Employee> getSubordinates() {

		return this.subordinates;
	}

	public String toString() {
		return "[" + name + "," + department + "," + salary + "]";
	}
}
