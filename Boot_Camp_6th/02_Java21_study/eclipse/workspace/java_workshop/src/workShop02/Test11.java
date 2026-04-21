package workShop02;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1.정수를 입력하세요");
		int n1 = sc.nextInt();

		System.out.println("2.정수를 입력하세요");
		int n2 = sc.nextInt();

		System.out.println("3.정수를 입력하세요");
		int n3 = sc.nextInt();

		int max = (n1 >= n2) ? (n1 >= n3) ? n1 : n3 : (n2 >= n3) ? n2 : n3;

		System.out.printf("정수 %d 과 정수 %d, 정수 %d 중에서 최대값: %d", n1, n2, n3, max);

		sc.close();
	}
}