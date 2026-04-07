package exam13_추상클래스;

public abstract class AbstractClass {
	
	// 구성 요소 4가지
	int num;
	public void a() {
		System.out.println("a method");
	}
	public AbstractClass() {}
	
	// 추상메서드
	public abstract void b();
	public abstract void c();
	
	
}
