package example.strings;

import java.util.Scanner;

public class Remofchar2 {
	public static void main (String args[]) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a string1");
		String str= sc.nextLine();
		System.out.println("Enter a String2");
		String str1= sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str1.length();j++)
			{
				if(str.charAt(i)==str1.charAt(j))
				{
					System.out.print(str.null(i));
				}
			}
		}
		}
	}

