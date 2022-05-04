package training.c2tc.day53;

public class NullException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		try
		{
			if(str.equals("abc"))
			{
				System.out.println("string are same");
			}
			else
			{
				System.out.println("string not same");
			}
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}

	}

}
