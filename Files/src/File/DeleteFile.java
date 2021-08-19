package File;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) { 
	    File fl= new File("filename.txt"); 
	    if (fl.delete()) { 
	      System.out.println("Deleted the file");
	    } 
	    else {
	      System.out.println("Failed to delete the file");
	    } 
	  } 
	}

