package exam21_합수적인터페이스;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

class Test {
	public static int method(int x, int y) {
		return x + y;
	}

	public int method2(int x) {
		return x + 100;
	}

	public Test() {
	}

	public Test(int x) {
		System.out.println("Test(int): " + x);
	}

}

public class MethodReferenceTest {

	public static void main(String[] args) {

		// Method Reference ( 메서드 참조 )
		BinaryOperator<Integer> x = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer n, Integer n2) {
				return Test.method(n, n2);
			}
		};

		System.out.println(x.apply(10, 20));

		// 람다표현식
		// 1. static 메서드 축약: static 메서드: 클래스:: 메서드명
		BinaryOperator<Integer> x2 = (n, n2) -> Test.method(n, n2);
		System.out.println(x2.apply(10, 20));

		BinaryOperator<Integer> x3 = Test::method;
		System.out.println(x3.apply(10, 20));

		Function<String, Integer> f = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				return Integer.parseInt(t);
			}
		};
		System.out.println(f.apply("100"));

		// 람다표현식
		Function<String, Integer> f2 = s -> Integer.parseInt(s);
		System.out.println(f2.apply("100"));

		Function<String, Integer> f3 = Integer::parseInt;
		System.out.println(f3.apply("100"));

		// 2. 인스턴스 메서드:
		Test t = new Test();
		UnaryOperator<Integer> op = new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer n) {
				// TODO Auto-generated method stub
				return t.method2(n);
			}
		};

		System.out.println(op.apply(100));

		// 람다표현식
		UnaryOperator<Integer> op2 = n -> t.method2(n);
		System.out.println(op2.apply(200));
		UnaryOperator<Integer> op3 = t::method2;
		System.out.println(op3.apply(300));

		// 문자열관련 메서드 - 대문자로 반환

		UnaryOperator<String> op4 = new UnaryOperator<String>() {

			@Override
			public String apply(String s) {
				// TODO Auto-generated method stub
				return s.toUpperCase();
			}
		};

		// 람다표현식
		UnaryOperator<String> op5 = s -> s.toUpperCase();

		// 축약식표현 - String::메서드
		UnaryOperator<String> op6 = String::toUpperCase;
		System.out.println(op6.apply("helLO"));

		// 3. 생성자 - 클래스명::new
		Supplier<Test> sup = new Supplier<Test>() {

			@Override
			public Test get() {
				// TODO Auto-generated method stub
				return new Test();
			}
		};

		// 람다표현식
		Supplier<Test> sup2 = () -> new Test();
		// 축약식표현
		Supplier<Test> sup3 = Test::new;
		System.out.println(sup3.get() instanceof Test);
		
		Function<Integer,Test> ff = new Function<Integer, Test>() {
			
			@Override
			public Test apply(Integer n) {
				// TODO Auto-generated method stub
				return new Test(n);
			}
		};
		
		Function<Integer,Test> ff2 = n -> new Test(n);
		Function<Integer,Test> ff3 = Test::new;
		Test t3 = ff3.apply(3);
		
		// 4. sysout - System.out::println
		Consumer<String> c = s-> System.out.println(s);
		c.accept("hello");
		
		Consumer<String> c1 = System.out::println;
		c.accept("World");
		
		
	}

}
