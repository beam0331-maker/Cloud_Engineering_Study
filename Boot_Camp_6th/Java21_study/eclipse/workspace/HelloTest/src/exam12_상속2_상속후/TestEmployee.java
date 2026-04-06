package exam12_상속2_상속후;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager m = new Manager("홍길동",2000,"인사");
		Engineer eng = new Engineer("유관순",1800,"자바");
		
		System.out.println(m.getManager());	
		System.out.println(eng.getEngineer());
		
		m.salary = 3000;
		System.out.println(m.name + "\t"+m.salary+"\t"+m.depart);	

	}

}
