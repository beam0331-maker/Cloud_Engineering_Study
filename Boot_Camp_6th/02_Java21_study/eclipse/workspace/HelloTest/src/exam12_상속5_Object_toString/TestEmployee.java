package exam12_상속5_Object_toString;

public class TestEmployee {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager m = new Manager("홍길동",2000,"인사");
		
		System.out.println(m.getEmployee());	// 홍길동	2000	인사

		System.out.println("---------");
			
		// 참조변수 출력
		System.out.println(m);	// 홍길동	2000	인사
		// Object의 toString()을 상속받아 사용한다.
		System.out.println(m.toString()); // 홍길동	2000	인사


	}

}
