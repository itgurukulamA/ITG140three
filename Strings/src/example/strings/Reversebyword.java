package example.strings;

public class Reversebyword {
	public static void main(String args[]) {
		String str= "bhuvana adari";
		int len= str.length();
		for(int i=len-1;i>=0;i-- ) {
			
			System.out.print(str.charAt(i));
		}
	}

}