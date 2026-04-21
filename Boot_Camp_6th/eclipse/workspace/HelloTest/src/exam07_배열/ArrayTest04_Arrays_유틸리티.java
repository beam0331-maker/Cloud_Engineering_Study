package exam07_배열;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayTest04_Arrays_유틸리티 {

	public static void main(String[] args) {

		// 1. 배열을 문자열로 모두 출력
		// 문법: Arrays.toStrinf()
		int[] num = { 10, 20, 30 };

		System.out.println(Arrays.toString(num));

		// 2. 배열 오름차순 정렬
		// 문법: Arrays.sort(배열)

		int[] num2 = { 23, 4, 1, 64, 12, 3, 87 };
		Arrays.sort(num2);
		System.out.println(Arrays.toString(num2));

		// 3. 배열을 특정값으로 채우기
		// 문법: Arrays.fill(배열, 변경할 값)
		String[] name = { "A", "B", "C", "2", "3", "F", "T" };
		Arrays.fill(name, "X");
		System.out.println(Arrays.toString(name));

		// 4. 배열을 일부분을 특정갑스로 채우기
		// 문법: Arrays.fill(배열, 시작위치, 끝위치, 변경할값);
		String[] name2 = { "A", "B", "C", "2", "3", "F", "T" };
		Arrays.fill(name2, 0, 3, "X");
		System.out.println(Arrays.toString(name2)); // [X, X, X, 2, 3, F, T] => 끝위치는 포함되지 않느다

		// 5. 배열에서 특정요소의 위치값(index)값 찾기
		// 문법: Arrays.binarySearch(배열, 찾을값)
		int[] num3 = { 23, 4, 1, 64, 12, 3, 87 };
		// binarySearch 실행전 sort는 필수이다.
		Arrays.sort(num3);		
		System.out.println(Arrays.toString(num3)); // [1, 3, 4, 12, 23, 64, 87]
		System.out.println(Arrays.binarySearch(num3, 4));
		
		// 6. 배열비교
		// 문법: Arrays.equals()
		int[] x = { 23, 4, 1, 64, 12, 3, 87 };
		int[] x2 = { 23, 4, 1, 64, 12, 3, 87 };
		
		System.out.println(Arrays.equals(x,x2));
		
		// 7. 배열크기 변경 ( 기존 배열크기변경은 불가, 새로운 배열을 만들어서 기존 배열값 복사함 )
		// 문법: 새로운배열 = Arrays.copyOf(배열, 크기)
		
		int[] num4 = {8,3};
		System.out.println(Arrays.toString(num4));
		
		int[] newArr = Arrays.copyOf(num4, 5);
		System.out.println(Arrays.toString(newArr));
		
		// num4 = newArr.clone();
		num4 = newArr;
		System.out.println(Arrays.toString(num4));
		System.out.println(num4);
		System.out.println(newArr);

	
				

	}

}
