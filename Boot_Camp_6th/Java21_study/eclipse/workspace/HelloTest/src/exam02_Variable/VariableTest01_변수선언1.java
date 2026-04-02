package exam02_Variable;

public class VariableTest01_변수선언1 {

	public static void main(String[] args) {
		// 26.03.30 강의
		// 저장할 데이터: 홍길동 20 서울 180.3 67.4 결혼여부?

		// 1. 변수 선언
		String name; // 4byte 크기영역 확보
		int age = 20; // 4byte 크기영역 확보
		String address; // 4byte 크기영역 확보
		float height; // 4byte 크기영역 확보
		double weight; // 8byte 크기영역 확보
		boolean isMarried; // 1byte 크기영역 화보

		// 2. 변수 초기화
		name = "홍길동";
		age = 20;
		address = "서울";
		height = 180.3F; // 기본형(double) = 8byte 이므로 입력값을 float라고 명시해줘야한다.
		weight = 67.4; // 8byte 크기 = 8byte 크기
		isMarried = false;

		// 3. 변수 사용
		// 출력 포맷: [이름: 홍길동]
		System.out.println("이름: " + name); // 문자열 연결
		System.out.printf("이름: %s\n", name);
		System.out.printf("나이: %d\n", age);
		System.out.printf("주소: %s\n", address);
		System.out.printf("키: %.2f\n", height);
		System.out.printf("체중: %.2f\n", weight);
		System.out.printf("결혼여부: %b\n", isMarried);

		// 4. 변수값 변경
		age = age + 1;
		System.out.printf("내년나이: %d\n",age);

	}

}
