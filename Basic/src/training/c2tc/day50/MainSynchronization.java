package training.c2tc.day50;

class Table extends Thread
{
	synchronized void printTable(int n) // synchronize method
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MainSynchronization {

	public static void main(String[] args) {
		Table ob=new Table();
		
		Thread t1=new Thread(ob)
				{
			public void run()
			{
				ob.printTable(5);
			}
				};
				
				
				Thread t2=new Thread(ob)
				{
			public void run()
			{
				ob.printTable(10);
			}
				};

				t1.start();
				t2.start();
		
	}

}
