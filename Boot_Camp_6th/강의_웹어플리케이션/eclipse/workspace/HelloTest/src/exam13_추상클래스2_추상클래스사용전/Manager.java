package exam13_추상클래스2_추상클래스사용전;

public class Manager extends Employee {
	
	String depart;
	
	
	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

//	name과 salary, dpart 리턴하는 메서드가 필요하다고 order가 옴
//	추상화를 사용하지 않았을경우
	public String getNameSalaryDepart() {
		return name +"\t"+ salary+"\t" + depart;
	}

	

}
