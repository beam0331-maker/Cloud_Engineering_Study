package exam12_상속6_다형성2_동적타이핑;

public class TestEmployee2 {

	public static void main(String[] args) {
		// 실무에서 이런식으로 관리는 하는 경우는 드물다
		// Collection을 더 많이 사용한다.
		Employee[] e = { new Manager(), new Engineer(), new Engineer(), new Manager(), new Engineer() };

		// Engineer만 추출해서 c() 호출하자
		for (Employee em : e) {
			if (em instanceof Engineer) {
				// emp.c();
				Engineer eng = (Engineer) em;
				eng.c();
				// 한꺼번에 
				((Engineer)em).c();
			}

		}
	}
}
