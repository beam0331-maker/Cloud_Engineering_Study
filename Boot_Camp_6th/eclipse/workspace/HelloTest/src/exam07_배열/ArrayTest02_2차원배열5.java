package exam07_배열;

public class ArrayTest02_2차원배열5 {

	public static void main(String[] args) {

		// 2차원 배열 ( 리터럴 )

		// 정방형
		int[][] num = new int[][] { { 1, 2 }, { 3, 4 } };

		for (int[] n : num) { // 행반복
			for (int m : n) // 열반복
				System.out.print(m);
			System.out.println("");
		}

	}

}
