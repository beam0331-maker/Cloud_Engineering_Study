package workShop03;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("한 자리 정수값을 입력하시오");
		int n = sc.nextInt();
		int count = 100 / n;
		int sum = 0;
		for (int i = n,c=0; i <= 100; i += n) {
			sum += i;
			c++;
			System.out.print(i);
			if (c != count) {
				System.out.print("+");
			}
		}
		System.out.println(" = "+ sum);

		sc.close();

	}

}
