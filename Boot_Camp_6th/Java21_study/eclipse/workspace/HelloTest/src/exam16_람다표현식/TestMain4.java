package exam16_람다표현식;

//인터페이스
@FunctionalInterface
interface Flyer4{				
	public abstract String fly();				
}

public class TestMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 익명 클래스
		Flyer4 f = new Flyer4() {

			@Override
			public String fly() {
				// TODO Auto-generated method stub
				return "Hello";
			}
		};
		System.out.println(f.fly());		
		
		Flyer4 f2 = () -> "Hello";			
		System.out.println(f2.fly());			
	}

}
