package exam07_배열;

import java.util.Arrays;

public class ArrayTest03_commane_line_arguments2 {

	public static void main(String[] args) {

		// 실행시 command line argument로 정수값을 입력받아
		// 입력받은 정수값만큼 반복해서 hello 출력하시오
		// int num = Integer.parseInt();
		
		
		int n = Integer.parseInt(args[0]);

		for (int i = 1; i <= n; i++) {
			System.out.println("hello: " + i);
		}

		System.out.println("end");

	}

}
