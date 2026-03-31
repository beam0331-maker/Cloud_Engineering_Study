package workShop03;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("보고싶은 곱셈표의 숫자를 입력: ");
		int n = sc.nextInt();
		
		System.out.println("---------- 곱셈표 ----------");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int mult = i*j;
				if(mult < 10) {
					System.out.printf("%2d ",mult);
				}else {
					System.out.printf("%d ",mult);
				}

			}
			System.out.println("");
		}

		sc.close();

	}

}
