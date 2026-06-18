package workShop03;

public class Test22 {

	public static void main(String[] args) {

		char a = 'A';
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (a + j));
			}
			System.out.println("");
		}

	}

}
