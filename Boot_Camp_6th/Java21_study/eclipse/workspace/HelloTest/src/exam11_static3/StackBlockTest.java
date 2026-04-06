package exam11_static3;

public class StackBlockTest {
	
	// static 블럭
	static {
		// 순차문, 제어문 사용 가능
		int n = 10;
		System.out.println(n);
	}
	
	static {
		System.out.println("static 블럭");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
