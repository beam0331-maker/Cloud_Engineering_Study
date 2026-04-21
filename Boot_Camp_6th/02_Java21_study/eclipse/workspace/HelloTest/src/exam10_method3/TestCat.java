package exam10_method3;

public class TestCat {

	public static void main(String[] args) {
		
		Cat c = new Cat	("야옹이",200,"암컷");
		
		System.out.printf("이름:%s 나이:%d 성별:%s\n", c.getName(), c.getAge(),c.getGender());	
		
		c.setAge(300);
		
		System.out.printf("이름:%s 나이:%d 성별:%s\n", c.getName(), c.getAge(),c.getGender());
		
	}

}
