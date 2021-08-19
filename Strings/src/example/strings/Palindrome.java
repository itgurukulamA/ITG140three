package example.strings;


public class Palindrome {
	
public static void main(String args[]) {
	
	String str ="amma";
	String reverse="";
	
	 int length = str.length();
	
	 for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + str.charAt(i);  
      if (str.equals(reverse))  
         System.out.println("Entered string is a palindrome");  
      else  
         System.out.println("Entered string isn't a palindrome");   

	
	
}
}
