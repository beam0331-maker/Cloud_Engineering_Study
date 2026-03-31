package exam07_배열;

public class ArrayTest01_1차원배열2 {

	public static void main(String[] args) {
		
		// 이름을 배열로 관리: 홍길동, 이순신, 유관순 관리하자.
		
		String[] name = new String[] {"홍길동","이순신","유관순"};
		
		for(int i = 0 ; i < name.length ; i++){
			System.out.printf("name[%d] = %s\n", i, name[i]);
		}
		
		

	}

}
