package exam09_class;

import exam09_class.Cat;

public class TestCat {

	public static void main(String[] args) {
		// Cat 클래스를 메모리에 올림(객체생성)
				// 클래스명 변수명 = new 클래스명();
				Cat c1 = new Cat();
				System.out.println("---------");
				System.out.println(c1.name);
				System.out.println(c1.age);
				System.out.println(c1.gender);		
				// 실제값 저장
				c1.name = "야옹이";
				c1.age = 2;
				c1.gender = "암컷";
				
				System.out.println("---------");
				System.out.println(c1.name);
				System.out.println(c1.age);
				System.out.println(c1.gender);
				
				// 동작호출(메서드 호출)
				c1.eat();
				c1.cry();
				
				Cat c2 = new Cat();
				
				c2.name = "뭉치";
				c2.age = 1;
				c2.gender = "수컷";
				System.out.println("---------");
				System.out.println(c2.name);
				System.out.println(c2.age);
				System.out.println(c2.gender);
		
		
		
		

	}

}
