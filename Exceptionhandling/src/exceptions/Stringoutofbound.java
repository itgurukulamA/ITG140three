package exceptions;

public class Stringoutofbound {
	public static void main (String args[]) {
		try {
		String a = "hello world";
		a.charAt(30);
		}
		catch (Exception e) {
		System.out.println(e);

		}

		}

}
