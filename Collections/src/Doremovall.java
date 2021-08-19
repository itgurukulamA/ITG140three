import java.util.*;

public class Doremovall {
	public static void main(String args[]) {
		ArrayList li = new ArrayList();
		li.add("hai");
		li.add("bhavani");
		li.add(113);
		li.add('D');
		System.out.println("arraylist:" + li);
		System.out.println("arraylist size:" + li.size());
		li.removeAll(li);
		System.out.println("arraylist:" + li);
		System.out.println("arraylist size:" + li.size());
		li.add("hai");
		li.add("bhavani");
		li.add(113);
		li.add('D');
		li.addAll(li);
		System.out.println("arraylist:" + li);
		System.out.println("arraylist size:" + li.size());
		li.clear();
		System.out.println("arraylist:"+li);
		System.out.println(li.retainAll(li));
		System.out.println(li.clone());

	}
}
