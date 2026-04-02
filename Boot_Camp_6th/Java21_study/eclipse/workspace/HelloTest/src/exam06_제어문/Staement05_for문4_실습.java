package exam06_제어문;

public class Staement05_for문4_실습 {

	public static void main(String[] args) {

		// 문제1: 1~2-까지 반복하는데 짝수값만 출력하시오.
		for (int i = 1; i < 21; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}

		System.out.println("========");
		
		// 문제2: 1~20까지 반복하는데 3의 배수만 출려하시오.
		for (int i = 1; i < 21; i++) {
			if (i % 3 == 0)
				System.out.println(i);
		}
		// 문제3: 1~20까지 반복해서 총합을 출력하시오.		
		System.out.println("========");
		
		int result1 = 0;
		for (int i = 1; i < 21; i++) {
			result1 += i; // result1 = result1 + i;
		}
		System.out.println(result1);
		
		// 문제3: 1~20까지 반복해서 짝수값의총합을 출력하시오.
		
		int result2 = 0;
		System.out.println("========");

		for (int i = 1; i < 21; i++) {
			if (i % 2 == 0) {
				result2 += i;
			}
		}
		System.out.println(result2);


	}

}
