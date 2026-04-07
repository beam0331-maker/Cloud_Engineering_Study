package pack04;

public class ShapeTest {

	public static void main(String[] args) {

		Triangle t1 = new Triangle(7, 5, "Blue");
		Rectangle r1 = new Rectangle(4, 6, "Blue");

		Triangle t2 = new Triangle(6, 7, "Red");
		Rectangle r2 = new Rectangle(8, 3, "Red");

		Triangle t3 = new Triangle(9, 8, "White");
		Rectangle r3 = new Rectangle(5, 7, "White");

		Shape[] arr = new Shape[] { t1, r1, t2, r2, t3, r3 };

		for (Shape s : arr)
			if (s instanceof Triangle)
				System.out.println("Triangle\t" + s.getArea() + "\t" + s.getColors());
			else
				System.out.println("Rectangle\t" + s.getArea() + "\t" + s.getColors());
		System.out.println("-----------------------------------------------------------");
		for (Shape s : arr)
			if (s instanceof Triangle) {
				((Triangle)s).setResize(5);
				System.out.println("Triangle\t" + s.getArea() + "\t" + s.getColors());
			}				
			else {
				((Rectangle)s).setResize(5);
				System.out.println("Rectangle\t" + s.getArea() + "\t" + s.getColors());
			}
				

	}

}
