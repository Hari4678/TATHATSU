package tathatsuTask2;

public class CalculationBasic {
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static int substract(int a, int b) {
		return a-b;
	}
	
	static int multiply(int a, int b) {
		return a*b;
	}
	
	static int devide(int a, int b) {
		return a/b;
	}
	
	static int remainder(int a, int b) {
		return a%b;
	}
	
	public static void main(String[] args) {

		int a=20, b =7;
		
		System.out.println(CalculationBasic.add(a, b));
		System.out.println(CalculationBasic.substract(a, b));
		System.out.println(CalculationBasic.multiply(a, b));
		System.out.println(CalculationBasic.devide(a, b));
		System.out.println(CalculationBasic.remainder(a, b));

	}

}
