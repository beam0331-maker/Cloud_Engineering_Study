package exam20_컬렉션API;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		// Map 계열: Key / Value 쌍으로 저장
//		HashMap<String, String> map = new HashMap<String, String>();
		Map<String, String> map = new HashMap<String, String>();	// 다형성

		// 데이터 저장방법
		map.put("p1", "홍길동");
		map.put("p2", "이순신");
		map.put("p3", "유관순");
		map.put("p3", "유관순2"); // 동일한 key 사용해서 value 수정 가능

		System.out.println("=========================");
		// 데이터 출력1 - get(key)
		System.out.println(map.get("p1"));
		System.out.println(map.get("p2"));
		System.out.println(map.get("p4"));	// null, 존재하지 않는 key값은 null 반환

		System.out.println("=========================");
		// 데이터 출력2 - toString
		System.out.println(map);
		System.out.println(map.toString());

		System.out.println("=========================");
		// 데이터 출력3 - keySet() 이용해서 key만 추출하고 나중에 value 추출
		Set<String> keys = map.keySet();
		System.out.println(keys);
		for (String key : keys) {
			System.out.println(map.get(key));
		}				
		
		System.out.println("=========================");
		// 데이터 출력4 - values() - 값만 얻기
		Collection<String> data = map.values();		
		for (String v : data) {
			System.out.println(v);
		}	
		
		System.out.println("=========================");
		// 추가 메서드
		System.out.println("key 존재여부: " + map.containsKey("p1"));
		System.out.println("value 존재여부: " + map.containsValue("홍길동"));
		System.out.println("맵 크기: " + map.size());
		
		// 삭제
		System.out.println("삭제된 value: " + map.remove("p1"));
		System.out.println(map);

		// 전체 삭제
		map.clear();
		System.out.println(map);	
		
		System.out.println("=========================");
		//새성방법2
		Map<String, Integer> map2 = Map.of("k1", 10, "k2", 20, "k3", 30); // 수정이 불가능한 Map
		System.out.println(map2);
//		map2.put("k2", 30);	// 수정 불가 이므로 오류 발생

	}

}
