package app1;

public class CalcTest {

	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println("다시 입력해 주세요.");
			System.exit(0);
		}

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[2]);

		String cmd = args[1];
		Calculator cal = new Calculator();
		double result = 0;

		switch (cmd) {
		case "+":
			result = cal.plus(a, b);
			break;
		case "-":
			result = cal.minus(a, b);
			break;
		case "x":
			result = cal.multiplications(a, b);
			break;
		case "/":
			try {
				result = cal.dvide(a, b);
			} catch (ArithmeticException e) {
				System.out.println("Exception이 발생 하였습니다 . 다시 입력해 주세요");
			}
			break;
			
		}
		System.out.println("결과: " + result);	
	}

}
