public class StringIndexOutOfBound {

	public static void main(String args[]) {
		try {
			String a = "hello everyone";
			char c = a.charAt(16);
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		}
	}
}
