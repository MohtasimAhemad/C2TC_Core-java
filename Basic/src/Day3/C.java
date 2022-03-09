package Day3;
class A
{
		public void m1()
		{
			System.out.println("Hello everyone!");
		}
}
class B extends A
{
	public void m2()
	{
		System.out.println("Welcome to C2TC");
	}
	public void m1()
	{
		System.out.println("Good moring ");
	}
	public void m1(String s)
	{
		System.err.println(s);
	}
}
class D
{
		public void m1()
		{
			System.out.println("Hello everyone!");
		}
}
public class C
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a,a1;
		B b;
		a= new A();
		b=new B();
		a1=a;
//		a1.m1();
//		a1=b;
		a1.m1();
		a1.m1();
		b.m1();
		
//		D d = new D();
//		d.m1();
	}

}
