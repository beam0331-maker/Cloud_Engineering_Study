package exam14_Interface3_인터페이스적용후;

public class Bat extends Pet implements Flyer {

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


	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

}
