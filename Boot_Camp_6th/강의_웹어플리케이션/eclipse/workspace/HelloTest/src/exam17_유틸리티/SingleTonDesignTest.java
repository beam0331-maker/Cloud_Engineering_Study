package exam17_유틸리티;

class Calendar2 {
	private static Calendar2 cal;

	private Calendar2() {}

	public static Calendar2 gertInstance() {
		if (cal == null)
			cal = new Calendar2();
		return cal;
	}
}

public class SingleTonDesignTest {

	public static void main(String[] args) {
		// 싱글톤 디자인 패턴 : 단 하나의 인스턴스를 만들때

		Calendar2 c1 = Calendar2.gertInstance();
		Calendar2 c2 = Calendar2.gertInstance();

		System.out.println(c1 == c2);

	}

}
