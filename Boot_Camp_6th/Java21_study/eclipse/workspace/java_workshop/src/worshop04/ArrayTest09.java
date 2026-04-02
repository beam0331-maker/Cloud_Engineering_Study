package worshop04;


import java.util.Arrays;
import java.util.Random;


public class ArrayTest09 {

	public static void main(String[] args) {
		Random rand = new Random();		
		int[] arr3 = new int[5];
		Arrays.setAll(arr3, i -> rand.nextInt(10)+1);
		
		int sum = 0;		

		for (int n : arr3) {
			System.out.print(n + " ");
			sum += n;			
		}
		System.out.println("");
		System.out.println("sum = " + sum);
		System.out.printf("avg = %.1f", (float)sum / arr3.length);
		
	}

}
