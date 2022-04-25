package training.c2tc.day50;
/*method level synchronization
 block level synchronization it is beneficial waiting state thread get reduce.
*/
class msg
{
	public void show(String name)
	{
		System.out.println("hello ");
		System.out.println("welcome to c2tc ");
	synchronized(this)
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("how are you :"+name);
		}
	}
	}
}

class Ourthread extends Thread
{
	msg m;
	String name;
	 Ourthread(msg m,String name){
		this.m=m;
		this.name=name;
	}
	public void run() {
		m.show(name);
	}
}
public class Mainblock {
	public static void main(String[] args) {
	msg m = new msg();
	Ourthread t5 = new Ourthread(m,"seeta");
		Ourthread t6 = new Ourthread(m,"geeta");
		t5.start();
		t6.start();
		
	}
}
