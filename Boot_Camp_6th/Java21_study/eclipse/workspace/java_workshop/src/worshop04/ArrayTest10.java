package worshop04;

import java.util.Random;

public class ArrayTest10 {

	public static void main(String[] args) {
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		

		int inputA = Integer.parseInt(args[0]);
		int inputB = Integer.parseInt(args[1]);
		

		if (args.length != 2) {
			System.out.println("다시 입력 하세요.");
			System.exit(0);
		}
		
		for (String s : args) {			
			if (Integer.parseInt(s) < 1 || Integer.parseInt(s) > 5) {
				System.out.println("숫자를 확인 하세요");
				System.exit(0);
			}
				
		}
		
		
		
		int[][] arry = new int[inputA][inputB];
		int sum = 0;
		for (int i = 0; i < inputA; i++) {
			for (int j = 0; j < inputB; j++) {
				int n = rand.nextInt(5)+1;
				arry[i][j] = n;
				sum += n;
				sb.append(n).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);		
		System.out.printf("sum = %.1f \n",(float)sum);
		System.out.printf("avg = %.1f", (float)sum/(inputA*inputB));

	}

}
