package com.example;

public class palindrome {
public static void main(String a[]) {
	String pal = "harika";
	StringBuffer sb1 = new StringBuffer(pal);
	String rev = sb1.reverse().toString();
	if(pal.equals(rev)) {
		System.out.println("Panlindrome");
	}else {
		System.out.println("not palindrome");
	}
}
}
