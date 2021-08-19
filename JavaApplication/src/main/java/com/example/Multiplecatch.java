package com.example;

public class Multiplecatch {
public static void main(String args[]) {
	try {
		int den = Integer.parseInt(args[0]);
		System.out.println(3/den);
	}catch(ArrayIndexOutOfBoundsException  e) {
		System.out.println("Divisor was 0.");
	}catch(Exception e1) {
		System.out.println("Missing Argument");
	}
	
}
}
