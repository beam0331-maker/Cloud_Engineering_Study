package exam18_예외처리;

import java.io.IOException;

// 계좌
class Pet  {
	public void a() {}
	public void b() throws RuntimeException{}
	public void c() throws RuntimeException{}
}

class Cat extends Pet{
	public void a() throws Exception{	// 부모보다 확대된 형식으로 지정 불가
	public void b() throws ArithmeticException{} // RuntimeException 및 하위 클래스 가능
	public void c() throws IOException{}	// 부모계열의 하위 클래스만 가능하기에 오류
}

public class ExecptionTest8 {

	public static void main(String[] args) {
	
	} // end main

}
