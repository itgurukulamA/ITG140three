import java.util.*;

public class Mapdemo {
	public static void main(String args[]) {
		HashMap hmap = new HashMap();
		hmap.put(1, "one");
		hmap.put(2, "two");
		hmap.put(3, "three");
		Set s = hmap.entrySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
