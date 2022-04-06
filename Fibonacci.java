package tathatsuTask2;
import java.util.Scanner;

public class Fibonacci {

	static void printFibonacci(int n) {
		
		int a=0,b=1,fib=0;
		
		for(int i = 0; i<n; i++) {
			
			System.out.print(a + " ");
			fib = a+b;
			a = b;
			b = fib;
		}
	}
	
	public static void main(String[] Args) {
		
		int n;
		
		Scanner read = new Scanner(System.in);
		System.out.println("enter a number to print fibonacci series upto that number.");
		
		n = read.nextInt();
		
		Fibonacci.printFibonacci(n);
		
	}
	
}
