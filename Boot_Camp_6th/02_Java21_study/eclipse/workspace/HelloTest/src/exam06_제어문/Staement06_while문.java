package exam06_제어문;

public class Staement06_while문 {

	public static void main(String[] args) {

		// hello 문자열 5번 출력

		for (int n = 1; n <= 5; n++) {
			System.out.println("hello"+n);

		}
		System.out.println("===============================");

		int n2 = 1;
		while (n2 <= 5) {
			System.out.println("world" + n2);
			n2++;

		}

	}

}
