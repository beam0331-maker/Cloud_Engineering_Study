package exam17_유틸리티;

import java.util.Arrays;

public class StringTerst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "heLlO";	
		
		System.out.println("1. 문자열 길이:" + s.length());	// 5
		
		System.out.println("2. 특정위치의 문자얻기:" + s.charAt(0));	// 
		
		System.out.println("3. 부분열 :" + s.substring(1)); // eLlO
		System.out.println("3. 부분열 :" + s.substring(1, 4)); // eLl
		
		System.out.println("4. 대문자로 변경:" + s.toUpperCase()); // HELLO
		System.out.println("5. 소문자로 변경:" + s.toLowerCase()); // hello
		
		
		String s2 = "     world     ";
		System.out.println("6. 양쪽 공백제거:" + s2.strip()); // world
		System.out.println("6. 양쪽 공백제거후 길이:" + s2.strip().length()); // 5
		System.out.println("6. 왼쪽 공백제거:" + s2.stripLeading()); // world
		System.out.println("6. 오른쪽 공백제거:" + s2.stripTrailing()); //     world
		
		System.out.println("7. 문자열 연결:" + s + s2); // heLlO     world   
		System.out.println("7. 문자열 연결:" + s.concat(s2)); // heLlO     world
		
		String s3 = "heLlO";	
		System.out.println("8. 문자열 포함여부:" + s3.contains("he")); // true
		System.out.println("8. 문자열 포함여부:" + s3.contains("ex")); // false
		
		System.out.println("9. 문자열 치환:" + s3.replace('h','H')); // HeLlO
		System.out.println("9. 문자열 치환:" + s3.replace("Ll","XY")); // heXYO
		
		System.out.println("10. 특정문자의 위치:" + s3.indexOf('e')); // 1
		System.out.println("10. 특정문자의 위치:" + s3.indexOf('x')); // 일치하는 값이 없으면 -1
		
		// x와 x2가 같은 문자열인가
		String x = "hello";
		String x2 = new String("hello");
		String x3 = "Hello";
		
		System.out.println("11. 특정문자의 위치:" + (x == x2)); // false, ==은 주소값 비교
		System.out.println("11. 특정문자의 위치:" + x.equals(x2)); // true, equals는 실제 문자열 비교
		System.out.println("11. 특정문자의 위치:" + x.equals(x3)); // false, equals는 대소문자를 엄격하게 비교한다
		System.out.println("11. 특정문자의 위치:" + x.equalsIgnoreCase(x3)); // true, equalsIgnoreCase는 대소문자를 무시
		
		// 특정 구분자로 분리
		String ss = "홍길동/이순신/유관순";
		String[] names = ss.split("/");
		System.out.println("12. 구분자로 분리: " + Arrays.toString(names)); // [홍길동, 이순신, 유관순]
		
		// 비문자열을 문자열로
		// ex. 10 -> "10", 3.14 -> "3.14", true -> "true", ['a','b'] -> ab
		System.out.println("13. 비문자열을 문자열로 변환: " + String.valueOf(10)); //
		System.out.println("13. 비문자열을 문자열로 변환: " + String.valueOf(3.14)); //
		System.out.println("13. 비문자열을 문자열로 변환: " + String.valueOf(true)); //
		System.out.println("13. 비문자열을 문자열로 변환: " + String.valueOf(new char[] {'a','b'})); //
		
		// 원본 문자열의 변경여브
		System.out.println(s);
		System.out.println(s3);

		
 		
		
			
		
	}

}
