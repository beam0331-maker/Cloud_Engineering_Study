package exam22_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest4_최종처리2 {

	public static void main(String[] args) {
		// 배열
		
		Student3[] stuArr = {	
			new Student3("홍길동", 100),
			new Student3("홍길동", 90),
			new Student3("이순신", 90),
			new Student3("유관순", 50),
			new Student3("강감찬", 70),
			new Student3("정조", 95),
			new Student3("선덕여왕", 45)
		};
		
		//출력
		Stream.of(stuArr)	// Arrays.stream(stuArr)과  동일
			  .forEach(System.out::println);
		
		System.out.println("---------------------------");
		// 1. 이름만 추출해서 List로 변환
		
		Function<Student3, String> f = Student3::getName;
		Stream<String> stream = Stream.of(stuArr)
										.map(f);
		// stream.collect(Collector) <== Collector 변수 = Collectors.메서드
		List<String> listNames =  stream.collect(Collectors.toList());
		
		
		List<String> names = Stream.of(stuArr)
									.map(Student3::getName)
									.toList();
		
		System.out.println("이름만 추출해서 List로 변환: " + listNames);
		System.out.println(names);
		
		
		System.out.println("---------------------------");
		// 2. 이름만 추출해서 set으로 변환
		
		Set<String> setNames = Stream.of(stuArr)
									 .map(Student3::getName)
									 .collect(Collectors.toSet());
		System.out.println("이름만 추출해서 set로 변환: " + setNames);
		
		System.out.println("---------------------------");
		// 3. Collectors.counting - 갯수
		
		long cont = Stream.of(stuArr)
						  .collect(Collectors.counting());
		System.out.println("갯수 리턴: " + cont);
		
		System.out.println("---------------------------");
		// 4. Collectors.summingInt(ToIntFunction) - 전체합계
		
		int sum = Stream.of(stuArr)
						  .collect(Collectors.summingInt(Student3::getGrad));
		System.out.println("전체합계: " + cont);
		
		System.out.println("---------------------------");
		// 5. Collectors.maxBy(Comparator) - 최대값
		
		Optional<Student3> maxStud = Stream.of(stuArr).collect(Collectors.maxBy(Comparator.comparing(Student3::getGrad)));
		System.out.println("전체합계: " + maxStud.get());
		
		System.out.println("---------------------------");
		// 5. Collectors.minBy(Comparator) - 최소값
		
		Optional<Student3> minStud = Stream.of(stuArr).collect(Collectors.minBy(Comparator.comparing(Student3::getGrad)));
		System.out.println("전체합계: " + minStud.get());

	}

}

class Student3{
	String name;	// 이름
	int grad;		// 점수
	
	public Student3(){		
	}
	
	public Student3(String name, int grade){
		this.name = name;
		this.grad = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrad() {
		return grad;
	}

	public void setGrad(int grad) {
		this.grad = grad;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grad=" + grad + "]";
	}
}
