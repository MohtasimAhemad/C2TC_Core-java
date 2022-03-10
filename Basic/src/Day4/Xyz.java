package Day4;

class X 
{
	int i;
	public void m1()
	{
		i=10;
		System.out.println((i));
	}
	public void m2()
	{
		m1();
	}
}
public class Xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
X a = new X();
a.m2();
	}

}
