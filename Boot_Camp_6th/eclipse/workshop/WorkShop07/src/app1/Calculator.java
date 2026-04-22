package app1;

public class Calculator {
	
	public double plus(int a, int b) {
		return (double)a+b;
	}
	public double minus(int a, int b) {
		return (double)a-b;
	}
	public double multiplications(int a, int b) {
		return (double)(a*b);
	}
	public double dvide(int a, int b) throws ArithmeticException {				
		return (double)(a/b);
	}
	

}
