package exam10_method2;

public class TestCat {

	public static void main(String[] args) {
		
		Cat c = new Cat	("야옹이",2,"암컷");
		
		System.out.printf("이름:%s 나이:%d 성별:%s\n", c.getName(), c.getAge(),c.getGender());
		
		System.out.println("-------------------");
		// c.name = 3; //접근불가
		
		c.setName("망치");
		System.out.printf("이름:%s 나이:%d 성별:%s\n", c.getName(), c.getAge(),c.getGender());
		
//		String name = c.getName();
//		int age= c.getAge();
//		String gender = c.getGender();
//		
//		System.out.println( );

	}

}
