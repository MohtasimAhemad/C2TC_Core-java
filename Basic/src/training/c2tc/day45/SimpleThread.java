package training.c2tc.day45;
class z extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("this is child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
		}
	}
}
public class SimpleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		z t = new z();
		t.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("this is main thread");
			try {
				Thread.sleep(1000);
				Thread.currentThread();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
