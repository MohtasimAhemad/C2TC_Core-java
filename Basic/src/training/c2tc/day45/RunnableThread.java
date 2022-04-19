package training.c2tc.day45;
//by using runnable thread using interface
class Y implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5 ;i++)
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
public class RunnableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y y=new Y();   //different way to creat object
		Thread t = new Thread(y);
		t.start();
		
		for(int i=0; i<5 ;i++)
		{
			System.out.println(" This is Main thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
