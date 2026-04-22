package exam12_상속3_super;

public class Employee {	// 자동으로 extends Object가 지정됨
	
	String name;
	int salary;
	public Employee() {
		System.out.println("Employee 생성");

		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int salary) {
		System.out.println("Employee(String name, int salary) 생성자");

		this.name = name;
		this.salary = salary;
	}
	
	
	public String getEmployee() {
		return name+"\t"+salary;
	}
	
}	
