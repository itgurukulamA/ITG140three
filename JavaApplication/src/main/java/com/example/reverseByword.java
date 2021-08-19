package com.example;

public class reverseByword {
public static void main(String args[]) {
	String str = "harika kosuru";
	int len= str.length();
	for(int i=len-1;i>=0;i--) {
		System.out.println(str.charAt(i));
	}
}
}
