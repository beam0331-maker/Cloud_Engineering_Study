package exam06_제어문;

public class Staement09_continue {

	public static void main(String[] args) {

		// hello 문자열 5번 출력

		for (int n = 1; n <= 5; n++) {

			if (n == 3)
				continue;
			System.out.println("hello" + n);
			System.out.println("world" + n);
			System.out.println("happy" + n);
		}
		System.out.println("end");

		System.out.println("====================");

		for (int n = 1; n <= 5; n++) {
			System.out.println("hello" + n);
			if (n == 3)
				continue;
			System.out.println("world" + n);
			System.out.println("happy" + n);
		}
		System.out.println("end");

	}

}
