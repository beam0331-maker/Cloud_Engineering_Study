package pack04;

public class Company {

	private double salary;
	private double income;
	private double afterTaxIncome;
	private double bonus = 20;
	private double afterTaxBonus;

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(double salary) {
		this.salary = salary; 
	}

	public double getIncome() {
		return this.salary * 12;
	}

	public double getAfterTaxIncome() {
		return getIncome() * 0.9;
	}

	public double getBonus() {
		return this.salary * 0.2 * 4;
	}

	public double getAfterTaxBonus() {
		return getBonus()*0.945;
	}

}
