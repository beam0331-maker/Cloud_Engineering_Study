package pack02;

public class Book {

	private String bookNmae;
	private int bookPrice;
	private double bookDiscountRate;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookNmae, int bookPrice, double bookDiscountRate) {
		this.bookNmae = bookNmae;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}

	public double getDiscountBookPrice() {
		return this.bookPrice*(1-this.bookDiscountRate/100);
	}

	public String getBookNmae() {
		return bookNmae;
	}

	public void setBookNmae(String bookNmae) {
		this.bookNmae = bookNmae;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}

}
