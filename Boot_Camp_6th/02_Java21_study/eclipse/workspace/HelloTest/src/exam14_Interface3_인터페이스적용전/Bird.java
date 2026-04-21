package exam14_Interface3_인터페이스적용전;

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
	
	public void birdFly() {}

}
