package workShop03;

//import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		for(int i = 1 ; i<= 20 ; i++) {
			if(i%2 != 0 && i%3 != 0 )
				sum +=i;
		}
		System.out.println("sum = " + sum);
	}

}
