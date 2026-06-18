// default 패키지

import p1.MyHello;

public class MyHelloTest {

	public static void main(String[] args) {
		
		// 1. import없이 직접 지정
		// MyHello를 여러번 생성할때 효율이 떨어진다.
		p1.MyHello	h = new p1.MyHello();
		h.method();
		
		// 2. import 사용


		MyHello h1 = new MyHello();
		h1.method();
		
	}

}
