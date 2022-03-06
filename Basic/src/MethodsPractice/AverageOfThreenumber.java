package MethodsPractice;

import java.util.Scanner;

public class AverageOfThreenumber {

	public static int Avg(int x, int y, int z)
	{
		int sum = x+y+z;
		int avg = sum/3;
		return avg;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Average of Three Number is "+Avg(a,b,c));
		
	}

}
