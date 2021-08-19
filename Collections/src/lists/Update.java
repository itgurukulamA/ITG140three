package lists;

import java.util.ArrayList;

public class Update {
public static void main(String args[]) {
	ArrayList<String>flowers= new ArrayList<String>();
	flowers.add("Rose");
	flowers.add("Jasmine");
	flowers.add("Chrysanthemum");
    flowers.add("tulip");
System.out.println(flowers);
    flowers.add(3,"lilly");
    System.out.println(flowers);
}
}
