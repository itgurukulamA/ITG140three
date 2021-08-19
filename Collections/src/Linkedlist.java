import java.util.*;

public class Linkedlist {
	public static void main(String args[]) {
		LinkedList al = new LinkedList();
		al.add("Raveti");
		al.add("Vijaya");
		al.add("Ram");
		al.add("Ajit");
		System.out.println("Linkedlist:" + al);
		System.out.println("Linkedlist size:" + al.size());
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
