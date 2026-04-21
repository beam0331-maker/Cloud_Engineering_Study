package exam12_상속6_다형성2_동적타이핑;

public class TestEmployee {
		
		public static void main(String[] args) {
			
			// 동적타이핑을 적용안한 경우
			Manager m = new Manager();
			m.a();
			Employee em = new Employee();
			em.a();
			
			// 동적타이핑
			Employee e = new Manager();
			e.a();
			// 부모 클래스로 생성된 자식 클래스는
			// 부모 클래스에서 오버라이딩된 메서드만 사용가능.
			// e.b()
			// e.name
			Manager m1 = (Manager)e;
			m1.b();
			
	}

}
