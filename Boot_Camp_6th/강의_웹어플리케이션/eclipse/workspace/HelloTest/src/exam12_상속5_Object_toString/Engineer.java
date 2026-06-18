package exam12_상속5_Object_toString;

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
	
	@Override
	public String getEmployee() {
		return super.getEmployee() + "\t" + skill;
//		return name+"\t"+salary+"\t"+skill;
	}
	
//	public String getEngineer() {
//		return name+"\t"+salary+"\t"+skill;
//	}
	
}
