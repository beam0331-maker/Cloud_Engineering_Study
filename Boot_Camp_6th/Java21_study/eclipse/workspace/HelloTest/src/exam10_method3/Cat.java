package exam10_method3;

public class Cat {

	String name;
	int age;
	String gender;

	public Cat(String name, int age, String gender) {
		this.name = name;
		// age 검증
		if (ageValiedCheck(age)) {
			System.out.println("나이 입력 오류발생");
		} else {
			this.age = age;
		}
		this.gender = gender;
	}

	// 필요시 메서드 추가
	// age 검증하는 메서드
	private boolean ageValiedCheck(int age) {
		boolean result = false;
		// 조건체크
		if (age >= 20)
			result = true;
		return result;
	}

	private boolean ageValiedCheck2(int age) {
		return age >= 20;
	}

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
