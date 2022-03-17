package training.c2tc.day3;

import java.util.Scanner;

public class AreaOfSquare {

	public static double Area(double s)
	{
		double Area=s*s;
		return Area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side :");
		int n = sc.nextInt();
		System.out.println("Area of the circle is :"+Area(n));
	}

}