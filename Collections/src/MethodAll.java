import java.util.ArrayList;

public class MethodAll {

	public static void main(String args[]) {
		ArrayList li = new ArrayList();
		li.add("bhanu");
		li.add("bhavani");
		li.add("nandu");
		li.add("yamini");
		System.out.println("arraylist:" + li);
		System.out.println("arraylist size:" + li.size());
		li.removeAll(li);
		System.out.println("arraylist:" + li);
		System.out.println("arraylist size:" + li.size());
		li.add("hai");
		li.add("vani");
		li.add("hello");
		li.add("satya");
		li.addAll(li);
		System.out.println("arraylist:" + li);
		System.out.println("arraylist size:" + li.size());

	}

}
