package exam21_합수적인터페이스;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjDoubleConsumer;

/*
 * 
@FunctionalInterface
public interface Consumer<T>{
	void accept(T t);// public abstract void accept(T t)
}

*/

public class ConsumerTest {

	public static void main(String[] args) {

		// Consumer 인터페이스 사용

		// 익명 클래스
		Consumer<String> c = new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println("Consumer: " + s);

			}
		};
		c.accept("Hello");

		Consumer<String> c2 = s -> System.out.println("람다.Consumer: " + s);
		c2.accept("World");

		// BiConsumer: 파라미터 T,U
		BiConsumer<String, Integer> c3 = new BiConsumer<String, Integer>() {

			@Override
			public void accept(String s, Integer n) {
				System.out.println("BiConsumer: " + s + "\t " + n);
			}
		};
		c3.accept("홍길동", 10);	
		
		BiConsumer<String, Integer> c4 = (s,n) -> System.out.println("람다.BiConsumer: " + s + "\t " + n);
		c4.accept("홍길동", 10);
		
		
		// ObjDoubleConsumer<T> : 파라미터 T, double
		
		ObjDoubleConsumer<Float> c5 = new ObjDoubleConsumer<Float>() {
			
			@Override
			public void accept(Float f, double d) {
				System.out.println("ObjDoubleConsumer: " + f + "\t" + d);
				
			}
		};
		c5.accept(3.14F, 3.14D);
		
		ObjDoubleConsumer<Float> c6 = (f,d) -> System.out.println("람다.ObjDoubleConsumer: " + f + "\t" + d);
		c6.accept(3.14F, 3.14D);		
		
		
		
	}

}
