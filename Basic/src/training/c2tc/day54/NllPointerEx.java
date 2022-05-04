package training.c2tc.day54;

public class NllPointerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null; //if we put here this string "abc" then String are same 
		try              //if we put here this string "dfc" then String are not same
		{
			if(str.equals("abc"))
			{
				System.out.println("String are same");
			}
			else
			{
				System.out.println("String Are not same");
			}
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}

}
