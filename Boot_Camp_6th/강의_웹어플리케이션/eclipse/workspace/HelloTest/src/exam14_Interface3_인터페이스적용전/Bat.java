package exam14_Interface3_인터페이스적용전;

public class Bat extends Pet {

	public Bat() {
		// TODO Auto-generated constructor stub
	}

	public Bat(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void eat() {}
	@Override
	public void sleep() {}
	
	public void batFly() {}

}
