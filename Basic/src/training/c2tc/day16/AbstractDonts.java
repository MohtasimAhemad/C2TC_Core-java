package training.c2tc.day16;

abstract class AA
{
	abstract void m11();
	 static void m22()
	{
		System.out.println("1");
	}
	void m33()
	{
		System.out.println("2");
	}
}
class BB extends AA
{
	void m11()
	{
		System.out.println("3");
	}
	void m33()
	{
		System.out.println("4");
	}
}
public class AbstractDonts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 BB obj = new BB();
		BB.m22();
	}

}
