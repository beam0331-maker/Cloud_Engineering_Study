package pack02;

public class BookTest {

	public static void main(String[] args) {
 
		Book b1 = new Book();
		b1.setBookNmae("SQL Plus");
		b1.setBookPrice(50000);
		b1.setBookDiscountRate(5.0);
		System.out.printf("%s %d원 %.1f%% %.1f원\n",b1.getBookNmae(),b1.getBookPrice(),b1.getBookDiscountRate(),b1.getDiscountBookPrice());
		
		Book b2 = new Book();
		b2.setBookNmae("Java 2.0");
		b2.setBookPrice(40000);
		b2.setBookDiscountRate(3.0);
		System.out.printf("%s %d원 %.1f%% %.1f원\n",b2.getBookNmae(),b2.getBookPrice(),b2.getBookDiscountRate(),b2.getDiscountBookPrice());
		
		Book b3 = new Book();
		b3.setBookNmae("JSP Servlet");
		b3.setBookPrice(60000);
		b3.setBookDiscountRate(6.0);
		System.out.printf("%s %d원 %.1f%% %.1f원\n",b1.getBookNmae(),b3.getBookPrice(),b3.getBookDiscountRate(),b3.getDiscountBookPrice());
	
	}

}
