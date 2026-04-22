package app2;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account;
		account = new Account("441-0290-1203", 500000,7.3);
		try {
			account.deposit(-10);
		} catch (AccountException e) {
			System.out.println(e.getMessage());
		}
		try {
			account.withdraw(600000);
		} catch (AccountException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("이자: " + account.calculateInterest());
		
	}

}
