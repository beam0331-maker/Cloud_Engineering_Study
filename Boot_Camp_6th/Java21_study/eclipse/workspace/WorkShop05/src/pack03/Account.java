package pack03;

public class Account {
	private String account;
	private int balance;
	private double interestRate;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public double calculateInterest() {
		return this.balance*this.interestRate/100;
	}

	public void deposit(int money) {
		this.balance += money;
	}

	public void withdraw(int money) {
		if (this.balance - money < 0) {
			System.out.println("출금 할 수 없습니다");
		}else {
			this.balance -= money;
			System.out.println("이자: " + this.balance);
		}
	}

	public String getAccount() {
		return account;
	}

	public int getBalance() {
		return balance;
	}
	
	

}
