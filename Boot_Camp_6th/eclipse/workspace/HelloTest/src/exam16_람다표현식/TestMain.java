package exam16_람다표현식;

//인터페이스
@FunctionalInterface
interface Flyer{
	public abstract void fly();	
}



public class TestMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 익명 클래스
		Flyer f = new Flyer() {
			
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("f.fly()");
			}
		};
		f.fly();
		
		// 람다표현식 ( 자바: -> , 자바스크립트 : => )
		Flyer f2 = () -> {System.out.println("f1.fly()");};
		f2.fly();
		
		Flyer f3 = () -> System.out.println("f1.fly()");
		f3.fly();
		
		
		
		
		
		
	}

}
