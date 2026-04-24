package workShop03;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		System.out.println("양의 정수값의 자릿수 구하기");
		while (true) {

			
			System.out.print("정수값: ");			
			int a = sc.nextInt();
			if (a > 0) {
				int c = 0;
				int d = 1;
				while(a!=0){					
					c++;					
					a /=10 ;
				}			
				System.out.printf("그 수는 %d자리 입니다",c);
				break;
				
			}else if(a<0) {
				continue;
			}

		}

		sc.close();

	}

}
