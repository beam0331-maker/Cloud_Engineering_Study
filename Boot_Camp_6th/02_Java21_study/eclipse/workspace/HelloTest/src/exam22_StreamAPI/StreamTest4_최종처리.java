package exam22_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamTest4_최종처리 {

	public static void main(String[] args) {
		// 최종처리

		List<Integer> list = Arrays.asList(5, 100, 42, 57, 2, 1);

		// 1. 갯수
		long count = list.stream() // 리턴타입은 Stream<Integer>의 max(Comparator<? super T> compaarator)
				.count();

		System.out.println("count: " + count);
		System.out.println("---------------------");

		long count2 = list.stream().filter(n -> n % 2 == 0).count();

		System.out.println("count2: " + count2);
		System.out.println("---------------------");

		// 2. 최댓값
		int max = Arrays.stream(new int[] { 5, 100, 42, 57, 2, 1 }) // 리턴타입은 IntStrea이고 Stream보다 더 많은 메서드가 있다.
				.max().getAsInt();

		int max2 = list.stream().mapToInt(Integer::intValue).max().getAsInt();

		System.out.println("max: " + max);
		System.out.println("---------------------");

		// 3. 최소값
		int min = Arrays.stream(new int[] { 5, 100, 42, 57, 2, 1 }) // 리턴타입은 IntStrea이고 Stream보다 더 많은 메서드가 있다.
				.min().getAsInt();

		int min2 = list.stream().mapToInt(Integer::intValue).min().getAsInt();

		System.out.println("min: " + min);
		System.out.println("---------------------");

		// 4. sum
		int sum = Arrays.stream(new int[] { 5, 100, 42, 57, 2, 1 }) // 리턴타입은 IntStrea이고 Stream보다 더 많은 메서드가 있다.
				.sum();

		int sum2 = list.stream().mapToInt(Integer::intValue).sum();

		System.out.println("sum: " + sum);
		System.out.println("---------------------");
		
		// 5. average
		double avg = Arrays.stream(new int[] { 5, 100, 42, 57, 2, 1 }) // 리턴타입은 IntStrea이고 Stream보다 더 많은 메서드가 있다.
				.average().getAsDouble();

		double avg2 = list.stream().mapToInt(Integer::intValue).average().getAsDouble();

		System.out.println("avg: " + avg);

	}

}
