package workShop03;

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("피라미드 모양 삼각형");
		System.out.print("몇 단 삼각형입니까? : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		sc.close();

	}

}
