package exam22_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest3_중간처리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>().reversed();
		list.add("홍길동1");
		list.add("정조");
		list.add("홍장군");
		list.add("선덕여왕");
		list.add("이순신");
		list.add("정조");
		list.add("이순신");
		
		Stream<String> stream = list.stream();
		
		// 모두철력
		stream.forEach(System.out::println);
		System.out.println("---------------------");
		
//		// 중복제거 
//		stream = list.stream();
//		Stream<String> stream2 = stream.distinct();
//		stream2.forEach(System.out::println);
		
		list.stream()
			.distinct()
			.forEach(System.out::println);
		
		
		System.out.println("---------------------");
		// 중간처리2 - 필터링 - filter(Predicate)
		stream = list.stream();
		
		// 익명클래스
		Predicate<String> p = new Predicate<String>() {
			
			@Override
			public boolean test(String s) {
				// TODO Auto-generated method stub
				return s.length() == 3;
			}
		};
		Predicate<String> p2 = s -> s.length() ==3;
		
		Stream<String> stream2 = stream.filter(p);
		stream2.forEach(System.out::println);
		
		System.out.println("---------------------");

		list.stream()
			.distinct()
			.filter(s -> s.length() == 3 )			
			.forEach(System.out::println);
		
		
		System.out.println("---------------------");
		// 중간처리3 - map(Function<T,R>)
		List<Student> list2 = Arrays.asList(
				new Student("홍길동",100),
				new Student("이순신",90),
				new Student("유관순",50),
				new Student("강감찬",70),
				new Student("정조",95),
				new Student("선덕여왕",45)
				);		
		
		// 이름만 출력
		Stream<Student> stream4 = list2.stream();
		//익명 함수
		
		Function<Student,String> f = new Function<Student, String>() {
			
			@Override
			public String apply(Student t) {
				// TODO Auto-generated method stub
				return t.getName();
			}
		};
		// 람다표현식
		Function<Student,String> f2 = s -> s.getName();
		
		// 메서드 참조
		Function<Student,String> f3 = Student::getName;
		Stream<String> stream5 = stream4.map(f3);
		stream5.forEach(System.out::println);
		
		System.out.println("---------------------");
		//최종코드
		list2.stream()
			 .map(Student::getName)
			 .forEach(System.out::println);
		
		
		System.out.println("---------------------");
		///////////////
		/// flatmap
		
		List<String> list9 = Arrays.asList("10,20,30","40,50,60");
		
		Stream<String> stream9 = list9.stream();
		
		Function<String, IntStream> f9 = new Function<String, IntStream>() {
			
			@Override
			public IntStream apply(String t) {
				String[] arr = t.split(","); //["10","20","30"]		
				int [] arrNum = new int[arr.length];
				for(int i = 0; i< arr.length;i++) {
					arrNum[i] = Integer.parseInt(arr[i]);
				}
				return Arrays.stream(arrNum);
//				return Arrays.stream(arr).mapToInt(Integer::parseInt) ;
			}
		};	
		
		IntStream is = stream9.flatMapToInt(f9);
		is.forEach(System.out::println);
		System.out.println("---------------------");

		list9.stream()
			 .flatMap(str -> Arrays.stream(str.split(",")))
			 .mapToInt(Integer::parseInt)
			 .forEach(System.out::println);
	}	

}

class Student{
	String name;	// 이름
	int grad;		// 점수
	
	public Student(){		
	}
	
	public Student(String name, int grade){
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
 