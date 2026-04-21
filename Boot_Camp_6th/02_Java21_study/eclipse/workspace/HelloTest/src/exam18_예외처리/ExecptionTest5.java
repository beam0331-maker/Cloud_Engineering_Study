package exam18_예외처리;

class Test {

	public void a() throws NullPointerException {
		b();
	}

	public void b() throws NullPointerException {

		throw new NullPointerException();

	}
}

public class ExecptionTest5 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");

		Test t = new Test();
		try {
			t.a();
		} catch (NullPointerException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

		System.out.println("프로그램 정상종료");

	} //end main

}
