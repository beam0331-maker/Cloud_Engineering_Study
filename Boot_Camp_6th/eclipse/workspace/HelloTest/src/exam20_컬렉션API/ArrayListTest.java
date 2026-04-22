package exam20_컬렉션API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		// List 계열: 순서있고 중복가능
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(100);
		list.add(200);
		list.add(300);

		// 데이터 출력 방법1 - get(index)
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());

		System.out.println("=========================");
		// 데이터 출력 방법2 - toString()
		System.out.println(list); // [100, 200, 300]

		System.out.println("=========================");
		// 데이터 출력 방법3 - 향상된 for문
		for (int n : list)
			System.out.println(n);

		System.out.println("=========================");
		// 데이터 출력방법4: Iterator<E> iterator()
		Iterator<Integer> ite = list.iterator();

		while (ite.hasNext()) {
			Integer s = ite.next();
			System.out.println(s);
		}

		// 메서드
		// 현재: [100, 200, 300]

		// 중간삽입
		list.add(0, 900);
		System.out.println(list);

		// 수정
		list.set(1, 1000);
		System.out.println(list);

		// 삭제
		list.remove(0); // 0 인덱스 삭제
		System.out.println(list);
		list.remove(new Integer(1000)); // 1000의 값을 삭제
		System.out.println(list);

		// 수정
		list.set(0, 200);
				
		System.out.println("크기: " + list.size());
		System.out.println("포함여부: " + list.contains(300));
		System.out.println("비어있냐: " + list.isEmpty());
		
		System.out.println(list);
		

		List<String> list2 = new ArrayList<String>();	// 다형성 적용
		list2.add("A");
		list2.add("C");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add("E");
		System.out.println(list2);
		System.out.println("=========================");

		// 부분 리스트
		List<String> list3 = list2.subList(0, 3);
		System.out.println("부분리스트: " +  list3);
		System.out.println("=========================");
		
		// 생성방법2 - Arrays 클래스 이용
		List<String> list4 = Arrays.asList("A", "B","B","C");	// 가변인자로 생성, Arrays로 생성해서 추가불가(fixed_size)
		System.out.println(list4);
		list4.add("E");
		
		System.out.println("=========================");


		
		
		

	}

}
