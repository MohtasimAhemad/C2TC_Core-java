package training.c2tc.day51;

class Thread1 extends Thread
{
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i=1;i<3;i++)
		{
			System.out.println(name);
			Thread.yield();
			
		}
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i=1;i<3;i++)
		{
			System.out.println(name);
			Thread.yield();
			
		}
	}
}
public class MainYield {

	public static void main(String[] args) {
		Thread1 t1 =new Thread1();
		
		
		Thread2 p1 =new Thread2();
		
		t1.setName("thread 1");
		p1.setName("thread 2");
		
		t1.start();
		p1.start();
		
	}

}
