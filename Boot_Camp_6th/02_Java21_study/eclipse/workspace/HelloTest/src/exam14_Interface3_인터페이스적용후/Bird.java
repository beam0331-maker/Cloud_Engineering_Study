package exam14_Interface3_인터페이스적용후;

public class Bird extends Pet implements Flyer{

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

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
	

}
