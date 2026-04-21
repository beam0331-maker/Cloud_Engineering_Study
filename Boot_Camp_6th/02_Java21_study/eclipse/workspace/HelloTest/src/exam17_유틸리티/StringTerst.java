package exam17_유틸리티;

public class StringTerst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 리터럴
		String s = "hello";
		String s2 = "hello";
		System.out.println(s + "\t" + s2);
		System.out.println(s == s2);
		System.out.println(s.equals(s2));
		
		// 2. new
		String x = new String("hello");
		String x2 = new String("hello");
		System.out.println(x + "\t" + x2);
		System.out.println(x == x2);
		System.out.println(x.equals(x2));

	}

}
