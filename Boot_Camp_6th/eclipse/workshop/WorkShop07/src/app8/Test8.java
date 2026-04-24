package app8;

public class Test8 {

	public static void main(String[] args) {
		
		String mesg = "100/200";
		
		
		System.out.println("정수값 합계: " + (Integer.sum( Integer.parseInt(mesg.split("/")[0]), Integer.parseInt(mesg.split("/")[1]))));
		System.out.println("정수값 평균: " + (Integer.parseInt(mesg.split("/")[0]) + Integer.parseInt( mesg.split("/")[1]))/(mesg.split("/").length));

	}

}
