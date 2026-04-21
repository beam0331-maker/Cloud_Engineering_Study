package exam21_합수적인터페이스;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class PredicateTest2 {

	public static void main(String[] args) {

		// Predicate 인터페이스 사용
		// 정수파라미어 전달받아서 2의 배수인지 체크
		// 정수파라미어 전달받아서 3의 배수인지 체크

		IntPredicate p1 = n -> n % 2 == 0;
		System.out.println(p1.test(2));

		IntPredicate p2 = n -> n % 3 == 0;
		System.out.println(p2.test(3));

		// 1. 전달된 값이 2의 배수이고 3의 배수이냐?
		IntPredicate p3 = p1.and(p2);
		System.out.println(p3.test(6));

		// 2. 전달된 값이 2의 배수이거나 3의 배수이냐?
		IntPredicate p4 = p1.or(p2);
		System.out.println(p4.test(2));
		
		
		// 3. 전달된 값이 2의 배수가 아니야?
		IntPredicate p5 = p1.negate();
		System.out.println(p5.test(16));
		

	}

}
