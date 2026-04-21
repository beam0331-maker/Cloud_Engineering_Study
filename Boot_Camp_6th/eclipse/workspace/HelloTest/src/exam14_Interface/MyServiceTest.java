package exam14_Interface;

public class MyServiceTest {

	public static void main(String[] args) {
		
		// 객체 생성 불가
		// Myservice s = new Myservice();
		
		MyServiceImpl m = new MyServiceImpl();
		
		m.a();
		m.b();
		m.c();
		m.x();
		MyService.d();
		System.out.println(MyServiceImpl.NUM);
		System.out.println(MyServiceImpl.SIZE);
	}

}
