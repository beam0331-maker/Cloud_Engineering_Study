package exam07_배열;

public class ArrayTest01_1차원배열3 {

	public static void main(String[] args) {
		
		// 리터럴 방법
		
		int[] num = {10,20,30};
		String[] names = {"홍길동","이순신"};
		
		System.out.println(num.length);
		System.out.println(names.length);
		
		System.out.println(num[0] +"\t" +names[0]);
		
		num[0] = 100;
		names[1] = "유관순";
		
		for(int n :num) {
			System.out.println(n);
		}
	
		for(String s: names) {
			System.out.println(s);
		}

	}

}
