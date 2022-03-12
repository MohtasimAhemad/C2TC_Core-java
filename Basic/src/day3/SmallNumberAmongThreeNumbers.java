package day3;

import java.util.Scanner;

public class SmallNumberAmongThreeNumbers {
	public static int SmallNumber(int x, int y, int z)
	{
		if(x<y && x<z)
		{
			return x;
		}
		else if(y<x && y<z)
		{
			return y;
		}
		else
		{
			 return z;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Three Number ");
		int a=sc.nextInt();	
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int num=SmallNumber(a,b,c);
		System.out.println("Small number is : "+num);
	}

}
