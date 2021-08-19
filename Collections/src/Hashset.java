import java.util.*;

public class Hashset {
	public void doHashSetExample() {
		HashSet s = new HashSet();
		s.add("bhavani");
		s.add("vani");
		s.add("anu");
		s.add("bhavana");
		s.add("bhargavi");
		s.add("bharathi");
		System.out.println(s);
		Iterator i = s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(s.isEmpty());
		System.out.println(s.contains("bhavana"));
		System.out.println(s.remove("bhavani"));
		System.out.println(s);
		System.out.println(s);
	}

	public static void main(String[] args) {
		Hashset set = new Hashset();
		set.doHashSetExample();
	}

}
