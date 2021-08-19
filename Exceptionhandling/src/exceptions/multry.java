package exceptions;

public class multry {
	public static void main (String args[]) {
  try {
	int a= 0;
	int b= 0;
	int c= a/b;
  }
  catch (Exception e) {
  System.out.println(e); 
  try {
	  int c=4;
	  int d=0;
	  int g=c/d;
  }
  catch (Exception e1) {
	  System.out.println(e1);
	  
  }
	  
  }

}
}