package workShop02;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.정수를 입력하세요");		
		int n1 = sc.nextInt();
		
		System.out.println("2.정수를 입력하세요");
		int n2 = sc.nextInt();
		
		
		System.out.printf("정수 %d 과 정수 %d 의 합계: %d", n1, n2, n1+n2);
		
		sc.close();
	}
}