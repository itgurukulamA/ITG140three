package example.strings;

import java.util.Scanner;

public class Comparestrings {
	public static void main(String[] args)
	{
	int count = 0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a String: ");
	String str1 = sc.nextLine();
	System.out.print("Enter another String: ");
	String str2 = sc.nextLine();
	for (int i = 0; i < str1.length(); i++)
	{
	if (str1.charAt(i) != str2.charAt(i))
	{
	count = count + 1;
	}
	}
	if (count > 0)
	{
	System.out.println("strings are not equal");
	}
	else
	{
	System.out.println("Strings are equal");
	}
	}

}
