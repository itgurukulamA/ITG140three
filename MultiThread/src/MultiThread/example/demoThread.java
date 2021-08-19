package MultiThread.example;

public class demoThread {
	public static void main(String arg[]) {
		Tha aa=new Tha();
		aa.start();
		Thb bb=new Thb();
		bb.start();
	}
}
class Tha extends Thread{
	public void run()
	{
		try {
			for (int i=0;i<=10;i++) {
				if(i==2) {
					Thread.sleep(2000);
					System.out.println("Thread sleep at A2");
				}
				System.out.println("A"+i);
			}
			
		}catch(Exception e) {
		}
		}
	
	}
class Thb extends Thread{
	public void run()
	{
		try {
			for (int i=0;i<=10;i++) {
				if(i==8) {
					
					System.out.println("Thread stopped at B8");
					stop();
				}
				System.out.println("B"+i);
			}
			
		}catch(Exception ex) {
		}
		}
	
	}



