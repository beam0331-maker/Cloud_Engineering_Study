package exam18_예외처리;

// 계좌
class Account{
	
	int balance = 100; // 잔고

	// 출금
	public void withdraw(int  amt) throws InSufficentBalaceException {
		if(balance >= amt) {
			balance -= amt;
		}else {
			//잔액부족인 경우 시스템은 예외라고 인식 안함. 
			// 하지만 개발자는 예외라고 가정할 수 있기 때문에 명시적 예외발생 필요.
			throw new InSufficentBalaceException("잔액부족으로 예외발생");
		}
	}
	
}

public class ExecptionTest7 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Account acct = new Account();

		
		try {
			acct.withdraw(50);
			acct.withdraw(500);
		} catch (InSufficentBalaceException e) {
			System.out.println(e.getMessage()); // throw의 예외클래스에서 작성된 문자열을 콘솔에 표현한다
												// => "잔액부족으로 예외발생"
		}
		
		
		System.out.println("프로그램 장상종료");
	} // end main

}
