package exam14_Interface2_추상클래스적용전;

public class Cat extends Pet {
	
	String color; // 색상

	public Cat() {
	}
	

	public void catEat() {}
	public void catSleep() {}
	
	
	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cat [color=" + color + ", name=" + name + ", age=" + age + "]";
	}
	

}
