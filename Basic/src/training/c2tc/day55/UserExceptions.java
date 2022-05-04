package training.c2tc.day55;

import java.awt.color.CMMException;

public class UserExceptions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try
		{
			throw new Exception();
		}
		catch(CMMException e)
		{
			System.out.println(e);
		}
	}
}
