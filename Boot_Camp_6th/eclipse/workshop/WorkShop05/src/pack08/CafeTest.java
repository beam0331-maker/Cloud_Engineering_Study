package pack08;

public class CafeTest {

	public static void main(String[] args) {

		Cafe cafe = new Cafe();
		cafe.setCoffee(new Coffee("Americano", 4000));
		cafe.setCoffee(new Coffee("Caffelatte", 5000));
		cafe.setCoffee(new Coffee("Macchiato", 6000));

		Coffee[] coffeeList = cafe.getCoffeList();

		for (int i = 0; i < coffeeList.length; i++) {
			System.out.println(coffeeList[i].toString());			
		}

		System.out.println("\ncoffee 가격의 합: " + cafe.totalPrice() + "원");

	}

}
