import java.util.*;
class MyException extends Exception 
{ 
   

	public MyException(String s) {
		super(s);
	} 
} 
 class Bank {

	public static void main(String[] args) {
		int acntbal =10000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to withdraw");
		int wd =sc.nextInt();
		
		try {
			if(wd<=acntbal) {
				System.out.println("Withdrawn Amount is"+wd);
				acntbal=acntbal-wd;
				System.out.println("Acnt Bal="+acntbal);
			}
			else {
				throw new MyException("Invalid Amount");
			}
		}
		catch(MyException m) {
			System.out.println(m.getMessage());
		}
	}

}