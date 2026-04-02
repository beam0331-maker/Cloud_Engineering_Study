package workShop02;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주소를 입력하시오");		
		String s1 = sc.next();
		String s2 = sc.next();		
		String s3 = sc.next();
		
		System.out.println("도명: " + s1);
		System.out.println("시명: " + s2);
		System.out.println("구명: " + s3);
		
		sc.close();
	}
}