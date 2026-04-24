package workShop03;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= 100; i++) {
			sb.append(i);
			if(i%3 == 0) {
				sb.append(" ").append("foo");
			}
			
			if(i%5 == 0) {
				sb.append(" ").append("bar");
			}
			
			if(i%7 == 0) {
				sb.append(" ").append("baz");
			}
			sb.append("\n");			
		}
		
		System.out.println(sb);

		sc.close();

	}

}
