package exam09_class3_this;

public class TestCat {

	public static void main(String[] args) {
		// 모든 데이터 알고 있는 경우
		Cat c1 = new Cat("야옹이",20,"암컷");
		Cat c2 = new Cat("야옹이2",3);

		System.out.println("---------");
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.gender);
		System.out.println("---------");
		System.out.println(c2.name);
		System.out.println(c2.age);
		System.out.println(c2.gender);

	}

}
