package exam12_상속6_다형성;

public class Employee {	// 자동으로 extends Object가 지정됨
	
	String name;
	int salary;
	public Employee() {
	}
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	
	
	
}	
