package com.example;


	import java.io.File;
	import java.io.FileReader;
	public class Fileoutofbound {
	
	public static void main (String args[]) {
	try {

	File file = new File("E://file.txt");

	FileReader fr = new FileReader(file);
	} catch (Exception e) {
	System.out.println(e);
	}
	}
	}


