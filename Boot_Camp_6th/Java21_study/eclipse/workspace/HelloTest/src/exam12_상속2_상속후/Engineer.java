package exam12_상속2_상속후;

// 엔지니어
// Engineer is a Employee

public class Engineer extends Employee {

	String skill;
	public Engineer() {
	}
	public Engineer(String name, int salary, String skill) {
		super(name,salary);
		System.out.println("Engineer 생성");
//		this.name = name;
//		this.salary = salary;
		this.skill = skill;
	}
	
	// getter
	// setter
		
	public String getEngineer() {
		return name+"\t"+salary+"\t"+skill;
	}
	
}
