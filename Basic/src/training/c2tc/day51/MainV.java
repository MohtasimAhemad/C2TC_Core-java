package training.c2tc.day51;
//by extending 
class V extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		
			System.out.println("This is child method");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class MainV {

	public static void main(String[] args) {

		V t=new V();
		t.start();
//		t.run();
		for(int i=0;i<5;i++)
		{
			System.out.println(" This is main thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
