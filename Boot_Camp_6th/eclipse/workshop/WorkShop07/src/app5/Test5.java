package app5;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주소를 입력하시오");
		String address = sc.nextLine();
		String[] alpabets =  address.split("");
		String[] words = address.split(" ");
		
		System.out.println("문자 갯수(공백포함): " + alpabets.length);
		System.out.println("단어 갯수: " + words.length);
		

	}

}
