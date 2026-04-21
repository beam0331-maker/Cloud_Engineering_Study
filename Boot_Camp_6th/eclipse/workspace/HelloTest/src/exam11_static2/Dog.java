package exam11_static2;

public class Dog {

	String name;
	int age;
	String gender;

	public Dog(String name, int age, String gender) {
		this.name = name;
		// age 검증
		if (ValidClass.ageValiedCheck(age)) {
			System.out.println("나이 입력 오류발생");
		} else {
			this.age = age;
		}
		this.gender = gender;
	}

	// 필요시 메서드 추가
	// age 검증하는 메서드
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// age 검증
		if (ageValiedCheck(age)) {
			System.out.println("나이 입력 오류발생");
		} else {
			this.age = age;
		}
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void isAgeCheck() {

	}

}
