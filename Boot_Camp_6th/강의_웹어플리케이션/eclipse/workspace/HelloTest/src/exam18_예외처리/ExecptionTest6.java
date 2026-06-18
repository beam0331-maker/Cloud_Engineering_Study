package exam18_예외처리;

class Test2 {

	public void a() throws NullPointerException, ArithmeticException {
		b();
	}

	public void b() throws NullPointerException, ArithmeticException {
		// throws Exception으로 처리 가능 but 권장하지 않음
		
		// NullPointerException 발생가능성
		String s = null;
		System.out.println(s.length());

		// ArithmeticException
		int n = 0;
		int rsult = 10 / n;
		System.out.println(rsult);

	}
}

public class ExecptionTest6 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");

		Test2 t = new Test2();

		try {
			t.a();
		} catch (NullPointerException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("프로그램 정상종료");

	} // end main

}
