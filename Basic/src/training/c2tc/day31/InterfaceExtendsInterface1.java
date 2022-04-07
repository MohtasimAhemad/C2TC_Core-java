package training.c2tc.day31;

interface AA 
{
   void A();
}
interface BB 
{
   void B();
}
class CC implements AA,BB
{
   public void A()
   {
      System.out.println("This is A");
   }
   public void B() 
   {
      System.out.println("This is B");
   }
}
public class InterfaceExtendsInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C obj = new C();
	      obj.funcA();
	      obj.funcB();
	}

}
