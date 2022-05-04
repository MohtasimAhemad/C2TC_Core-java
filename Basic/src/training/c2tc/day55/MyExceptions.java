package training.c2tc.day55;


public class MyExceptions extends Exception {

	MyExceptions(int n)
	{
		if(n==100)
		{
			System.out.println("Exception 1 Generated ");
		}
		else if(n==500)
		{
			System.out.println("Exception 2 Generated");
		}
		else if(n==1000)
		{
			System.out.println("Exception 3 Generated");
		}
	}

}