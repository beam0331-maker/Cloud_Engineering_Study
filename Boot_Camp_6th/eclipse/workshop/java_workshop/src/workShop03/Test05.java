package workShop03;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int count = 0;
		int sum = 0;
		for(int i = 1 ; i<=num;i++) {
			if(i%2 == 0) {
				count++;
				sum += i;
			}
		}
		System.out.println("총합:" + sum);
		System.out.printf("평균값: %.1f", (float)sum/count);
		
		sc.close();
	}

}
