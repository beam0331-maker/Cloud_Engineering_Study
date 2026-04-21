package exam06_제어문;

import java.util.Scanner;

public class Staement03_다중if문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		System.out.print("학점을 입력하세요: ");
		int grade = sc.nextInt();
		
		if (90<=grade) {
			System.out.println("A 학점");
		} else if (80 <= grade) {
			System.out.println("B 학점");
		} else if (70 <= grade) {
			System.out.println("C 학점");
		} else {
			System.out.println("F 학점");
		}
		
		
//		if (grade >= 90) {
//			System.out.println("A 학점");
//		} else if (80 <= grade && grade <= 89) {
//			System.out.println("B 학점");
//		} else if (70 <= grade && grade <= 79) {
//			System.out.println("C 학점");
//		} else {
//			System.out.println("F 학점");
//		}
//		
		sc.close();
		

	}

}
