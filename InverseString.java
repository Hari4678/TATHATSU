package tathatsuTask2;

public class InverseString {

	static void inverseString(StringBuilder sb){
		
		for(int i=0; i<sb.length()/2; i++) {
			char temp = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(sb.length()-1-i));
			sb.setCharAt(sb.length()-1-i, temp);
		}	
	}
	
	public static void main(String[] args) {
		
		StringBuilder name = new StringBuilder("HARIHARAN");
		System.out.println(name);
		
		InverseString.inverseString(name);
		System.out.println(name);
	}
	
}
