package exam06_제어문;

import java.util.Scanner;

public class Staement07_do_while문3 {

	public static void main(String[] args) {

		// hello 문자열 5번 출력

		for (int n = 1; n <= 5; n++) {
			System.out.println("hello"+n);

		}
		System.out.println("===============================");

		int n2 = 1;
		while (n2 <= 5) {
			System.out.println("world" + n2);
			n2++;
			
		System.out.println("===============================");
		
		int n3 = 1;
		do {
			System.out.println("happy" + n3);
			n3++;
			
		}while(n3 <=5);

		}
	} // main
} // end class
