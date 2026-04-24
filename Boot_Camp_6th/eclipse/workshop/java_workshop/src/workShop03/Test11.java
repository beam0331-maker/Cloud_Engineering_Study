package workShop03;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		System.out.print("a의 값: ");
		int a = sc.nextInt();

		while (true) {

			System.out.print("b의 값: ");
			int b = sc.nextInt();
			if (b > a) {
				System.out.println("b - a는 " + (b - a) + "입니다.");
				break;
			} else {
				System.out.println("a보다 큰 값을 입력하세요!");
				continue;

			}

		}

		sc.close();

	}

}
