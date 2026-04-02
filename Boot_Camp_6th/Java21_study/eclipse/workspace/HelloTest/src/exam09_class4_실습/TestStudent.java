package exam09_class4_실습;



public class TestStudent {

	public static void main(String[] args) {
		
//		홍길동 20 서울
//		이순신 44 광주
//		유관순 18
		
		Student[]  mem = new Student[3];
		mem[0] = new Student("홍길동", 20,"서울");
		mem[1] = new Student("이순신", 44,"광주");
		mem[2] = new Student("유관순", 18);
		
		for(Student s : mem) {
			System.out.printf("이름:%s, 나이:%d, 주소:%s\n",s.name,s.age,s.address);
		}
		
				
		
		
	}

}
