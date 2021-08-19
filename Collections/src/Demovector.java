import java.util.*;

public class Demovector {
	public static void main(String args[]) {
		Vector vect = new Vector();
		String s1 = "lakshmi";
		String s2 = "Bhavani";
		vect.add(s1);
		vect.add(s2);
		vect.add("bhanu");
		System.out.println(vect);
		System.out.println(vect.size());
		System.out.println(vect.elementAt(2));
		System.out.println(vect.firstElement());
		System.out.println(vect.lastElement());
		vect.insertElementAt("buvana", 2);
		System.out.println(vect);
		vect.setElementAt("anu", 0);
		System.out.println(vect);
		Enumeration e = vect.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
