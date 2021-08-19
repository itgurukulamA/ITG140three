
public class Comwords {
	public static void main(String args[]) {
		int count=0;
		String[] str1 = {"hello", "new",  "brave", "world"};
		String[] str2 =  {"hai", "world"};
//		String s1[] = str1.split("");
//		String s2[] = str2.split("");
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if (str1[i]== str2[j]) {
				 count++;
				}if(count>0) {
					System.out.println(str1[i]);
				}
			}
		}
	}
}
