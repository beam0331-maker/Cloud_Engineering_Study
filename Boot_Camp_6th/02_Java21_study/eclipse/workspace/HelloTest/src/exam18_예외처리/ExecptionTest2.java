package exam18_예외처리;

public class ExecptionTest2 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");

		try {
			int n = 0;
			int result = 10 / n;
			System.out.println("결과: " + result);
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누어 예외발생");
		}

	}

}
