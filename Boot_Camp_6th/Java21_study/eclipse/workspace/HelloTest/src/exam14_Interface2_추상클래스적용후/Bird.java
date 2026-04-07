package exam14_Interface2_추상클래스적용후;

public class Bird extends Pet {

	public Bird() {
		// TODO Auto-generated constructor stub
	}

	public Bird(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void eat() {}
	@Override
	public void sleep() {}

}
