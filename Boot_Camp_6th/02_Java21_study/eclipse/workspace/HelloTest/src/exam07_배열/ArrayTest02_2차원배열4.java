package exam07_배열;

public class ArrayTest02_2차원배열4 {

	public static void main(String[] args) {

		// 2차원 배열 ( 리터럴 )

		// 정방형
		int[][] num = { { 1, 2 }, { 3, 4 } };

		for (int i = 0; i < num.length; i++) { // 행 반복
			for (int j = 0; j < num[i].length; j++) { // 열 반복
				System.out.print(num[i][j]);
			}
			System.out.println("");
		}
		System.out.println("----------------------------");

		// 비정방형
		int[][] num2 ={ { 1 }, { 2, 3 }, { 4, 5, 6 } };

		for (int[] n : num2) { // 행반복
			for (int m : n) // 열반복
				System.out.print(m);
			System.out.println("");
		}

	}

}
