package training.c2tc.day16;

abstract class Machine
{
	static int p;
	final int i=100;
	private int d;
	
	public static int getP() {
		return p;
	}
	public static void setP(int p) {
		Machine.p = p;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getI() {
		return i;
	}
	
	void method1()
	{
		System.out.println(" it is a machine");
	}
	abstract void method2();
	
}

class Lapy extends Machine
{

	@Override
	void method2() {
		// TODO Auto-generated method stub
		System.out.println("it is a lapy");
		
	}
	
}
public class AbstractClassWithSetAndGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lapy obj = new Lapy();
		obj.method1();
		obj.method2();
		obj.setD(1111);
		System.out.println(obj.getD());
		obj.setP(1);
		System.out.println(obj.getP());
		obj.getI();

	}

}
