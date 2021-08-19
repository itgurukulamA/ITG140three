package lists;

import java.util.ArrayList;

class Iterator {
public static void main(String args[]) {
	 ArrayList<String> fruits = new ArrayList<String>();
	  fruits.add("Apple");
	  fruits.add("mango");
	  fruits.add("Orange");
	  fruits.add("Grapes");
	  fruits.add("Guava");
	 
	  for (String element: fruits) {
	    System.out.println(element);
	    }
	 }
}


