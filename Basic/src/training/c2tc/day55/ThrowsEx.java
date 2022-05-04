package training.c2tc.day55;

class A11 
{
	
}
public class ThrowsEx {

	public static void main(String[] args)throws ArrayIndexOutOfBoundsException,ArithmeticException
	{
		int[] g = new int[5];
		int a=45,b=0,c;
		int k=10;
		if(b==0)
		{
			throw new ArithmeticException("divide by zero not allowed ");
		}
		else
		{
			c=a/b;
			System.out.println("c="+c);
		}
		if(k>g.length)
		{
			
		}

	}

}
