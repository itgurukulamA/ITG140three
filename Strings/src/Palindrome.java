import java.util.Scanner;

public class Palindrome {
  public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string:");
	String s = sc.nextLine();
	int i=0,count=0; 
    int j=s.length()-1;
    while(i<j)
        {
    	if(s.charAt(i)!=s.charAt(j)) {
    		count=1;
    	}
    	i++;
		j--;
        }
   if(count==1) {
    	System.out.println("not a palindrome");
    }
   else {
    	 System.out.println("palindrome");
    }
  }   
	  
	  
 }

