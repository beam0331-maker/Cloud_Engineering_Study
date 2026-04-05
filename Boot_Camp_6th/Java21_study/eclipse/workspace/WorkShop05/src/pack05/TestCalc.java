package pack05;

public class TestCalc {

	public static void main(String[] args) {
		int input = Integer.parseInt(args[0]);
		
		if(input < 5 || input > 10) {
			System.out.println("다시 입력하세요");
		} else {
			 Calc calc = new Calc();
			System.out.println("결과: "+calc.calculate(input));
		}
		
	}

}
