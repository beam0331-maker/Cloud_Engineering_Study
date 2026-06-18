package exam12_상속6_다형성;

public class TestEmployee3 {

	public static void main(String[] args) {
		// 다형성이 적용된 방식

		// 1. 배열의 활용

//		Employee e1 = new Employee("홍길동", 2000);
//		Employee e2 = new Engineer("홍길동", 2000, "자바");
//		Employee e3 = new Manager("홍길동", 2000, "인사");
//		Employee[] emp = { e1, e2, e3 };
		Employee[] emp = { new Employee("홍길동", 2000), new Engineer("이순신", 4300, "자바"), new Manager("유관순", 4000, "관리") };

		for (Employee e : emp) {
			System.out.println(e);
		}

		Object[] obj = { new Employee("홍길동", 2000), new Engineer("이순신", 4300, "자바"), new Manager("유관순", 4000, "관리"),
				"Hello", 20, 3.14 };

		for (Object o : obj) {
			System.out.println(o);
		}

	}

}
