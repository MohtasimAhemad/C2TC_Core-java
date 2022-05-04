package training.c2tc.day53;

public class Main {

	public static void main(String[] args) {
		// Arithmetic exception
		try
		{
			int a=67,b=0,c;
			c=a/b;
			System.out.println("result ="+c);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("exicuted towards the end");

	}

}
