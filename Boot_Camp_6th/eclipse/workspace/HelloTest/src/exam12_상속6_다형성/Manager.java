package exam12_상속6_다형성;

//엔지니어
// Manager is a Employee

public class Manager extends Employee {

	String depart; // 관리부서
	// 생성자 작성을 generate로

	public Manager() {
	}

	public Manager(String name, int salary) {
		super(name, salary);
	}

	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "Manager [depart=" + depart + ", name=" + name + ", salary=" + salary + "]";
	}

	

}
