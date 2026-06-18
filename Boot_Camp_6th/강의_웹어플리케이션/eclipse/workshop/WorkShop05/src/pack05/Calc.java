package pack05;

public class Calc {
	
	public int calculate (int data) {
		int result = 0;
		for(int i = 2 ; i<=data ;i += 2) {
			result += i;
		}
		return	result; 
	}

}
