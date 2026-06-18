package exam21_합수적인터페이스;

import java.util.function.Function;

/*
 
@FunctionalInterface
public interface Function<T,R> {
	R apply(T t) // public abstract R apply(T t)
}

*/
public class FunctionTest {

	public static void main(String[] args) {

		// Function 인터페이스 사용
		Function<String, Integer> f1 = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return t.length();
			}
		};
		
		System.out.println("Function: " + f1.apply("Hello"));
		
		
		Function<String, Integer> f2 = (s) -> s.length();	
		System.out.println("람다.Function: " + f2.apply("Hello"));
		
			
	}

}
