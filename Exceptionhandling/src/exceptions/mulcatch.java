package exceptions;

public class mulcatch {
	public static void main(String args[]) {
		try {
			int a=9;
			int b=0;
			int c = a/b;
			   
			 }
			    catch (ArrayIndexOutOfBoundsException e) {
			    System.out.println(e);
			    }
                catch (Exception e1) {
                	System.out.println(e1);
          
                }
		//finally {
			System.out.println("bhuvana");
			
		}
     	
					
	}

