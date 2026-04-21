package exam12_상속6_다형성;

public class TestEmployee4 {

	public static void method(double d) {
	}

	// 참조형 데이터를 저장하는 파라미터 가진 메서드( Employee한정 )
	public static void method2(Employee e) {
	}

	// 참조형 데이터를 저장하는 파라미터 가진 메서드( 모든 데이터 )
	public static void method3(Object o) {
	}

	public static void main(String[] args) {
		// 다형성이 적용된 방식

		// 2. 메서드 파라미터 타입( ************* )

		// 기본형

		method(10);
		method(3.14f);
		method(3.14d);

		// 참조형
		method2(new Employee("홍길동", 2000));
		method2(new Engineer("이순신", 4300, "자바"));
		method2(new Manager("유관순", 4000, "관리"));
		
		method3(10);		
		method3("Hello");
		method3(20);
		method3(3.14 );
		method3(new Employee("홍길동",2000));
	}

}
