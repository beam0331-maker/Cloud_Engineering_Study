package exam12_상속4_오버라이딩;

public class TestEmployee {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager m = new Manager("홍길동",2000,"인사");
		Engineer eng = new Engineer("유관순",1800,"자바");
		
		System.out.println(m.getEmployee());	
		System.out.println(eng.getEmployee());
	

	}

}
