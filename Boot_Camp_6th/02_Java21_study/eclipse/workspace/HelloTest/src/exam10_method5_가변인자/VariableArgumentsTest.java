package exam10_method5_가변인자;

import java.util.Arrays;

class Test {
	public void a(int a) {
		
	}

	public void b(int ... a) { // 가변인자, 내부적으로 입력값을 배열로 관리
		System.out.println(Arrays.toString(a));
	}
}

public class VariableArgumentsTest {

	public static void main(String[] args) {
		Test t = new Test();
		t.b(1,2);
		t.b(1,2,3);
		t.b(1,2,3,4);
	}

}
