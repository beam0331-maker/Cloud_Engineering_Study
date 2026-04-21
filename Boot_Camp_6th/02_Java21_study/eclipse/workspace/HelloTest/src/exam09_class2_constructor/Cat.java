package exam09_class2_constructor;

public class Cat { // 고양이객체
	
	// 구성요소 3가지
	// 1. 인스턴스변수(멤버변수) // 고양이객체 속성
	private String name;
	private int age;
	private String gender;

	// 2. 메서드(멤버메서드) // 고양이객체 동작
	public void eat() {
		System.out.println("쩝쩝");
	}

	public void cry() {
		System.out.println("야옹~");
	}

	public void age() {
		System.out.println(this.age);
	}
	public void name() {
		System.out.println(this.name);
	}
	public void gender() {
		System.out.println(this.gender);
	}

	// 3. 생성자
	// 오버로딩(overloading) 생성자
	public Cat() {}
	
	public Cat(String s){
		name = s;
	}
	public Cat(String s, int n) {
		name = s;
		age = n;
	}
	
	public Cat(String s, int n, String s2) {		
		name = s;
		// age 검증가능
		if(n >=20) {
			System.out.println("나이값 오류");
		}else {
			age = n;	
		}
		
		gender = s2;
	
	}
}
