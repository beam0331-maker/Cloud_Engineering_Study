package p4;

import p3.Parent2;

public class Child2 {
	// 다른 클래스에서 접근
	public void method() {
		Parent2 p = new Parent2();	
		System.out.println(p.n1);	// public만 접근가능
//		System.out.println(p.n2);
//		System.out.println(p.n3);
//		System.out.println(p.n4); 
	}

}

// 상속 관계
class Child3 extends Parent2 {
	public void method() {
		System.out.println(n1);	//
		System.out.println(n2);	//	protected 접근가능
//		System.out.println(n3);	//	dafault 접근불가
//		System.out.println(n4);	//	private 접근불가
	}
}
