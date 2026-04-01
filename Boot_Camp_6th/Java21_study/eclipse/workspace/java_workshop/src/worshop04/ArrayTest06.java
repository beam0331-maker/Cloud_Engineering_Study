package worshop04;


import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("키의 최댓값을 구합니다");
		System.out.print("사람 수 : ");
		int n = sc.nextInt();
		int[] height = new int[n];
		

		for (int idx = 0; idx < n; idx++) {
			System.out.printf("사람 수 %d : ", idx + 1);
			height[idx] = sc.nextInt();
		}
		Arrays.sort(height);
		
		System.out.println("최댓값은 " + height[height.length-1] + "입니다.");

//		System.out.println("total = " + sum);
//		System.out.printf("average = %.2f", (float) sum / count);
		
		sc.close();

	}

}
