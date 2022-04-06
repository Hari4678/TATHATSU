package tathatsuTask2;

import java.util.Scanner;

public class Palindrome {
	
	static String palindromeCheck(String ch) {
		
		int count = 0;
		
		for(int i = 0 , j = ch.length()-1; i < ch.length()/2; i++,j--) {
			
			if(ch.charAt(i) == ch.charAt(j))
				count++;
			
			else
				break;
			}
		
		if(count == ch.length()/2)
			return "YES";
		else
			return "NO";
		
	}

	public static void main(String[] args) {

		String S;
		Scanner read = new Scanner(System.in);
		System.out.println("enter a string to check whether it is PALINDROME or NOT.");
		
		S = read.next();
		
		System.out.println(Palindrome.palindromeCheck(S));

	}

}
