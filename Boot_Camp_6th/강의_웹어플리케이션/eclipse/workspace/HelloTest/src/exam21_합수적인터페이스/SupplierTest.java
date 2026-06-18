package exam21_합수적인터페이스;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

/*

@FunctionalInterface
public interface Supplier<T>{
   T get();  // public abstract T get() 동일
} 

*/



public class SupplierTest {

	public static void main(String[] args) {
		
		// Supplier<T> : 리턴 T
		Supplier<String> s1 = new Supplier<String>() {
			
			@Override
			public String get() {
				// TODO Auto-generated method stub
				return "Supplier";
			}
		}; 
		
		System.out.println(s1.get());
		
		// 람다표현식
		Supplier<String> s2 = () -> "람다.Supplier";
		
		System.out.println(s2.get());
		
		
		// DoubleSupplier: return => double
		
		DoubleSupplier s3 = new DoubleSupplier() {
			
			@Override
			public double getAsDouble() {
				// TODO Auto-generated method stub
				return 3.14D;
			}
		};
		System.out.println("DoubleSupplier: " + s3.getAsDouble());
		
		DoubleSupplier s4 = () -> 3.14D;
		System.out.println("람다.DoubleSupplier: " + s4.getAsDouble());
		
		
	}

}
