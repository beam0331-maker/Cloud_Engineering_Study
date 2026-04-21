package exam12_상속2_상속후;

//엔지니어
// Manager is a Employee

public class Manager extends Employee {

	String depart; // 관리부서
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public Manager(String name, int salary, String depart) {
		super(name, salary);
		System.out.println("Manager 생성");
//		this.name = name;
//		this.salary = salary;
		this.depart = depart;
	}
	// getter
	// setter
	
	public String getManager() {
		return name+"\t"+salary+"\t"+depart;
	}
}
