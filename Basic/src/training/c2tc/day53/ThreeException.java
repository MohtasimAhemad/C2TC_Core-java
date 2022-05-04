package training.c2tc.day53;

public class ThreeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		which exception take first priority try with multiple catch
		try
		{
			int a=4,b=0,c;
			int[] d= new int[3];
			String str=null;
			c=a/b;
			System.out.println("division ="+c);
			System.out.println(d[7]);
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
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		
		

	}

}
