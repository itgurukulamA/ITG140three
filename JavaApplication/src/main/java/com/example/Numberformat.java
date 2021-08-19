package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Numberformat {
public static void main(String a[])throws Exception {
	try {
		int a,b;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		a = Integer.parseInt(in.readLine());
		b = Integer.parseInt(in.readLine());
	}catch(NumberFormatException ex) {
		System.out.println(ex.getMessage()+ "is not a numeric value");
	}
}
}
