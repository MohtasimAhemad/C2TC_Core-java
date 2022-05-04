package training.c2tc.day52;
class M extends Thread
{
	public void run()
	{
		System.out.println("Thread M");
		System.out.println("i in Thread M");
		for(int i=1; i<5 ;i++)
		{
			System.out.println("i"+i);
//			Threadm.sleep();
		}
		System.out.println("Thread M completed ");
		
	}
}
class N extends Thread
{
	public void run()
	{
		System.out.println("Thread N");
		System.out.println("i in Thread N");
		for(int i=1; i<5 ;i++)
		{
			System.out.println("j"+i);
		}
		System.out.println("Thread N completed ");
	}
}
public class ThreadLifeCycle1 {

	public static void main(String[] args) {
		M Threadm= new  M();
		N Threadn = new N();
		Threadm.start();
		Threadn.start();
		
		

	}

}
