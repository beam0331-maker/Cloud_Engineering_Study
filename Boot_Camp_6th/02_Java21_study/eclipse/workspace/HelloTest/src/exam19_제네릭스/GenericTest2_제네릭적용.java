package exam19_제네릭스;

// 임의의 데이터를 저장할 수 있는 클래스
class Box2<T>{
	T obj;
	
	public void setValue(T obj) {
		this.obj = obj;
	}
	
	public T getValue(){
		return this.obj;
	}
}// end box

public class GenericTest2_제네릭적용 {

	public static void main(String[] args) {

		// Box에 데이터 저장
		// 제네릭스 사용안한 경우
		Box2 box1 = new Box2();
		box1.setValue("홍길동");
		System.out.println(box1.getValue());
		box1.setValue(10);
		System.out.println(box1.getValue());
		
		// 문자열만 저장
		Box2<String> box2 = new Box2<String>();
		box2.setValue("홍길동");
		System.out.println(box2.getValue());
//		box2.setValue(10);	// 지정된 제네릭이 아니므로 오류 발생
		String s =box2.getValue();	// 형변홤 없이 바로 String으로 사용 가능.
		System.out.println(s.length());
		
		Box2<Integer> box3 = new Box2<Integer>();
		box3.setValue(10);
//		box3.setValue("홍길동);	// 제네릭 타입 Integer 이미로 오류
		
		int n = box3.getValue();
		System.out.println(n);
		
	}

}
