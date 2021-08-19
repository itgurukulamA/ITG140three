package MultiThread.example;

public class DemoRunnable {
    public static void main(String args[])throws Exception
    {
    	tha aa=new tha();
    	Thread t1=new Thread(aa);
    	t1.start();
    	thb bb=new thb();
    	Thread t2 = new Thread(bb);
    	t2.start();
    }
}
class tha implements Runnable{
	public void run() {
		int i =0;
		while(i<=0) {
			System.out.println("A"+i);
			i++;
		}
	}
}

class thb implements Runnable{
	public void run() {
		int i =0;
		while(i<=10) {
			System.out.println("B"+i);
			i++;
		}
	}
}













