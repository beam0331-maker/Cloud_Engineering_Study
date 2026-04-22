package exam13_추상클래스2_추상클래스사용후;

public class Engineer extends Employee {
	
	String skill;

	public Engineer(String name, int salary, String skill) {
		super(name, salary);
		this.skill = skill;
	}	
//	name과 salary, dpart 리턴하는 메서드가 필요하다고 order가 옴
//	추상화를 사용하지 않았을경우
//	public String getInfo() {
//		return name +"\t" + salary+"\t" + skill;
//	}
	@Override
	public String getEmployee() {
		return name +"\t" + salary+"\t" + skill;
	}
	
}
