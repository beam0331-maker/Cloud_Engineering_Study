package exam12_상속3_super;

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

	// getter
	// setter
	
	public String getEngineer() {
		return name+"\t"+salary+"\t"+skill;
	}
	
}
