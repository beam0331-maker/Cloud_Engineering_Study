package pack08;

public class Cafe {
	
	private Coffee[] coffeList = new Coffee[3];
	private int index;
	public Cafe() {
		// TODO Auto-generated constructor stub
	}

	public int totalPrice() {
		int result = 0;
		for(int i = 0 ; i < coffeList.length ; i++) {
			result += coffeList[i].getPrice();
		}		
		return result;
	}

	public void setCoffee(Coffee coffee) {
		
		if(index <3) {
			coffeList[index] = coffee;
			index++;
		} else {
			System.out.println("더 이상 저장 할 수 없습니다.");
		}	
		
	}	
	
	public Coffee[] getCoffeList() {
		return coffeList;
	}
	
	

	
	
}
