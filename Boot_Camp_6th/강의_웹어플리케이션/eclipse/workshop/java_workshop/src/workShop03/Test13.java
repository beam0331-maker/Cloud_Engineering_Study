package workShop03;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("2자리의 정수를 입력하시오");

		while (true) {
			System.out.print("입력: ");
			int n = sc.nextInt();
			if (n >= 10 && n <= 99) {
				System.out.println("입력값은 " + n);
				break;		
			}else {
				continue;
			}

		}

		sc.close();

	}

}
