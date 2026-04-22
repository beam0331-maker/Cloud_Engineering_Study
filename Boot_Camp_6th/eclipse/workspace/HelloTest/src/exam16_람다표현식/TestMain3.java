package exam16_람다표현식;

//인터페이스
@FunctionalInterface
interface Flyer3 {
	public abstract void fly(int n, int n2);
}

public class TestMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 익명 클래스
		Flyer3 f = new Flyer3() {

			@Override
			public void fly(int n, int n2) {
				// TODO Auto-generated method stub
				System.out.println("f.fly()"+"\t" + n + "\t" + n2);
			}
		};
		f.fly(10,20);

		// 람다표현식 ( 자바: -> , 자바스크립트 : => )
		Flyer3 f2 = (n,n2) -> {
			System.out.println("람다.fly()"+"\t" + n + "\t" + n2);
		};
		f2.fly(10,20);

		Flyer3 f3 = (n, n2) -> System.out.println("람다2.fly()" + "\t" + n + "\t" + n2);
		f3.fly(10,20);

	}

}
