package exam06_제어문;

public class Staement08_break {

	public static void main(String[] args) {

		// hello 문자열 5번 출력
		
		for (int n = 0; n <= 5; n++) {
			if (n == 4)	break;
			System.out.println("hello" + n);
		}
		System.out.println("END");
		
		
		

	}

}
