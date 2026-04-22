package exam05_scanner;

import java.util.Scanner;

public class ScnnerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		
				
		System.out.print("나이를 입력하세요: ");
		String name = sc.next();	
	
		System.out.println("age: " + age);
		System.out.println("name: " + name);
		
		sc.close();
	}

}
