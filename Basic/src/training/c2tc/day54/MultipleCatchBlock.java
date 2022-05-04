package training.c2tc.day54;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=5,b=0,c;
			int[] d = new int[3];
			String str=null;
			c=a/b;
			
			System.out.println("Division ="+c);
			System.out.println(d[6]);
			System.out.println(str.length());
		}
		catch(ArithmeticException e)
		{ 
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
