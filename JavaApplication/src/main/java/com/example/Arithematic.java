package com.example;

public class Arithematic {
	public static void main (String a[]) {
		try {
			System.out.println(5/0);
	       System.out.println("please print");
	}catch(ArithmeticException ae) {
		System.out.println(ae);
	}
	}
}
