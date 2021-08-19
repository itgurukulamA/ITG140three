package lists;

import java.util.ArrayList;

class Insertinfirstposition {
	public static void main (String args[]) {
		ArrayList<String>animals= new ArrayList<String>();
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Elephant");
		animals.add("Wolf");
		animals.add("Cheetah");
		animals.add("Horse");
		System.out.println(animals);
		animals.add(0,"Zeebra");
		animals.add(6,"Donkey");
		System.out.println(animals);
		
	}

}
