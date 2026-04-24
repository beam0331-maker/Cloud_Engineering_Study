package pack07;

public class StudenTest {

	public static void main(String[] args) {
		Student studentArray[] = new Student[3];
		studentArray[0] = new Student("홍길동", 15, 170, 80);
		studentArray[1] = new Student("한사람", 13, 180, 70);
		studentArray[2] = new Student("임걱정", 16, 175, 65);

		int avgAge = 0;
		int avgHeight = 0;
		int avgWeight = 0;

		int mostAge = 0;
		int leastAge = 0;
		int mostHeigt = 0;
		int leastHeigt = 0;
		int mostWeight = 0;
		int leastWeight = 0;

		for (int i = 0; i < 3; i++) {
			studentArray[i].studentInfo();
			avgAge += studentArray[i].getAge();
			avgHeight += studentArray[i].getHeight();
			avgWeight += studentArray[i].getWeight();

			if (studentArray[i].getAge() >= studentArray[mostAge].getAge())
				mostAge = i;
			
			if(i == 0) {
				leastAge = i;
			}else if(studentArray[i].getAge() <= studentArray[leastAge].getAge())
				leastAge = i;
			

			if (studentArray[i].getHeight() >= studentArray[mostHeigt].getHeight())
				mostHeigt = i;
			
			if(i == 0) {
				leastHeigt = i;
			}else if(studentArray[i].getHeight() <= studentArray[leastHeigt].getHeight())
				leastHeigt = i;
			

			if (studentArray[i].getWeight() >= studentArray[mostWeight].getWeight() )
				mostWeight = i;	
			
			if(i == 0) {
				leastWeight = i;
			}else if(studentArray[i].getWeight() <= studentArray[leastWeight].getWeight())
				leastWeight = i;
			

			

		}
		System.out.printf("\n나이의 평균 %.3f\n", (float) avgAge / 3);
		System.out.printf("신장의 평균 %.3f\n", (float) avgHeight / 3);
		System.out.printf("몸무게의 평균 %.3f\n\n", (float) avgWeight / 3);

		System.out.println("나이가 가장 많은 학생: " + studentArray[mostAge].getName());
		System.out.println("나이가 가장 적은 학생: "+ studentArray[leastAge].getName());
		System.out.println("신장이 가장 큰 학생: "+ studentArray[mostHeigt].getName());
		System.out.println("신장이 가장 작은 학생: " + studentArray[leastHeigt].getName());
		System.out.println("몸무게가 가장 많이 나가는 학생: "+ studentArray[mostWeight].getName());
		System.out.println("몸무게가 가장 적게 나가는 학생: "+ studentArray[leastWeight].getName());

	}
}
