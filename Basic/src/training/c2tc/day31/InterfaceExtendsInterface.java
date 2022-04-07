package training.c2tc.day31;


interface A 
	{
	   void funcA();
	}
	interface B extends A
	{
	   void funcB();
	}
	class C implements B
	{
	   public void funcA()
	   {
	      System.out.println("This is A");
	   }
	   public void funcB() 
	   {
	      System.out.println("This is B");
	   }
	}
	public class InterfaceExtendsInterface {
	   public static void main(String args[]) {
	      C obj = new C();
	      obj.funcA();
	      obj.funcB();
	   }
	}