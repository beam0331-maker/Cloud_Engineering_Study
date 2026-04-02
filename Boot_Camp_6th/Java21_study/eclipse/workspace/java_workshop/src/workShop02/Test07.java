package workShop02;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.이름을 입력하세요");		
		String name = sc.next();
		
		System.out.println("2.나이을 입력하세요");
		int age = sc.nextInt();
		
		
		System.out.printf("이름은 %s, 나이는 %d 입니다", name, age);
		
		sc.close();
	}
}