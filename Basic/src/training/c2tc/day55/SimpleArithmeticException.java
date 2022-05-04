package training.c2tc.day55;

public class SimpleArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int a=40,b=0;
		int c=a/b;
		System.out.println("division "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println(" end of main funtion");
	}

}
