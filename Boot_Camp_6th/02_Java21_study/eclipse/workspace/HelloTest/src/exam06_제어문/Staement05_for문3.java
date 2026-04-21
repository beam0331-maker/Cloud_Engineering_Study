package exam06_제어문;

public class Staement05_for문3 {

	public static void main(String[] args) {

		// hello 문자열 5번 출력

		// 한 번도 실행 안됨
		for (int n = 0; n > 4; n++) {
			System.out.println("Hello" + n);
		}
		
		// 무한 루프
		for (int n = 0;; n++) {
			System.out.println("Wordl" + n);
		}

	}

}
