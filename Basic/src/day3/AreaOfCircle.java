package day3;

import java.util.Scanner;

public class AreaOfCircle {

	public static double Area(double r)
	{
		double Area=r*r*3.14;
		return Area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius :");
		int n = sc.nextInt();
		System.out.println("Area of the circle is :"+Area(n));
	}

}
