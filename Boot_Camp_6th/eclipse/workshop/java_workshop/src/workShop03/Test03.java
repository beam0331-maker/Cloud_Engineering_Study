package workShop03;

//import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);

		int i = 0;
		while (i <= 10) {
			int j = 0;

			while (j <= i) {
				System.out.print("*");

				j++;
			}
			System.out.println();

			i++;
		}

	}

}
