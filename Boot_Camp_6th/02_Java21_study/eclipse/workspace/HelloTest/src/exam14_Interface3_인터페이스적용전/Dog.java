package exam14_Interface3_인터페이스적용전;

public class Dog extends Pet {
	
	String gender; // 성별

	public Dog() {
	}	
	
	public Dog(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}	
	@Override
	public void eat() {}
	@Override
	public void sleep() {}	
	
	@Override
	public String toString() {
		return "Cat [gender=" + gender + ", name=" + name + ", age=" + age + "]";
	}
	

}
