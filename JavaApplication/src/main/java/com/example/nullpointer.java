package com.example;

public class nullpointer {
	
		public static void main (String args[]) {
		try {
		   String a = null;
		   a.charAt(10);
		}
		catch(Exception e) {
		System.out.println(e);
		}
		}

		}

