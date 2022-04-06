package tathatsuTask2;

import java.util.Scanner;



public class RemoveElementArr {

	static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		int[] arr = {1, 2, 3, 4, 5};
		
		RemoveElementArr.printArr(arr);
		
		System.out.println("enter an element to remove from an array");
		
		int ele = read.nextInt();
		int index=-1;
		for(int i=0; i<arr.length; i++) {
			if(ele==arr[i]) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("entered element does not exist in the arraylist");
			return;
		}
		
		for(int i = index; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		
		arr[arr.length-1] = '\n';
		
		RemoveElementArr.printArr(arr);
		
	}

}
