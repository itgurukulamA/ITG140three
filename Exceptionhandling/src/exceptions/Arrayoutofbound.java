package exceptions;

public class Arrayoutofbound {
	public static void main(String args[]) {
		try {
		int a[] = new int[5];
		a[7] = 9;
		}
		catch (Exception e) {
		System.out.println(e);
		}

		}
		}




