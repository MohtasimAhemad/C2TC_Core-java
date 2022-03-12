package day4;

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
		m1(); //call method m1
	}
}
public class ActivityOnVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
X a = new X();   //Create An object
a.m2();          //call method with object 
	}

}
