package exam17_유틸리티;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
		String s = "홍길동 이순신 유관순";
		String s2 = "홍길동/이순신/유관순/강감찬";
			
		StringTokenizer st = new StringTokenizer(s);
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		st = new StringTokenizer(s2,"/");
		
		System.out.println("----------");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		// 구분자 여러개 지정가능
		
		String s3 = "영조|홍길동/이순신,유관순/강감찬";
		
		st = new StringTokenizer(s3,"/,|");
		
		System.out.println("----------");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		
	}

}
