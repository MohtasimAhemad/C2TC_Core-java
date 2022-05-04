package training.c2tc.day54;

import java.util.Scanner;

public class ArrayIndexMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
			int[] a = new int[3];
			System.out.println("enter array elements");
			for(int i=0;i<5;i++)
			{
				a[i]=sc.nextInt();
				
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}

	}

}
