package exam12_상속6_다형성;

// 엔지니어
// Engineer is a Employee

public class Engineer extends Employee {

	String skill;
		
	public Engineer() {
		super();
	}

	public Engineer(String name, int salary) {
		super(name, salary);
	}

	public Engineer(String name, int salary, String skill) {
		super(name, salary);
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Engineer [skill=" + skill + ", name=" + name + ", salary=" + salary + "]";
	}

	
	

	
}
