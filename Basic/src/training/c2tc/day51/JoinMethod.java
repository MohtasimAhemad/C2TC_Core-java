package training.c2tc.day51;
class A extends Thread
{
	public void run()
	{
		String name = Thread.currentThread().getName();
		for(int i=1;i<3;i++)
		{
			System.out.println(name);
		}
	}
}
public class JoinMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A t1= new A();
		A t2 = new A();
		A t3 = new A();
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		
	}

}
