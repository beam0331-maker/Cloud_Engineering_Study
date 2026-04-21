package exam12_상속6_다형성;

public class TestEmployee2 {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Manager("홍길동",2000,"인사");
		System.out.println(e);

		e = new Engineer("유관순",1800,"자바");
		
		System.out.println(e);

		


	}

}
