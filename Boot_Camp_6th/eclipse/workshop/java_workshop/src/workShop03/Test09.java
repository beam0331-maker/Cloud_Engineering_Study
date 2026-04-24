package workShop03;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		System.out.println("세 정수의 최대값 구하기");
		System.out.printf("a 값: ");
		int a = sc.nextInt();
		System.out.printf("b 값: ");
		int b = sc.nextInt();
		System.out.printf("c 값: ");
		int c = sc.nextInt();

		int max = 0;

		if (a >= b && a >= c) {
			max = a;
		} else if (b >= a && b >= c) {
			max = b;
		} else if (c >= a && c >= b) {
			max = c;
		}

		System.out.println("최대값: " + max);

		sc.close();

	}

}
