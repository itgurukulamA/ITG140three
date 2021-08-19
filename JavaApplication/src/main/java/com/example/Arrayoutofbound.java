package com.example;

public class Arrayoutofbound {
		public static void main(String args[]) {
		try {
		int a[] = new int[5];
		a[10] = 14;
		}
		catch (Exception e) {
		System.out.println(e);
		}

}
}
