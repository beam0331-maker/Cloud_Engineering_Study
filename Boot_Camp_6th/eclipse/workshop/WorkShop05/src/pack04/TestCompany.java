package pack04;


public class TestCompany {

	public static void main(String[] args) {
		double salary = Float.parseFloat(args[0]);
		Company c = new Company(salary);
		System.out.printf("연 기본금 합: %.1f 세후: %.1f\n",c.getIncome(),c.getAfterTaxIncome());
		System.out.printf("연 보너스 합: %.1f 세후: %.1f\n",c.getBonus(),c.getAfterTaxBonus());
		System.out.println("연 지급액 합: " + (c.getAfterTaxBonus()+c.getAfterTaxIncome()));
		
	}

}
