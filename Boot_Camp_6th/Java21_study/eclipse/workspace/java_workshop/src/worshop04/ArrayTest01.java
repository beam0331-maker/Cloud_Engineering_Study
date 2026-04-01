package worshop04;

public class ArrayTest01 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for(int n : arr) {
			sum += n;
		}
		System.out.println("sum = " + sum);
		System.out.println("avg = " + sum/arr.length);

	}

}
