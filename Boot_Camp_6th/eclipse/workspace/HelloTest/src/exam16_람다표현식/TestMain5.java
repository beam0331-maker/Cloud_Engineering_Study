package exam16_람다표현식;

//인터페이스
@FunctionalInterface
interface Flyer5 {
	public abstract int fly(int n, int n2);
}

public class TestMain5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 익명 클래스
		Flyer5 f = new Flyer5() {
			@Override

			public int fly(int n, int n2) {
				return n + n2;
			}
		};
		System.out.println(f.fly(10, 20));

		Flyer5 f2 = (int n, int n2) -> {
			return n + n2;
		};
		System.out.println(f2.fly(10, 20));

		Flyer5 f3 = (n, n2) -> {
			return n + n2;
		};
		System.out.println(f3.fly(10, 20));

		Flyer5 f4 = (n, n2) -> n * n2;
		System.out.println(f4.fly(10, 20));
	}

}
