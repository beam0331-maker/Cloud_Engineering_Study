package workShop03;

import java.util.Scanner;

public class Test20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("보너스 및 월급 구하기");
		System.out.print("근무시간입력 : ");
		int time = sc.nextInt();
		System.out.print("월급입력 : ");
		int pay = sc.nextInt();
		System.out.println("====================");
		
		double bonus = 0;
		
		if(time >= 25) {
			bonus = pay;			
		}else if(time >= 20) {
			bonus = pay*0.8;	
		}else if(time >= 18) {
			bonus = pay/2;	
		}

		System.out.println("보너스 : " + (int)bonus);
		System.out.println("지급될 급여 : " + (int)(bonus+pay));

		sc.close();

	}

}
