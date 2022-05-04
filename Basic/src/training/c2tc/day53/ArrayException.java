package training.c2tc.day53;

import java.util.Scanner;

public class ArrayException {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in)) {
		try
		{
			int[] a= new int[3];
			System.out.println("enter the array elemnts:");
			for(int i=0; i<=5;i++)
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

}
