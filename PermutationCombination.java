package tathatsuTask2;

public class PermutationCombination {

	static double permutation(int n, int r) {
		return (double)(Factorial.factorial(n)/Factorial.factorial(n-r));
	}
	
	static double combination(int n, int r) {
		return (double)(Factorial.factorial(n)/(Factorial.factorial(r)*Factorial.factorial(n-r)));
	}
	
	public static void main(String[] args) {
		
		int n=5, r=4;
		
		System.out.println("permutation = " + PermutationCombination.permutation(n, r));
		System.out.println("Combinations = " + PermutationCombination.combination(n, r));

	}

}
