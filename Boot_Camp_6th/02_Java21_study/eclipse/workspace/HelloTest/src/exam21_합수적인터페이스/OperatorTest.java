package exam21_합수적인터페이스;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

/*
 
@FunctionalInterface
public interface BinaryOperator<T> {
	T apply(T t, T u) // public abstract T apply(T t, T u)
}

*/
public class OperatorTest {

	public static void main(String[] args) {

		// Operator 인터페이스 사용
		BinaryOperator<String> x = new BinaryOperator<String>() {
			
			@Override
			public String apply(String t, String u) {

				return t + "\t" + u;
			}
		};
		
		System.out.println("BinaryOperator: " + x.apply("Hello", "world"));
		BinaryOperator<String> x2 = (t, u) -> t + "\t" + u ;
		
		System.out.println("람다.BinaryOperator: " + x2.apply("Hello", "world"));
	
		IntUnaryOperator x3 = new IntUnaryOperator() {
			
			@Override
			public int applyAsInt(int x) {
				return x+100;
			}
		};
		System.out.println("IntUnaryOperator: " + x3.applyAsInt(100));
		IntUnaryOperator x4 = n -> n+100;
		System.out.println("람다.IntUnaryOperator: " + x4.applyAsInt(100));
		
		
		
		
		
		
			
	}

}
