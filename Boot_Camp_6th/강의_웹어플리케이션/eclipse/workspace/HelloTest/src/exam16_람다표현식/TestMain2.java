package exam16_람다표현식;

//인터페이스
@FunctionalInterface
interface Flyer2{
	public abstract void fly(int n);	
}
public class TestMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 익명 클래스
		Flyer2 f = new Flyer2() {
			
			@Override
			public void fly(int n) {
				// TODO Auto-generated method stub
				System.out.println("f.fly()\t" + n);
			}
		};
		f.fly(10);
		
		// 람다표현식 ( 자바: -> , 자바스크립트 : => )
		Flyer2 f2 = n -> {System.out.println("람다.fly()\t" + n);};
		f2.fly(10);
		
		Flyer2 f3 = n -> System.out.println("람다2.fly()\t" + n);
		f3.fly(10);
		
		
		
		
		
		
	}

}
