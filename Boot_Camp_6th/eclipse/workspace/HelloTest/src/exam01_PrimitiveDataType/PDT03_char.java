package exam01_PrimitiveDataType;

public class PDT03_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('남'); // char 관리
		System.out.println('여');
//		System.out.println('여자'); 문자열을 문자 취급해서 에러발생
		System.out.println("여자"); // 문자열은 "" ,  String 클래스가 관리
		
		System.out.println("========");
		// escape 문자
		System.out.println("안녕하세요");
		System.out.println("안녕\n하세요");
		System.out.println("안녕\t하세요");
		System.out.println("안녕\"하세요");
		System.out.println("안녕\'하세요");
		System.out.println("안녕\\하세요"); // 경로설정할떄 주로 사용 ex. c:\\temp
		System.out.println("c:\\amp"); 
		

	}

}
