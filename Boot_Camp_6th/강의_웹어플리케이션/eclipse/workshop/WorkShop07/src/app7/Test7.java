package app7;

public class Test7 {

	public static void main(String[] args) {
		String mesg = "     홍길동/이순신/유관순     ";
		System.out.println("문자열길이(공백포함): "+ mesg.length() );
		System.out.println("공백제거: " + mesg.stripTrailing());
		System.out.println("공백제거된 문자열 길이: "+ mesg.stripTrailing().length() );
		System.out.println("부분열: "+ mesg.substring(5,12));
		System.out.println("홍길동 출력: "+ mesg.stripTrailing().split("/")[0]);
		System.out.println("유관순 출력: "+ mesg.stripTrailing().split("/")[2]);		
	}

}
