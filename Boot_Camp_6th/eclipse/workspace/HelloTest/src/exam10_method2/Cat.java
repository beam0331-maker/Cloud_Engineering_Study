package exam10_method2;

public class Cat {
	
	// 은닉화(캡슐화)
	private String name;
	private int age;
	private String gender;
	
	// 생성자
	public Cat() {
		
	}
	
	public Cat(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// 메서드
	
	// name 관리하는 setter와 getter 메소드 추가
	// setter : set + 변수명 (관례)
	// getter : get + 변수명 (관례)
	// camel 표기법 권장
	
	// name manage
	public void setName(String s) {
		this.name = s;
	}
	
	public String getName() {
		return this.name;
	}
	
	// age mange
	public void setAge(int n) {
		this.age = n;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// gender mange
	public void setGender(String s) {
		this.name = s;
	}
	
	public String getGender() {
		return this.gender;
	}

}
