package workShop03;

public class Test21 {

	public static void main(String[] args) {

		for (int i = 0; i <= 90; i += 10) {
			for (int j = 1; j <= 10; j++) {
				int num = i+j;
				if(num<10)
					System.out.printf("%2d ",num);
				else
					System.out.print((num) + " ");				
				
			}
			System.out.println("");
		}

	}

}
