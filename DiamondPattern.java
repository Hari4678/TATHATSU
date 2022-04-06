package tathatsuTask2;

public class DiamondPattern {

	static void printDiamondPattern(int n) {
		
		for(int i=0,j=n; i<n; i++,j--) {
			
			for(int a=j; a>0; a--) 
				System.out.print(" ");
			
			for(int b=0; b<=i; b++)
				System.out.print("* ");
			
			System.out.println("");
		}
		
		for(int i=0; i<n-1; i++) {
			
			for(int a=0; a<=i; a++)
				System.out.print(" ");
			
			for(int b=i; b<n-1; b++)
				System.out.print(" *");
			
			System.out.println("");
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 2;
		DiamondPattern.printDiamondPattern(n);
				
	}

}
