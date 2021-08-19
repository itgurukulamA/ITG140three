package File;
 
import java.io.File;

import java.io.IOException;

public class CreateFile {
	 public static void main(String args[]) {
		    try {
		      File fl = new File("filename.txt");
		      if (fl.createNewFile()) 
		      {
		        System.out.println("File created");
		      } 
		      else {
		        System.out.println("File already exists");
		      }
		    } 
		    catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

		     
		    }
		  }


