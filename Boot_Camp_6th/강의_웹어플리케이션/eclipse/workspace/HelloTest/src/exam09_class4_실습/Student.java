package exam09_class4_실습;

public class Student {

	private String name;
	private int age;
	private String address;

	public Student() {

	}	

	public Student(String name, int age) {
		this(name, age, null);
	}

	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}	
	
	public String name() {
		return this.name;
	}
	
	
}
