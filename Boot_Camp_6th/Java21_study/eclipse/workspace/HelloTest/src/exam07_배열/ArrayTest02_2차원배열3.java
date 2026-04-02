package exam07_배열;

public class ArrayTest02_2차원배열3 {

	public static void main(String[] args) {

		// 2차원 배열 ( 비정방형 모두 가능 )	
		
		// 1. 배열선언
		int[][] num;

		// 2. 행 생성
		num = new int[3][]; // [행크기][열크기]

		// 3. 열 생성( 자동초기화)
		num[0] = new int[1];
		num[1] = new int[2];
		num[2] = new int[3];


		// 4. 초기화
		num[0][0] = 1;
		
		num[1][0] = 2;
		num[1][1] = 3;
		
		num[2][0] = 4;
		num[2][1] = 5;
		num[2][2] = 6;

		// 5. 출력
		for (int i = 0; i < num.length; i++) { // 행 반복
			for (int j = 0; j < num[i].length; j++) { // 열 반복
				System.out.println(num[i][j]);
			}
		}
		System.out.println("----------------------------");

		for (int[] n : num) { // 행반복
			for (int m : n) // 열반복
				System.out.println(m);
		}

		System.out.println("행의 길이: " + num.length);
		System.out.println("1행의 길이: " + num[0].length);
		System.out.println("2행의 길이: " + num[1].length);
		System.out.println("3행의 길이: " + num[2].length);
	}

}
