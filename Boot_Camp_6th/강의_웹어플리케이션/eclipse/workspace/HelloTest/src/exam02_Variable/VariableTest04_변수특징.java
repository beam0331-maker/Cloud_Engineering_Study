package exam02_Variable;

public class VariableTest04_변수특징 {

	int num; // 인스턴스 변수 => heap 영역

	public static void main(String[] args) {

		// 변수명 중복불가
		int num = 10; // 로컬변수 => stack 영역
//		int num = 20;
//		long num = 20;

		// 로컬변수는 사용전에 반드시 초기화
		int size;
		// System.out.println(size);

		// 블록 scope: 블럭내에서 선언된 변수는 블럭 밖에서 사용 불가
		{
			int age = 20;
			System.out.println(age);
		}
		{
			int age = 30; // 블럭이 다르면 변수명 동일 가능
			System.out.println(age);
		}

	}// main 메서드 블럭

}// 클래스 블럭
