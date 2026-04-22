package exam10_method;

public class Method {
	// 1. 파라미터 없고 리턴값 없는 경우

	public void method() {
		System.out.println("method");
	}

	// 2. 파라미터 있고 리턴값 없는 경우
	public void method2(int n, String s) {
		System.out.printf("method2 %d %s\n", n, s);
	}

	// 3. 파라미터 없고 리턴값 있는 경우
	public int method3() {
		System.out.println("method3");
		return 100;
	}

	// 4. 파라미터 있고 리턴값 있는 경우
	public int metho4(int n, int n2) {
		System.out.printf("method4 %d %d \n",n ,n2);
		return n + n2;	

	}
	
	public void a(){}
//	publc int a(){} // 오류발생 식별이 호출할때 리턴의 방식의 식별이 불가능
	public void a(int n){}
	public void a(String s){}
	public void a(intn n, String s){}
	public void a(String s, int n){}
}
