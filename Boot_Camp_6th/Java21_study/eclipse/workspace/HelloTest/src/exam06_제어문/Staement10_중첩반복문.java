package exam06_제어문;

public class Staement10_중첩반복문 {

	public static void main(String[] args) {

		// 구구단

		for (int i = 2; i <= 9; i++) {
			System.out.println("===============");
			for (int j = 1; j <= 9; j++) {
				
				System.out.printf("%d X %d = %d \n",i,j,i*j);

			}
		}

	}

}
