package Patterns.Composite;
import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private String dept;
	private int salary;
	private List<Employee> subordinates;
	
	public Employee(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
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
		String res = "Employee:[name: " + this.name + ", dept: " + this.dept + ", salary: " + this.salary + "]\n";
		
		if (this.subordinates.size() > 0)
			res += this.subordinates.toString();
		
		return res;
	}
}
