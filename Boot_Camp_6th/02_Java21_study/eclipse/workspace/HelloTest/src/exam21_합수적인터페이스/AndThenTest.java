package exam21_합수적인터페이스;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class AndThenTest {

	public static void main(String[] args) {

		// Funciotn 및 Consumer 인터페이스 사용
		// 기능을 연결하는 andThen()

		// 1. Consumer 이용
		Consumer<String> c1 = s -> System.out.println("first 작업: " + s);
		Consumer<String> c2 = s -> System.out.println("second 작업: " + s);

		// 한번에 두가지 작업 처리
		Consumer<String> c3 = c1.andThen(c2);
		c3.accept("hello");

		// 2 Function 이용
		// 첫번째 Function의 리턴타입과 두번째 Funtion의 타입은 반드시 일치해야 한다.
		// ex. "hello"입력받아서 길이구하고, 길이에 +10 더하자.		
		
		Function<String, Integer> f1 = s -> s.length() ;
		Function<Integer, Integer> f2 = n -> n+10;
		Function<String, Integer> f3 = f1.andThen(f2);
		System.out.println(f3.apply("hello"));	
		
				
		
	}

}
