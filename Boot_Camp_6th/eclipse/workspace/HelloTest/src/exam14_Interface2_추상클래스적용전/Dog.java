package exam14_Interface2_추상클래스적용전;

public class Dog extends Pet {
	
	String gender; // 성별

	public Dog() {
	}	
	
	public Dog(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
	}	

	public void dogEat() {}
	public void dogSleep() {}	
	
	@Override
	public String toString() {
		return "Cat [gender=" + gender + ", name=" + name + ", age=" + age + "]";
	}
	

}
