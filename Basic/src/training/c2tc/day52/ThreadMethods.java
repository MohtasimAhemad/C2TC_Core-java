package training.c2tc.day52;

class Mm extends Thread
{
	public void run()
	{
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
public class ThreadMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mm t1=new Mm();
		Mm t2=new Mm();
		Mm t3=new Mm();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		
		t1.start();
		t2.start();
		t3.start();

	}

}
