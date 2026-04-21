package exam21_합수적인터페이스;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/*
 
@FunctionalInterface
public interface BinaryOperator<T> {
	T apply(T t, T u) // public abstract T apply(T t, T u)
}

*/
public class PredicateTest {

	public static void main(String[] args) {

		// Predicate 인터페이스 사용
		Predicate<String> p = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.length() ==3;
				
			}
		};
		
		boolean resutl = p.test("홍길동");
		System.out.println("PredicateTest.test: " + resutl);
		
		Predicate<String> p2 = s -> s.length() == 3;
		System.out.println("람다.test: " + p2.test("가나다라"));
		
		BiPredicate<String, Integer> p3 = new BiPredicate<String, Integer>() {
			
			@Override
			public boolean test(String s, Integer n) {
					
				return s.charAt(n) == '홍';
			}
		};
		
		System.out.println(p3.test("홍길동", 0));
		
		BiPredicate<String, Integer> p4 = (s,n) -> s.charAt(n) == '홍';		
		System.out.println(p4.test("홍길동", 0));
		
		
		
			
	}

}
