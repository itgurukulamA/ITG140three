package multiThread;

public class  RunInterface extends Thread {
	public void run() {
	System.out.println("Runnable Interface");
}
public static void main(String args[]) {
RunInterface ri= new RunInterface();
Thread t= new Thread(ri);
t.start();
}
}
