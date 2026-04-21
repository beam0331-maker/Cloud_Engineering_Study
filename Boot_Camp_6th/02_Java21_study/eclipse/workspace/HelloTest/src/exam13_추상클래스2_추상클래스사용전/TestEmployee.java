package exam13_추상클래스2_추상클래스사용전;

public class TestEmployee {

	public static void main(String[] args) {
		Manager m = new Manager(null, 0, null);
		Engineer e = new Engineer(null, 0, null);
		
		System.out.println(m.getEmployee());
		System.out.println(e.getEmployee());
		
	}

}
