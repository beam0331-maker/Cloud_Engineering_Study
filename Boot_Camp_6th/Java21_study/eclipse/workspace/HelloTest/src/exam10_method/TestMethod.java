package exam10_method;

public class TestMethod {

	public static void main(String[] args) {

		// 객체 생성
		Method m = new Method();
		
		m.method();
		m.method2(0, null);
		
		int num1 =  m.method3();
		System.out.println("리턴값: " + num1);
		
		int num2 = m.metho4(0, 0);
		System.out.println("리턴값; " + num2);
		
	
		
	}

}
