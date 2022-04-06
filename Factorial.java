package tathatsuTask2;

import java.util.Scanner;

public class Factorial {
	
	static int factorial(int n) {
		
		int fact = 1;
		
		for(int i = n; i>0; i--) {
			fact = fact * i;
		}
		
		return fact;
		
	}

	public static void main(String[] args) {

		System.out.println("enter a number to calculate factorial.");
		
		Scanner read = new Scanner(System.in);
		
		int n =read.nextInt();
		
		System.out.println(Factorial.factorial(n));
	}

}
