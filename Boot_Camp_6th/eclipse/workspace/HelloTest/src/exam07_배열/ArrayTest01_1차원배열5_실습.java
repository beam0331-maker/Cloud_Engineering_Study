package exam07_배열;


public class ArrayTest01_1차원배열5_실습 {

	public static void main(String[] args) {

		// 실습1 : 제공된 배열의 총합을 구하시오
		int[] num = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int n : num) {
			sum += n;
		}

		System.out.println("총합 : " + sum);
		System.out.println("-----------------");

		// 실습2: 제공된 이름중 글자수가 2글자인 인원수 출력하시오
		String[] name = { "홍길동", "세조", "정조", "단종", "박혁거세" };
		StringBuilder sb = new StringBuilder();
		
		int count = 0;
		for (String s : name) {
			if (s.length() == 2)
				sb.append(s).append(" ");
				count++;
		}

		System.out.println("원원수 : " + count);
		System.out.println("이름 : " + sb);
		

	}

}
