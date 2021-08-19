package exceptions;

public class Numformatexception {
	public static void main(String args[]) {
		try {
			String str="hello";
			int num=Integer.parseInt(str);
		}
		catch (Exception e) {
         System.out.println(e);			
		}
		}
	}
	

