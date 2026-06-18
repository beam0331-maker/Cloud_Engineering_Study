package exam12_상속1_상속전;

public class Engineer {
	String name;
	int salary;
	String skill;
	public Engineer() {
		// TODO Auto-generated constructor stub
	}
	public Engineer(String name, int salary, String skill) {
		this.name = name;
		this.salary = salary;
		this.skill = skill;
	}
	
	// getter
	// setter
	
	public String getEngineer() {
		return name+"\t"+salary+"\t"+skill;
	}
	
}
