package File;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class ReadFile {
	 public static void main(String args[]) {
		    try {
		      File fl= new File("filename.txt");
		      Scanner myReader = new Scanner(fl);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    }
		    catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }

}
