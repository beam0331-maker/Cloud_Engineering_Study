package exam17_유틸리티;

public class WrapperClassTest {

	public static void main(String[] args) {

		// 1. 타입별 값의 범위
		System.out.println("int 최소값: " + Integer.MIN_VALUE);
		System.out.println("int 최대값: " + Integer.MAX_VALUE);

		System.out.println("double 최소값: " + Double.MIN_VALUE);
		System.out.println("double 최소값: " + Double.MAX_VALUE);

		// 2. "10" -> 10
		System.out.println("문자열을 정수로 변환: " + Integer.parseInt("10"));
		System.out.println("문자열을 실수 변환: " + Float.parseFloat("3.14"));
		
		System.out.println("정수 sum: "+Integer.sum(10,20));
		System.out.println("정수 max: "+Integer.max(10,20));
		System.out.println("정수 min: "+Integer.min(10,20));
		
		// 기본형과 참조형(Wrapper) 서로 쉽게 호환되도록 지원
		int n = 10;
//		Integer n2 = new Integer(10);
		Integer n2 = n; // 참조형에 기본형을 대입하는게 가능 <== Auto boxing
		
		int n3 = n2; // 기본형에 참조형을 대입하는게 가능 <== Auto unboxing
		
	}

}
