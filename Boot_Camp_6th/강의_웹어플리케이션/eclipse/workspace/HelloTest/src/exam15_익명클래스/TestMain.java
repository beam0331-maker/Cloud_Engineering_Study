package exam15_익명클래스;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다형성 적용한 이름 있는 클래스
		Flyer f = new Bird();
		f.fly();
		f.land();
		
		// 다형성 적용한 익명 클래스
		Flyer f2 = new Flyer() {
			
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("익명클래스.fly()");
			}

			@Override
			public void land() {
				// TODO Auto-generated method stub
				System.out.println("익명클래스.land()");
				
			}
		};
		
		f2.fly();
		f2.land();
		
	
		
		
		
		
	}

}
