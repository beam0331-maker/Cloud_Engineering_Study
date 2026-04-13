package exam22_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamTest3_중간처리2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 중간처리5 - 정렬 sorted
		List<Integer> list = Arrays.asList(5,100,42,57,2,1);
		
		// 오름차순
		list.stream()
			.sorted(Comparator.naturalOrder())
			.forEach(System.out::println);
		
		System.out.println("-----------------");
		
		// 내림차순
		list.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
		
		System.out.println("-----------------");
		
		
		List<Student2> list2 = Arrays.asList(
				new Student2("홍길동",100),
				new Student2("이순신",90),
				new Student2("유관순",50),
				new Student2("강감찬",70),
				new Student2("정조",95),
				new Student2("선덕여왕",45)
				);		
		
		// 정렬할 값 설정
		Function<Student2, Integer> f = new Function<Student2, Integer>() {
			
			@Override
			public Integer apply(Student2 t) {
				// TODO Auto-generated method stub
				return t.getGrad(); // grade 값으로 정렬
			}
		};
		
		list2.stream()
		 .sorted(Comparator.comparing(f) ) // 오름차순
		 .forEach(System.out::println);
		
		System.out.println("-----------------");
		list2.stream()
		 .sorted(Comparator.comparing(f, Comparator.reverseOrder())) // 내림차순
		 .forEach(System.out::println);
		
		
		System.out.println("-----------------");
		list2.stream()
			 .sorted((o1, o2) -> o1.getGrad() - o2.getGrad())
			 .forEach(System.out::println);
		
		System.out.println("-----------------");
		// 중간처리6 - skip()
		list2.stream()
			 .skip(2)
			 .forEach(System.out::println);
		
		System.out.println("-----------------");
		// 중간처리7 - limit()
		list2.stream()
		 .limit(2)
		 .forEach(System.out::println);		
		
		System.out.println("-----------------");
		// 중간처리7 - limit()
		list2.stream()
		 .limit(2)
		 .forEach(System.out::println);
		
		System.out.println("-----------------");

		
	}

}

class Student2{
	String name;	// 이름
	int grad;		// 점수
	
	public Student2(){		
	}
	
	public Student2(String name, int grade){
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