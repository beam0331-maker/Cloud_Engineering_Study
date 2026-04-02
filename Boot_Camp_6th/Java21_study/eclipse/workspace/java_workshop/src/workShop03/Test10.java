package workShop03;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		System.out.println("1부터 n까지의 총합 구하기");

		while (true) {
			int sum = 0;
			System.out.print("n 값: ");
			int n = sc.nextInt();
			if (n > 0) {
				for (int i = 1; i <= n; i++) {
					sum += i;
				}
				System.out.printf("1부터 %d까지의 총합: %d", n, sum);
				break;
			}

		}
		sc.close();
	}

}
