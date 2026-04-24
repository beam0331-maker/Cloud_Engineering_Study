package pack03;

public class TestAccount {

	public static void main(String[] args) {
		
		Account account;
		account = new Account("441-0290-1203", 500000, 7.3);
		System.out.printf("계좌정보: %s 현재잔액: %d\n",account.getAccount(),account.getBalance());
		account.withdraw(600000);
		account.deposit(20000);
		System.out.printf("계좌정보: %s 현재잔액: %d\n",account.getAccount(),account.getBalance());
		System.out.printf("이자: %.1f", account.calculateInterest());		
		
	}

}
