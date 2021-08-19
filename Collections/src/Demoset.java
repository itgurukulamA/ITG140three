
import java.util.*;

public class Demoset {
	public void doHashSetExample() {
		HashSet s = new HashSet();
		s.add(8);
		s.add(5);
		s.add(5);
		s.add(4);
		s.add(3);
		s.add(2);
		System.out.println(s);
		Iterator i = s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		TreeSet t = new TreeSet();
		t.add(8);
		t.add(5);
		t.add(5);
		t.add(4);
		t.add(3);
		t.add(2);
		System.out.println(t);
		LinkedHashSet h = new LinkedHashSet();
		h.add(8);
		h.add(5);
		h.add(5);
		h.add(4);
		h.add(3);
		h.add(2);
		System.out.println(h);
	}

	public static void main(String[] args) {
		Demoset set = new Demoset();
		set.doHashSetExample();
	}
}
