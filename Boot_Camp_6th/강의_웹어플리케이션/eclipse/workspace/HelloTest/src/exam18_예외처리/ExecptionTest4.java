package exam18_예외처리;

public class ExecptionTest4 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");

		try {
			int n = 1;
			int result = 10 / n;
			System.out.println("결과: " + result);
			// NullPointerExcepiton  발생 가능성
			String s = null;
//			System.out.println(s.length());
			
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누어서 예외발생 " + e.getMessage()); // 
		}catch (NullPointerException e) {
			System.out.println("개체 생성없이 메서드 호출해서 예외발생 " + e.getMessage());
		}catch (Exception e) {
			System.out.println("포괄적인 예외처리용-예외발생 "+ e.getMessage());
		}finally {
			 System.out.println("반드시 실행되는 문장임");
		}
		
		// 예외처리 목적이 아님
		try {
			int x= 10;
			System.out.println(x);
			
		} finally {
			System.out.println("catch 없이 finally가능. 반드시 실행되는 문장임");
		} 
		
		System.out.println("프로그램 정상종료");

	}

}
