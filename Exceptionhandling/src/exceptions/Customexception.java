package exceptions;

import java.util.Scanner;

public class Customexception {
	  public void MinBalanceException ()
	  {
	    System.out.println ("Balance is low");
	  }
	}
	public class Main
	{
	  public static void main (String[]args)
	  {
	    try
	    {
	      int acc[] = { 100, 101, 102, 103, 104, 105 }; 
	      double balance[] = { 900, 2000, 1500, 1560, 1765.50 };
	      System.out.println ("Account No\t" + "Balance\t");
	      for (int i = 0; i < 5; i++)
	   {
	     System.out.println (acc[i] + "\t\t" + balance[i] + "\t");
	     if (balance[i] < 1000)
	     {
	         throw new MinBalanceException ();
	     }
	   }
	    }
	    catch (MinBalanceException e)
	    {
	      System.out.println ("Exception caught");
	    }
		}
	}
	
}
}
