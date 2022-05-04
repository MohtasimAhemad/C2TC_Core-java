package training.c2tc.day55;

import java.util.Scanner;

public class AgeExceptionTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("enter age");
			int age=sc.nextInt();
			if(age<18)
			{
				System.out.println("Invalid age");
			}
			else
			{
				System.out.println("valid age");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		}

}
