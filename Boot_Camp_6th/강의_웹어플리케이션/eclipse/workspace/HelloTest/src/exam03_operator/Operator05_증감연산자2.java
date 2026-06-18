package exam03_operator;

public class Operator05_증감연산자2 {

	public static void main(String[] args) {

		// 증감 연산자와 다른 연산자와 같이 사용

		// 전치

		int n = 0;
		int result1 = ++n; // 먼저 증가하고 나중에 할당
		System.out.println(result1 + "\t" + n);

		// 후치
		int n2 = 10;
		int result2 = n2++; // 먼저 할당하고 나중에 증가
		System.out.println(result2 + "\t" + n);

	}

}
