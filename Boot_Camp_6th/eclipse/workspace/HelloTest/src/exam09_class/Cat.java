package exam09_class;


public class Cat { // 고양이객체

	// 구성요소 3가지
	// 1. 인스턴스변수(멤버변수)	// 고양이객체 속성
	String name;
	int age;
	String gender;
	
	// 2. 메서드(멤버메서드)		// 고양이객체 동작
	public void eat() {
		System.out.println("쩝쩝");
	}
	public void cry() {
		System.out.println("야옹~");
	}
	
	
	// 3. 생성자
//	Cat(String n, int a, String g){
//		this.name = n;
//		this.age = a;
//		this.gender = g;
//	}
	

}
