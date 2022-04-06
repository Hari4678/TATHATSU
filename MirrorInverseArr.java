package tathatsuTask2;

public class MirrorInverseArr {

	static String mirrorInverseCh(int [] arr) {
		
		int count=0;
		for(int i = 0; i<arr.length/2; i++) {
			if(arr[i] == arr[arr.length-1-i])
				count++;
			else
				break;
		}
		
		if(count == arr.length/2)
			return "YES";
		else
			return "NO";
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,2,1};
		System.out.println("is array mirror inverse? " + MirrorInverseArr.mirrorInverseCh(arr));
	}

}
