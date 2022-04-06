package tathatsuTask2;

public class Transpose {

	static void giveTranspose(int[][] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				if(i!=j) {
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
		}
	}
	
	static void printArr(int arr[][]) {
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {

		int[][] arr = {{11, 12, 13, 14},
					   {15, 16, 17, 18},
					   {19, 20, 21, 22},
					   {23, 24, 25, 26}};
		
		Transpose.printArr(arr);
		
		Transpose.giveTranspose(arr);
		
		System.out.println();
		
		Transpose.printArr(arr);
		
			
	}

}
