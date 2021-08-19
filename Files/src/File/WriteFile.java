package File;

import java.io.*;

import java.io.IOException;

public class WriteFile {
	public static void main(String args[]) {
		
	try {
		FileWriter wf = new FileWriter("filename.txt");
	      wf.write("files play an important role in java");
	      wf.close();
	      System.out.println("Successfully written the file.");
	    } 
	catch (IOException e) {
	      System.out.println("An error occurred.");
	      
	    }
	  }
	
}

