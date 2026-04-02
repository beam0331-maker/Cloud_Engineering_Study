package worshop04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("키의 최댓값을 구합니다");
		System.out.print("사람 수 : ");
		int n = sc.nextInt();
		int[] heights = new int[n];
		

		for (int idx = 0; idx < n; idx++) {
			int height = rand.nextInt(100, 200);
			heights[idx] = height;
			System.out.printf("사람 수 %d : %d \n", idx + 1,height);			
		}
		Arrays.sort(heights);
		
		System.out.println("최댓값은 " + heights[n-1] + "입니다.");
		
		sc.close();

	}

}
