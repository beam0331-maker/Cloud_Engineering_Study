package pack07;

public class Student {
	
	private String name;
	
	private int age;
	
	private int height;
	
	private int weight;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}
	
	
	public String studentInfo() {
		String info = String.join(" ", this.name, Integer.toString(this.age),Integer.toString(this.height),Integer.toString(this.weight)); 			
		return	info;
	}
	
	
	

}
