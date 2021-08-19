package com.example;

 
	import java.util.*;
	public class characters {
	public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	Scanner a = new Scanner(System.in);
	    String x="";
	    String y="";
	    String z="";
	    System.out.println("Enter first string : ");
	    x=s.nextLine();
	    System.out.println("Enter second String : ");
	    y=a.nextLine();
	   
	    int o= x.length();
	 
	    for(int i=0;i<o;i++)
	    {
	    char ch = x.charAt(i);
	    if(y.indexOf(ch)!=-1)
	    {
	    z=z+String.valueOf(ch);
	    }
	    }
	    System.out.print(" COMMON LETTER'S ARE :"+z);
	}
	}

