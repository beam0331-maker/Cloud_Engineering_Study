package exam11_stastic;

class Test{
	
	int num =10;			// 인스턴스 변수
	static int size = 20;	// static 변수
	
	public void print_num() {	// 일반 메서드
		System.out.println(num);		
		System.out.println(size);	// static 변수가 먼저 생성되었으므로 접근 가능
	}
	
	public static void print_size() {	// static 메서드
	//	System.out.println(num);	// 오류 -> print_size의 생성시점에서 num은 생성되지 않음
//		System.out.println(this);	// 오류 -> print_size의 생성시점에서 this는 생성되지 않음 ==> method 영역과 heap 영역의 차이
		System.out.println(size);		
	}
	// 생성자
	public Test() {}
	
}// end Test

public class Static_Test {

	public static void main(String[] args) {		
		
		System.out.println(Test.size);
		Test.print_size();
		
		// new
		Test t = new Test();
		System.out.println(t.num);
		t.print_num();
		
	}

}
