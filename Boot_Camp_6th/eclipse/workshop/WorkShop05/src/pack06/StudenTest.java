package pack06;

public class StudenTest {

	public static void main(String[] args) {
		Student studentArray [] = new Student[3];
		studentArray[0] = new Student("홍길동",15,171,81);
		studentArray[1] = new Student("한사람",13,183,72);
		studentArray[2] = new Student("임걱정",16,175,65);
		
		int avgAge = 0;
		int avgHeight = 0;
		int avgWeight = 0;
		
		for(int i = 0;i<3;i++) {
			System.out.printf("%s %d %d %d\n",studentArray[i].getName(),studentArray[i].getAge(),studentArray[i].getHeight(),studentArray[i].getWeight());
			avgAge += studentArray[i].getAge();
			avgHeight += studentArray[i].getHeight();
			avgWeight += studentArray[i].getWeight();
		}
		System.out.printf("나이의 평균 %.2f\n", (float)avgAge/3);
		System.out.printf("신장의 평균 %.2f\n", (float)avgHeight/3);
		System.out.printf("몸ㅁ누게의 평균 %.2f\n", (float)avgWeight/3);
		
	}
}
