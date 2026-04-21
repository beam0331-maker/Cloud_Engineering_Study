package pack08;

public class Coffee {
	
	private String name;
	private int price;
	public Coffee() {
		// TODO Auto-generated constructor stub
	}
	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String toString() {
		String info = String.join(" ", name, Integer.toString(price));
		return info;
	}
	
}
