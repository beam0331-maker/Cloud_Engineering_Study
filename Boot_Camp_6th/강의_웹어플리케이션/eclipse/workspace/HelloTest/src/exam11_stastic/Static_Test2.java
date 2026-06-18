package exam11_stastic;

class Count{
	
	int num; // 인스턴스
	static int count;
	
	public Count() {
		num++;
		count++;
	}
	
	
}

public class Static_Test2 {

	public static void main(String[] args) {		
		
		// Count를 객채생성 시 생생횟수를 카운트하자.
		Count c1 = new Count();
		System.out.println(c1.num);
		System.out.println(c1.count);
		Count c2 = new Count();	
		System.out.println(c2.num);
		System.out.println(c2.count);
		
	}

}
