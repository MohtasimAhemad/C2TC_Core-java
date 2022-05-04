package training.c2tc.day54;
class A
{
	void voting(int age)
	{
		
		if(age<18)
		{
			throw new ArithmeticException(" Less than 18 not allowed ");
			
		}
		else
		{
			System.out.println(" You are eligible ");
		}
	}
}
public class ThrowKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.voting(20);
	}

}
