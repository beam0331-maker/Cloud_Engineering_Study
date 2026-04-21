package pack01;

public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("Kim");
		s1.setKorean(100);
		s1.setEnglish(90);
		s1.setMath(95);
		s1.setScience(89);
		System.out.printf("%s 평균:%.2f 학점: %s학점 \n",s1.getName(),s1.getAvg(),s1.getGrade());
		Student s2 = new Student();
		s2.setName("Lee");
		s2.setKorean(60);
		s2.setEnglish(70);
		s2.setMath(99);
		s2.setScience(98);
		System.out.printf("%s 평균:%.2f 학점: %s학점 \n",s2.getName(),s2.getAvg(),s2.getGrade());
		Student s3 = new Student();
		s3.setName("Park");
		s3.setKorean(68);
		s3.setEnglish(86);
		s3.setMath(60);
		s3.setScience(40);
		System.out.printf("%s 평균:%.2f 학점: %s학점 \n",s3.getName(),s3.getAvg(),s3.getGrade());

	}

}
