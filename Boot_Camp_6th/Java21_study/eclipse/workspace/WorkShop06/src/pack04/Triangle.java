package pack04;

public class Triangle extends Shape implements Resize {
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void setResize(int size) {
		// TODO Auto-generated method stub
		setHeight(getHeight()+size);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (double)getWidth()*getHeight()/2;
	}
	
	
}
