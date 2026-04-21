package exam02_Variable;

public class VariableTest02_변수선언2 {

	public static void main(String[] args) {

		// 변수선언과 초기화를 한번에
		String name = "홍길동";
		int age = 20;

		// 동일한 타입이 여러개인 변수
		int n = 0;
		int n2 = 10;
		int n3;
				
		// int n, n2 = 10, n3; 가독성이 떨어저 추천하지 않음. 
		
		System.out.println(n);
		// System.out.println(n3); 초기화 되지 않아 오류발생 
		

	}

}
